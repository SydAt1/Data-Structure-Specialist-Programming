package com.podcastapp.controller.algorithm;

import com.podcastapp.model.PodcastModel;
import java.util.List;

/**
 * Handles sorting of PodcastModel objects using the insertion sort algorithm.
 * Sorts by Listening Hours in ascending or descending order.
 */
public class CustomInsertionSort {

    /**
     * Sorts a list of PodcastModel objects by their listening hours in ascending
     * or descending order using the insertion sort algorithm.
     *
     * @param podcastList the list of PodcastModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<PodcastModel> sortByListeningHours(List<PodcastModel> podcastList, boolean isDesc) {
        if (podcastList == null || podcastList.isEmpty()) {
            throw new IllegalArgumentException("Podcast list cannot be null or empty.");
        }

        for (int i = 1; i < podcastList.size(); i++) {
            PodcastModel current = podcastList.get(i);
            int j = i - 1;

            // Compare and shift elements based on sort order
            while (j >= 0 && shouldSwap(current.getListening(), podcastList.get(j).getListening(), isDesc)) {
                podcastList.set(j + 1, podcastList.get(j));
                j--;
            }

            podcastList.set(j + 1, current);
        }

        return podcastList;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current listening hours
     * @param compared the listening hours to compare against
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the compared value;
     * false otherwise
     */
    private boolean shouldSwap(int current, int compared, boolean isDesc) {
        return isDesc ? current > compared : current < compared;
    }
}
