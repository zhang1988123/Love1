package com.example.lenovo.love.bean;

/**
 * Created by lenovo
 * on 2018/5/11.
 * at 北京
 */
public class Bean {
    private int img;
    private String title;
    private String url;

    public Bean() {
    }

    public Bean(int img, String title, String url) {
        this.img = img;
        this.title = title;
        this.url = url;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
