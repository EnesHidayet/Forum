package org.enes.ForumDB.entity;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private Long id;
    private Long userid;
    private String title;
    private String postcomment;
    private Long shareddate;
    private String imageurl;
    private Integer likecount;
    private Integer commentcount;
    private List<Comment> commentList;

    public Post(Long userid, String title, String postcomment, Long shareddate, String imageurl,Integer likecount,Integer commentcount) {
        this.commentList=new ArrayList<>();
        this.userid = userid;
        this.title = title;
        this.postcomment = postcomment;
        this.shareddate = shareddate;
        this.imageurl = imageurl;
        this.likecount=likecount;
        this.commentcount=commentcount;
    }

    public Post(Long id, Long userid, String title, String postcomment, Long shareddate, String imageurl, Integer likecount, Integer commentcount) {
        this.commentList=new ArrayList<>();
        this.userid = userid;
        this.title = title;
        this.postcomment = postcomment;
        this.shareddate = shareddate;
        this.imageurl = imageurl;
        this.likecount=likecount;
        this.commentcount=commentcount;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostcomment() {
        return postcomment;
    }

    public void setPostcomment(String postcomment) {
        this.postcomment = postcomment;
    }

    public Long getShareddate() {
        return shareddate;
    }

    public void setShareddate(Long shareddate) {
        this.shareddate = shareddate;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", userid=" + userid +
                ", title='" + title + '\'' +
                ", postcomment='" + postcomment + '\'' +
                ", shareddate=" + shareddate +
                ", imageurl='" + imageurl + '\'' +
                ", likecount=" + likecount +
                ", commentcount=" + commentcount +
                '}';
    }
}
