package com.example.sanat.viewpagerwithtabs;

/**
 * Created by sanat on 5/26/2018.
 */

public class HomeModel {

    private String Title;
    private String Category;
    private String Description;
    private String Price;

    private int Thumbnail;

    public HomeModel() {
    }

    public HomeModel(String title, String category, String description, String price, int thumbnail) {
        Title = title;
        Category = category;
        Description = description;
        Price = price;
        Thumbnail = thumbnail;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getPrice() {
        return Price;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }





}
