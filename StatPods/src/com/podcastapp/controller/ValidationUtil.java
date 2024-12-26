package com.podcastapp.controller;

import java.util.regex.Pattern;

public class ValidationUtil {
    private static final Pattern POD_ID_PATTERN = Pattern.compile("^\\d{3}$");
    private static final Pattern POD_NAME_PATTERN = Pattern.compile("^[a-zA-Z0-9]+$");
    private static final Pattern GENRE_PATTERN = Pattern.compile("^(Comedy|Education|Technology|Horror|Audiobook|Interview|Culture)$");
    private static final Pattern HOST_NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern LISTENING_HOURS_PATTERN = Pattern.compile("^\\d{1,4}$");
    private static final Pattern DATE_PATTERN = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
    private static final Pattern RATINGS_PATTERN = Pattern.compile("^[1-5]$");
    private static final Pattern STUDIOS_PATTERN = Pattern.compile("^[\\w\\s.,'-]+$"); // Alphanumeric, spaces, and common punctuation


    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the podcast ID is exactly 7 digits.
     *
     * @param podId the podcast ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPodcastId(int podId) {
        return POD_ID_PATTERN.matcher(String.valueOf(podId)).matches();
    }

    /**
     * Validates if the podcast name contains only alphanumeric characters.
     *
     * @param podName the podcast name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPodcastName(String podName) {
        return !isNullOrEmpty(podName) && POD_NAME_PATTERN.matcher(podName).matches();
    }

    /**
     * Validates if the genre is one of the allowed options.
     *
     * @param genre the genre to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidGenre(String genre) {
        return !isNullOrEmpty(genre) && GENRE_PATTERN.matcher(genre).matches();
    }

    /**
     * Validates if the host name contains only alphabets and spaces.
     *
     * @param hostName the host name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidHostName(String hostName) {
        return !isNullOrEmpty(hostName) && HOST_NAME_PATTERN.matcher(hostName).matches();
    }

    /**
     * Validates if the listening hours is between 1 and 1000 (inclusive).
     *
     * @param listeningHours the listening hours to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidListeningHours(int listeningHours) {
        return LISTENING_HOURS_PATTERN.matcher(String.valueOf(listeningHours)).matches();
    }
    
    /**
     * Validates if the date is in the format yyyy-MM-dd.
     *
     * @param date the date to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidDate(String date) {
        return !isNullOrEmpty(date) && DATE_PATTERN.matcher(date).matches();
    }
    
    /**
     * Validates if the ratings are between 1.0 and 5.0 (inclusive).
     *
     * @param ratings the ratings to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidRatings(double ratings) {
        return ratings >= 1.0 && ratings <= 5.0;
    }

    /**
     * Validates if the podcast studio is a valid string (alphanumeric and common punctuation).
     *
     * @param studio the podcast studio to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPodcastStudio(String studio) {
        return !isNullOrEmpty(studio) && STUDIOS_PATTERN.matcher(studio).matches();
    }
}