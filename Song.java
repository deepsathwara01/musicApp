package com.example.finalproject;

public class Song {
    private String songUrl,songName;

    public Song() {
    }

    public Song(String songName, String songUrl) {
        this.songUrl = songUrl;
        this.songName = songName;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}

