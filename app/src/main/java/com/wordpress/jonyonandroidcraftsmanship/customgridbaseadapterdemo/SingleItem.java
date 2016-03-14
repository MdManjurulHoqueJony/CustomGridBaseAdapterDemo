package com.wordpress.jonyonandroidcraftsmanship.customgridbaseadapterdemo;

public class SingleItem {
    private int titleImage=0;
    private String title=null;

    public SingleItem(int titleImage, String title) {
        this.titleImage = titleImage;
        this.title = title;
    }

    public int getTitleImage() {
        return titleImage;
    }

    public String getTitle() {
        return title;
    }
}
