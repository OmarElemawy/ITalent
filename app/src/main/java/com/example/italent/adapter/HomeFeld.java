package com.example.italent.adapter;

   public class HomeFeld {
    private String user_name;
    private String time_post;
    private Integer user_image;
    private Integer video;

    public HomeFeld() {
    }

    public HomeFeld(String user_name, String time_post, Integer user_image, Integer video) {
        this.user_name = user_name;
        this.time_post = time_post;
        this.user_image = user_image;
        this.video = video;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getTime_post() {
        return time_post;
    }

    public void setTime_post(String time_post) {
        this.time_post = time_post;
    }

    public Integer getUser_image() {
        return user_image;
    }

    public void setUser_image(Integer user_image) {
        this.user_image = user_image;
    }

    public Integer getVideo() {
        return video;
    }

    public void setVideo(Integer video) {
        this.video = video;
    }
}
