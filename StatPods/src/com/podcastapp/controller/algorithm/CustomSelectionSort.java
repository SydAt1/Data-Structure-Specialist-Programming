package com.podcastapp.controller.algorithm;

import com.podcastapp.model.PodcastModel;
import java.util.List;

/**
 * Handles sorting of PodcastModel objects using the selection sort algorithm.
 * Sorts by Podcast ID or Podcast Name in ascending or descending order.
 */
public class CustomSelectionSort {

    /**
     * Sorts a list of PodcastModel objects by their Podcast ID in ascending or
     * descending order.
     *
     * @param podcastList the list of PodcastModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<PodcastModel> sortByPodcastId(List<PodcastModel> podcastList, boolean isDesc) {
        if (podcastList == null || podcastList.isEmpty()) {
            throw new IllegalArgumentException("Podcast list cannot be null or empty.");
        }

        for (int i = 0; i < podcastList.size() - 1; i++) {
            int extremumIndex = findExtremumIndexById(podcastList, i, isDesc);
            if (i != extremumIndex) {
                swap(podcastList, i, extremumIndex);
            }
        }

        return podcastList;
    }

    /**
     * Sorts a list of PodcastModel objects by their Podcast Name in ascending or
     * descending order.
     *
     * @param podcastList the list of PodcastModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<PodcastModel> sortByName(List<PodcastModel> podcastList, boolean isDesc) {
        if (podcastList == null || podcastList.isEmpty()) {
            throw new IllegalArgumentException("Podcast list cannot be null or empty.");
        }

        for (int i = 0; i < podcastList.size() - 1; i++) {
            int extremumIndex = findExtremumIndexByName(podcastList, i, isDesc);
            if (i != extremumIndex) {
                swap(podcastList, i, extremumIndex);
            }
        }

        return podcastList;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) by Podcast ID
     * in the list from the start index.
     *
     * @param podcastList the list of PodcastModel objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndexById(List<PodcastModel> podcastList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < podcastList.size(); j++) {
            if (shouldSwap(podcastList.get(j).getPodcastId(), podcastList.get(extremumIndex).getPodcastId(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) by Podcast Name
     * in the list from the start index.
     *
     * @param podcastList the list of PodcastModel objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndexByName(List<PodcastModel> podcastList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < podcastList.size(); j++) {
            if (shouldSwapByName(podcastList.get(j).getPodcastName(), podcastList.get(extremumIndex).getPodcastName(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order for Podcast ID.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order for Podcast Name.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwapByName(String current, String extremum, boolean isDesc) {
        return isDesc ? current.compareTo(extremum) > 0 : current.compareTo(extremum) < 0;
    }

    /**
     * Swaps two elements in the list.
     *
     * @param podcastList the list of PodcastModel objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<PodcastModel> podcastList, int i, int j) {
        PodcastModel temp = podcastList.get(i);
        podcastList.set(i, podcastList.get(j));
        podcastList.set(j, temp);
    }
}
