package com.connect.dsb;

public class EventBean {

    private String title;
    private String category;
    private String Description;
    private int thumbnail;

    public EventBean() {
    }

    public EventBean(String title, String category, String description, int thumbnail) {
        this.title = title;
        this.category = category;
        Description = description;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}

