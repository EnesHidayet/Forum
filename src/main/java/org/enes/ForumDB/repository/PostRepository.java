package org.enes.ForumDB.repository;

import org.enes.ForumDB.entity.Post;
import org.enes.ForumDB.entity.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    private org.enes.ForumDB.repository.CRUD crud;
    private ResultSet rs;
    public PostRepository(){
        crud = new org.enes.ForumDB.repository.CRUD("ForumDB");
    }
    public void save(Post post){
        String sql = "insert into tblpost(userid,title,postcomment,shareddate,imageurl,likecount,commentcount) values(" +
                "'"
                +post.getUserid()+"','"
                +post.getTitle()+"',"
                +post.getPostcomment()+",'"
                +post.getShareddate()+"','"
                +post.getImageurl()+"','"
                +post.getLikecount()+"','"
                +post.getCommentcount()+"','"
                +")";
        crud.executeUpdate(sql);
    }

    public void update(Post post){
        String sql = "update tblpost set " +
                "userid='"+post.getUserid()
                +"',title="+post.getTitle()
                +",postcomment='"+post.getPostcomment()
                +"',shareddate='"+post.getShareddate()
                +"',imageurl='"+post.getImageurl()
                +"',likecount='"+post.getLikecount()
                +"',commentcount='"+post.getCommentcount()
                +"' where id="+post.getId();
        crud.executeUpdate(sql);
    }

    public void delete(long id){
        String sql = "delete from tblpost where id="+id;
        crud.executeUpdate(sql);
    }

    public List<Post> findAll(){
        rs =  crud.getAllTableRows("select * from tblpost");
        List<Post> postList = new ArrayList<>();
        try{
            while (rs.next()){
                long id = rs.getLong("id");
                long userid = rs.getLong("userid");
                String title = rs.getString("title");
                String postcomment = rs.getString("postcomment");
                long shareddate= rs.getLong("shareddate");
                String imageurl = rs.getString("imageurl");
                int likecount = rs.getInt("likecount");
                int commentcount = rs.getInt("commentcount");
                Post post = new Post(id,userid,title,postcomment,shareddate,imageurl,likecount,commentcount);
               postList.add(post);
            }
            return postList;
        }catch (Exception exception){
            return postList;
        }
    }
}
