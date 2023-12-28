package org.enes.ForumDB.entity;

public class Comment {
    private Long id;
    private Long userid;
    private Long postid;
    private String commenttext;
    private Long commentdate;

    public Comment(Long userid, Long postid, String commenttext, Long commentdate) {
        this.userid = userid;
        this.postid = postid;
        this.commenttext = commenttext;
        this.commentdate = commentdate;
    }

    public Comment(Long id, Long userid, Long postid, String commenttext, Long commentdate) {
        this.userid = userid;
        this.postid = postid;
        this.commenttext = commenttext;
        this.commentdate = commentdate;
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

    public Long getPostid() {
        return postid;
    }

    public void setPostid(Long postid) {
        this.postid = postid;
    }

    public String getCommenttext() {
        return commenttext;
    }

    public void setCommenttext(String commenttext) {
        this.commenttext = commenttext;
    }

    public Long getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Long commentdate) {
        this.commentdate = commentdate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userid=" + userid +
                ", postid=" + postid +
                ", commenttext='" + commenttext + '\'' +
                ", commentdate=" + commentdate +
                '}';
    }
}
