package com.directmedia.onlinestore.core.entity;


import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
    //déclarations
    private Set<Work> items=new HashSet<Work>();
    //Getter & setter
    public Set<Work> getItems() {
        return items;
    }
    public void setItems(Set<Work> items) {
        this.items = items;
    }
}
