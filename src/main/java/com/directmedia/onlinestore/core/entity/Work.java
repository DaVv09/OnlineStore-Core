package com.directmedia.onlinestore.core.entity;
// classe correspondante à l'oeuvre

public class Work {

    //déclarations
    private String title;
    private String genre;
    private int release; // année de sortie ( format num à xxxx chiffres)
    private String summary;
    private Artist mainArtist;
    private long id;
    private static int lastId;

    //constructeur
    public Work() {
        this.id=lastId++;
    }
    public Work(String title) {
        this();
        this.title = title;
    }

    // getter& setter des propriétés
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRelease() {
        return release;
    }
    public void setRelease(int release) {
        this.release = release;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Artist getMainArtist() {
        return mainArtist;
    }
    public void setMainArtist(Artist mainArtist) {
        this.mainArtist = mainArtist;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public static int getLastId() {
        return lastId;
    }
    public static void setLastId(int lastId) {
        Work.lastId = lastId;
    }
}
