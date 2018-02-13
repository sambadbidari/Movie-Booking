package com.loopwiki.movie;

/**
 * Created by sambad on 2/5/18 in ${LOCATION}.
 */

public class getmovie {
    private String name;
    private String genre;
    private int thumbnail;

    public getmovie() {
    }

    public getmovie(String name, String genre, int thumbnail) {
        this.name = name;
        this.genre = genre;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}