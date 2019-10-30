package com.example.candeeg;

public class NewsItem {



    String textView,dosai_description,dosai_catogory;

    public String getTextView() {
        return textView;
    }

    public NewsItem(String textView, String dosai_description, String dosai_catogory, int imageview) {
        this.textView = textView;
        this.dosai_description = dosai_description;
        this.dosai_catogory = dosai_catogory;
        this.imageview = imageview;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }

    public String getDosai_description() {
        return dosai_description;
    }

    public void setDosai_description(String dosai_description) {
        this.dosai_description = dosai_description;
    }

    public String getDosai_catogory() {
        return dosai_catogory;
    }

    public void setDosai_catogory(String dosai_catogory) {
        this.dosai_catogory = dosai_catogory;
    }

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public NewsItem() {


    }

    int imageview;

}
