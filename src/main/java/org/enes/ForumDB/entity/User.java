package org.enes.ForumDB.entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class User {
    private long id;
    private String adsoyad;
    private String username;
    private String password;
    private String avatar;
    private List<Post> postList;
    public User(String adsoyad, String username, String password,String avatar) {
        this.postList=new ArrayList<>();
        this.adsoyad = adsoyad;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
    }

    public User(long id, String adsoyad, String username, String password, String avatar) {
        this.postList=new ArrayList<>();
        this.adsoyad = adsoyad;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", adsoyad='" + adsoyad + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
