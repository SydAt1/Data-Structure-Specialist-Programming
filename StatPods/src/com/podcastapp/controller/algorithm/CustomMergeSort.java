package com.podcastapp.controller.algorithm;

import com.podcastapp.model.PodcastModel;
import java.util.List;
import java.util.ArrayList;

/**
 * Handles sorting of PodcastModel objects using the merge sort algorithm.
 * Sorts by Ratings in ascending or descending order.
 */
public class CustomMergeSort {

    /**
     * Sorts a list of PodcastModel objects by their Ratings in ascending or
     * descending order.
     *
     * @param podcastList the list of PodcastModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<PodcastModel> sortByRatings(List<PodcastModel> podcastList, boolean isDesc) {
        if (podcastList == null || podcastList.isEmpty()) {
            throw new IllegalArgumentException("Podcast list cannot be null or empty.");
        }

        if (podcastList.size() <= 1) {
            return podcastList;
        }

        int mid = podcastList.size() / 2;
        List<PodcastModel> left = new ArrayList<>(podcastList.subList(0, mid));
        List<PodcastModel> right = new ArrayList<>(podcastList.subList(mid, podcastList.size()));

        sortByRatings(left, isDesc);
        sortByRatings(right, isDesc);
        merge(podcastList, left, right, isDesc);

        return podcastList;
    }

    /**
     * Merges two sorted lists into a single sorted list based on ratings.
     *
     * @param result the list to store the merged result
     * @param left the left sublist
     * @param right the right sublist
     * @param isDesc specifies the sort order
     */
    private void merge(List<PodcastModel> result, List<PodcastModel> left, List<PodcastModel> right, boolean isDesc) {
        int leftIndex = 0, rightIndex = 0, resultIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (shouldSwap(left.get(leftIndex).getRatings(), right.get(rightIndex).getRatings(), isDesc)) {
                result.set(resultIndex++, left.get(leftIndex++));
            } else {
                result.set(resultIndex++, right.get(rightIndex++));
            }
        }

        while (leftIndex < left.size()) {
            result.set(resultIndex++, left.get(leftIndex++));
        }

        while (rightIndex < right.size()) {
            result.set(resultIndex++, right.get(rightIndex++));
        }
    }

    /**
     * Determines whether the current value should be placed before the comparison value
     * based on sort order for Ratings.
     *
     * @param current the current value
     * @param comparison the comparison value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should be placed first; false otherwise
     */
    private boolean shouldSwap(double current, double comparison, boolean isDesc) {
        return isDesc ? current > comparison : current < comparison;
    }
}