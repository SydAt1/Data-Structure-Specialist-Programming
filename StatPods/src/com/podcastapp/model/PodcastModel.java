package com.podcastapp.model;

import java.io.Serializable;
/**
 * Represents a Podcast model with details about the podcast, including its ID,
 * name, genre, host, upload date, listening count, ratings, and studio name.
 * 
 * Implements Serializable for object serialization.
 * 
 * @author Siddhartha Singh
 * @lmuID 23048583
 */
public class PodcastModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private int podcastId;
    private String podcastName;
    private String genre;
    private String hostName;
    private String uploadDate;
    private int listening;
    private double ratings; // Updated to double for decimal values
    private String podcastStudios;


    /**
     * Constructor initializing the podcast fields with provided values.
     * 
     * @param podcastId The ID of the podcast.
     * @param podcastName The name of the podcast.
     * @param genre The genre of the podcast.
     * @param hostName The name of the podcast host.
     * @param uploadDate The upload date of the podcast.
     * @param listening The number of times the podcast has been listened to.
     * @param ratings The ratings of the podcast.
     * @param podcastStudios The name of the podcast studio.
     */
    public PodcastModel(int podcastId, String podcastName, String genre, String hostName, String uploadDate, int listening, double ratings, String podcastStudios) {
        this.podcastId = podcastId;
        this.podcastName = podcastName;
        this.genre = genre;
        this.hostName = hostName;
        this.uploadDate = uploadDate;
        this.listening = listening;
        this.ratings = ratings;
        this.podcastStudios = podcastStudios;
    }

    /**
     * Gets the podcast ID.
     * 
     * @return The ID of the podcast.
     */
    public int getPodcastId() {
        return podcastId;
    }

    /**
     * Sets the podcast ID.
     * 
     * @param podcastId The ID to set for the podcast.
     */
    public void setPodcastId(int podcastId) {
        this.podcastId = podcastId;
    }

    /**
     * Gets the name of the podcast.
     * 
     * @return The name of the podcast.
     */
    public String getPodcastName() {
        return podcastName;
    }

    /**
     * Sets the name of the podcast.
     * 
     * @param podcastName The name to set for the podcast.
     */
    public void setPodcastName(String podcastName) {
        this.podcastName = podcastName;
    }

    /**
     * Gets the genre of the podcast.
     * 
     * @return The genre of the podcast.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the podcast.
     * 
     * @param genre The genre to set for the podcast.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Gets the name of the podcast host.
     * 
     * @return The name of the podcast host.
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the name of the podcast host.
     * 
     * @param hostName The name to set for the podcast host.
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * Gets the upload date of the podcast.
     * 
     * @return The upload date of the podcast.
     */
    public String getUploadDate() {
        return uploadDate;
    }

    /**
     * Sets the upload date of the podcast.
     * 
     * @param uploadDate The upload date to set for the podcast.
     */
    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * Gets the number of times the podcast has been listened to.
     * 
     * @return The number of times the podcast has been listened to.
     */
    public int getListening() {
        return listening;
    }

    /**
     * Sets the number of times the podcast has been listened to.
     * 
     * @param listening The listening count to set for the podcast.
     */
    public void setListening(int listening) {
        this.listening = listening;
    }   

    /**
     * Gets the ratings of the podcast.
     * 
     * @return The ratings of the podcast.
     */
    public double getRatings() {
        return ratings;
    }

    /**
     * Sets the ratings of the podcast.
     * 
     * @param ratings The ratings to set for the podcast.
     */
    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    /**
     * Gets the name of the podcast studio.
     * 
     * @return The name of the podcast studio.
     */
    public String getPodcastStudios() {
        return podcastStudios;
    }

    /**
     * Sets the name of the podcast studio.
     * 
     * @param podcastStudios The name of the podcast studio to set.
     */
    public void setPodcastStudios(String podcastStudios) {
        this.podcastStudios = podcastStudios;
    }
}
