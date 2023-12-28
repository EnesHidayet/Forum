package org.enes.ForumDB.repository;

import org.enes.ForumDB.entity.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    User aktifUser;
    private org.enes.ForumDB.repository.CRUD crud;
    private ResultSet rs;
    public UserRepository(){
        crud = new org.enes.ForumDB.repository.CRUD("ForumDB");
    }
    public void save(User user){
        String sql = "insert into tbluser(adsoyad,username,password,avatar) values(" +
                "'"
                +user.getAdsoyad()+"','"
                +user.getUsername()+"',"
                +user.getPassword()+",'"
                +user.getAvatar()+"'"
                +")";
        crud.executeUpdate(sql);
    }

    public void update(User user){
        String sql = "update tbluser set " +
                "adsoyad='"+user.getAdsoyad()
                +"',username="+user.getUsername()
                +",password='"+user.getPassword()
                +"',avatar='"+user.getAvatar()
                +"' where id="+user.getId();
        crud.executeUpdate(sql);
    }

    public void delete(long id){
        String sql = "delete from tbluser where id="+id;
        crud.executeUpdate(sql);
    }

    public List<User> findAll(){
        rs =  crud.getAllTableRows("select * from tbluser");
        List<User> userList = new ArrayList<>();
        try{
            while (rs.next()){
                long id = rs.getLong("id");
                String adsoyad = rs.getString("adsoyad");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String avatar = rs.getString("avatar");
                User user = new User(id,adsoyad,username,password,avatar);
                userList.add(user);
            }
            return userList;
        }catch (Exception exception){
            return userList;
        }
    }

    public Optional<User> doLogin(String username,String password){
        List<User> userList=findAll();
        userList.forEach(System.out::println);
        boolean kontrol=false;
        for (User user:userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                aktifUser=user;
                kontrol=true;
                break;

            }
        }

        if (kontrol){
            System.out.println("Giriş başarıyla tamamlandı.");
        }else {
            System.out.println("Kullanıcı adı ve şifre yanlış");
        }
        return Optional.ofNullable(aktifUser);
    }


    public boolean isUsername(String username){
        List<User> userList=findAll();
        boolean kontrol=false;
        for (User user:userList){
            if (user.getUsername().equals(username)){
                System.out.println("Kullanıcı adı kullanılmaktadır lütfen başka bir kullanıcı adı seçiniz.");
                kontrol=true;
            }
        }
        return kontrol;
    }
}
