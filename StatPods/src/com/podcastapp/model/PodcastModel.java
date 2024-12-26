package com.podcastapp.model;

import java.io.Serializable;

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

    // Default constructor
    public PodcastModel(String podId, String podName, String genre1, String hostName, String uploadDate, String listening, double ratings, String podStudio) {
        this.podcastId = 0;
        this.podcastName = "";
        this.genre = "";
        this.hostName = "";
        this.uploadDate = "";
        this.listening = 0;
        this.ratings = 0.0;
        this.podcastStudios = "";
    }

    // Constructor with all fields
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

    // Getters and setters
    public int getPodcastId() {
        return podcastId;
    }

    public void setPodcastId(int podcastId) {
        this.podcastId = podcastId;
    }

    public String getPodcastName() {
        return podcastName;
    }

    public void setPodcastName(String podcastName) {
        this.podcastName = podcastName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public int getListening() {
        return listening;
    }

    public void setListening(int listening) {
        this.listening = listening;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public String getPodcastStudios() {
        return podcastStudios;
    }

    public void setPodcastStudios(String podcastStudios) {
        this.podcastStudios = podcastStudios;
    }
}
