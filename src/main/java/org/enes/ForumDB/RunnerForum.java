package org.enes.ForumDB;

import org.enes.ForumDB.repository.UserRepository;
import org.enes.ForumDB.service.UserService;

import java.util.Scanner;

public class RunnerForum {
    /**
     * Ana sayfa
     * *****************************************
     * ********** JAVA FORUM SAYFASI ***********
     * *************** GİRİŞ *******************
     * 1- Login
     * 2- Register
     * ---------------
     * Login pagede
     * username:
     * password:
     * --- ya giriş yapacak ya da username veya password hatalı diyecek
     * Register sayfasında
     * username
     * ad soyad
     * password
     * --- ya üye olup login sayfasına atacak ya da bu username daha önce alınmış diyecek
     * ----------------------------------------
     * Yapılacaklar
     * 1- tüm entityleri ve repositorylerini oluşturuyorsunuz.
     * 2- repository katmanında temel CRUD işlemleri olacak.
     * 3- sadece user repositoryde şu ek alanlar olacak
     * -- doLogin(username,password) -> return optional <User>
     * -- isUsername(username)-> return true/false
     * 4- yukarıda tanımlanan ekranları işlevsel hale getirin.
     */

    public static void main(String[] args) {

        RunnerForum rf=new RunnerForum();
        rf.uygulama();

    }

    Scanner sc=new Scanner(System.in);
    UserRepository ur=new UserRepository();
    UserService us=new UserService();
    public int uygulamaMenu(){
        System.out.println("""
                *****************************************
                ********** JAVA FORUM SAYFASI ***********
                *************** GİRİŞ *******************
                1- Login
                2- Register
                0- ÇIKIŞ
                """);
        System.out.println("Lütfen seçim yapınız.");
        int secim;
        return secim=new Scanner(System.in).nextInt();
    }

    public void uygulama(){
        int secim;
        do {
            secim=uygulamaMenu();
            switch (secim){
                case 1:
                    us.girisBilgileriniAl();
                    break;
                case 2:
                    us.kayitOl();
                    break;
                case 0:break;
                default:
                    System.out.println("Geçersiz seçim.");break;
            }
        }while (secim!=0);
    }


}
