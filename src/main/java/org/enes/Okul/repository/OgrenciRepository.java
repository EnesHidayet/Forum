package org.enes.Okul.repository;

import org.enes.Okul.entity.Ogrenci;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class OgrenciRepository {
    private CRUD crud;
    private ResultSet rs;
    public OgrenciRepository(){
        crud = new CRUD("OkulDB");
    }
    public void save(Ogrenci ogrenci){
        String sql = "insert into tblogrenci(ad,soyad,yas,veliadi,iletisim) values(" +
                "'"
                +ogrenci.getAd()+"','"
                +ogrenci.getSoyad()+"',"
                +ogrenci.getYas()+",'"
                +ogrenci.getVeliadi()+"','"
                +ogrenci.getIletisim()+"'" +
                ")";
        crud.executeUpdate(sql);
    }

    public void update(Ogrenci ogrenci){
        String sql = "update tblogrenci set " +
                "ad='"+ogrenci.getAd()
                +"',soyad='"+ogrenci.getSoyad()
                +"',yas="+ogrenci.getYas()
                +",veliadi='"+ogrenci.getVeliadi()
                +"',iletisim='"+ogrenci.getIletisim()
                +"' where id="+ogrenci.getId();
        crud.executeUpdate(sql);
    }

    public void delete(int id){
        String sql = "delete from tblogrenci where id="+id;
        crud.executeUpdate(sql);
    }

    public List<Ogrenci> findAll(){
        rs =  crud.getAllTableRows("select * from tblogrenci");
        List<Ogrenci> ogrenciList = new ArrayList<>();
        try{
            while (rs.next()){
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String veliadi = rs.getString("veliadi");
                String iletisim = rs.getString("iletisim");
                int yas = rs.getInt("yas");
                Ogrenci ogrenci = new Ogrenci(id,ad,soyad,veliadi,yas,iletisim);
                ogrenciList.add(ogrenci);
            }
            return ogrenciList;
        }catch (Exception exception){
            return ogrenciList;
        }
    }
}
