package com.example.phil.httppost.data.model;

/**
 * Created by phil on 2/22/17.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("tags")
    @Expose
    private String[] tags;
    @SerializedName("resume")
    @Expose
    private String resume;
    @SerializedName("picture")
    @Expose
    private String picture;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("chat_ids")
    @Expose
    private String[] chatIds;
    @SerializedName("bio")
    @Expose
    private String bio;

    public Object getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Object getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getChatIds() {
        return chatIds;
    }

    public void setChatIds(String[] chatIds) {
        this.chatIds = chatIds;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String toString(){
        return name + " \n" + bio + "\n" + resume + "\n" + tags + "\n";
    }

    /*
    return after loging in..

    %GoodApi2.JobSeeker{bio: "I am a cooler gyu", chat_ids: [], distance_range: 19,
    email: "abc@a.com", name: "Pat Patty", password: "123456", picture: "default",
    resume: "Look at me !", seen: [], tags: ["jumping high", "getting high"]}

     */

}