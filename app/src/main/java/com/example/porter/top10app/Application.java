package com.example.porter.top10app;

/**
 * Created by Porter on 1/26/2018.
 */

public class Application {

    private String name;
    private String artist;
    private String releaseData;

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setReleaseData(String releaseData) {
        this.releaseData = releaseData;
    }


    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getReleaseData() {
        return releaseData;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Artist: " + getArtist() + "\n" + "Release Date: " + getReleaseData() + "\n";
    }
}
