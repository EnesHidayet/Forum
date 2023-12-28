package org.enes.ForumDB.service;

import org.enes.ForumDB.entity.User;
import org.enes.ForumDB.repository.UserRepository;

import java.util.Scanner;

public class UserService {
    UserRepository ur=new UserRepository();
    Scanner sc=new Scanner(System.in);
    public void girisBilgileriniAl(){
        System.out.println("Kullanıcı adınızı giriniz.");
        String username=sc.nextLine();
        System.out.println("Şifrenizi giriniz.");
        String password=sc.nextLine();
        ur.doLogin(username,password);
    }

    public void kayitOl() {
        System.out.println("Adınız ve soyadınızı giriniz.");
        String adsoyad = sc.nextLine();

        boolean kontrol;
        String username;
        do {
            System.out.println("Kullanıcı adı seçiniz.");
            username = sc.nextLine();
            kontrol = ur.isUsername(username);
        } while (kontrol);


        System.out.println("Şifre seçiniz.");
        String password = sc.nextLine();
        System.out.println("Avatar urlnizi giriniz.");
        String avatar = sc.nextLine();
        User user = new User(adsoyad, username, password, avatar);
        ur.save(user);
    }

}
