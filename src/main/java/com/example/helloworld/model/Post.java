package com.example.helloworld.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {

    private int postId;
    private static int nextPostId = 1;

    private String postContent;
    private Date postTime;

    public Post(String postContent) {
        this.postContent = postContent;

        postTime = new Date();

        postId = nextPostId;
        nextPostId++;
    }

    public int getPostId() {
        return postId;
    }

    public String getPostContent() {
        return postContent;
    }

    public Date getPostTime() {
        return postTime;
    }

    public String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEEEEEEE MMMMMMMMM dd, yyyy @ hh:mm:ss aa");
        return formatter.format(this.getPostTime());
    }

    public String getTimeOnly() {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss: aa");
        return formatter.format(this.getPostTime());
    }
}
