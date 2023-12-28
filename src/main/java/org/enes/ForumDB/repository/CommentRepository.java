package org.enes.ForumDB.repository;

import org.enes.ForumDB.entity.Comment;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    private org.enes.ForumDB.repository.CRUD crud;
    private ResultSet rs;
    public CommentRepository(){
        crud = new org.enes.ForumDB.repository.CRUD("ForumDB");
    }
    public void save(Comment comment){
        String sql = "insert into tblcomment(userid,postid,commenttext,commentdate) values(" +
                "'"
                +comment.getUserid()+"','"
                +comment.getPostid()+"',"
                +comment.getCommenttext()+",'"
                +comment.getCommentdate()+"','"
                +")";
        crud.executeUpdate(sql);
    }

    public void update(Comment comment){
        String sql = "update tblcomment set " +
                "userid='"+comment.getUserid()
                +"',postid="+comment.getPostid()
                +",commenttext='"+comment.getCommenttext()
                +"',commentdate='"+comment.getCommentdate()
                +"' where id="+comment.getId();
        crud.executeUpdate(sql);
    }

    public void delete(long id){
        String sql = "delete from tblcomment where id="+id;
        crud.executeUpdate(sql);
    }

    public List<Comment> findAll(){
        rs =  crud.getAllTableRows("select * from tblcomment");
        List<Comment> commentList = new ArrayList<>();
        try{
            while (rs.next()){
                long id = rs.getLong("id");
                long userid = rs.getLong("userid");
                long postid = rs.getLong("postid");
                String commenttext = rs.getString("commenttext");
                long commentdate= rs.getLong("commentdate");
                Comment comment = new Comment(id,userid,postid,commenttext,commentdate);
                commentList.add(comment);
            }
            return commentList;
        }catch (Exception exception){
            return commentList;
        }
    }
}
