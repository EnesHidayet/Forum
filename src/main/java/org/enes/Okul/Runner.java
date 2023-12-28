package org.enes.Okul;

import java.sql.*;

public class Runner {
//    public static void main(String[] args) throws Exception {
//
//        Driver.class.forName("org.postgresql.Driver");
//        //Syntax: jdbc:[DATABASE TYPE]://IP:PORT/DB NAME
//        String adres="jdbc:postgresql://localhost:5432/OgretmenKitapKiralamaDB";
//        String ka="postgres";
//        String sf="root";
//        Connection conn= DriverManager.getConnection(adres,ka,sf);
//        String SQL="select * from tbl_konu";
//                //"delete from tbl_konu where id=1";
//                //"update tbl_konu set ad='Yazılım Java' where id=1";
//                //"insert into tbl_konu(ad) values('Yazılım')";
//        PreparedStatement pr=conn.prepareCall(SQL);
//        //pr.executeUpdate();
//        ResultSet rs=pr.executeQuery();
//        /**
//         * 1- Anı
//         * 2- Belgesel
//         * 3- Roman
//         */
//        while (rs.next()){ // size gelen data içinde satır satır gezme işlemini yapar.
//            int id=rs.getInt("id");
//            String ad= rs.getString("ad");
//            System.out.println("id...:"+id+" - ad...:"+ad);
//        }
//        conn.close();
//
//    }

    public static void main(String[] args) throws Exception {

        Driver.class.forName("org.postgresql.Driver");
        //Syntax: jdbc:[DATABASE TYPE]://IP:PORT/DB NAME
        String adres="jdbc:postgresql://localhost:5432/OkulDB";
        String ka="postgres";
        String sf="root";
        Connection conn= DriverManager.getConnection(adres,ka,sf);
        String SQL= "insert into tblogrenci(ad) values('Enes')";
        PreparedStatement pr=conn.prepareCall(SQL);
        //pr.executeUpdate();
        ResultSet rs=pr.executeQuery();
        /**
         * 1- Anı
         * 2- Belgesel
         * 3- Roman
         */
        while (rs.next()){ // size gelen data içinde satır satır gezme işlemini yapar.
            int id=rs.getInt("id");
            String ad= rs.getString("ad");
            System.out.println("id...:"+id+" - ad...:"+ad);
        }
        conn.close();

    }
}
