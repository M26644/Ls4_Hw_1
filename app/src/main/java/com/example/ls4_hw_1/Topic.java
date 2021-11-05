package com.example.ls4_hw_1;

public class Topic {
    private String header;
    private String fan;
    private String post;
    private String group;
    private int img;
    private int idGroup;


    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }


    public Topic(String header, String fan, String post, String group, int img, int idGroup) {
        this.header = header;
        this.fan = fan;
        this.post = post;
        this.group = group;
        this.img = img;
        this.idGroup = idGroup;
    }
    public Topic() {
    }




}
