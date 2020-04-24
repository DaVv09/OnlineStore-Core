package com.directmedia.onlinestore.core.entity;

public class Artist {

    //déclarations
    private  String name;

    //constructeur
    public Artist() {};
    public Artist(String name) {
        this.name = name;
    }

    // Getter & Setter propriétés
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
