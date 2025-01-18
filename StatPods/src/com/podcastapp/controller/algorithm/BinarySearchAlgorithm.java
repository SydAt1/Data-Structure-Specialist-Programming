package com.podcastapp.controller.algorithm;

import com.podcastapp.model.PodcastModel;
import java.util.ArrayList;

/**
 *
 * @author Siddhartha Singh
 * @lmuID 23048583
 */
public class BinarySearchAlgorithm {

    /**
     * Performs a binary search on a sorted list of PodcastModel by Podcast ID.
     *
     * @param searchValue The ID to search for.
     * @param podcastList The sorted list of PodcastModel objects.
     * @param low The starting index of the search range.
     * @param high The ending index of the search range.
     * @return The matching PodcastModel or null if not found.
     */
    public static PodcastModel performBinarySearchById(int searchValue, ArrayList<PodcastModel> podcastList, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midId = podcastList.get(mid).getPodcastId();

            if (midId == searchValue) {
                return podcastList.get(mid);
            } else if (midId < searchValue) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    /**
     * Performs a binary search on a sorted list of PodcastModel by Podcast Name.
     *
     * @param searchValue The name to search for.
     * @param podcastList The sorted list of PodcastModel objects.
     * @param low The starting index of the search range.
     * @param high The ending index of the search range.
     * @return The matching PodcastModel or null if not found.
     */
    public static PodcastModel performBinarySearchByName(String searchValue, ArrayList<PodcastModel> podcastList, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            String midName = podcastList.get(mid).getPodcastName();

            int comparison = midName.compareToIgnoreCase(searchValue);
            if (comparison == 0) {
                return podcastList.get(mid);
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}