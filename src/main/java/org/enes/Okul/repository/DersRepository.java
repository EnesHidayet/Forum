package org.enes.Okul.repository;

import org.enes.Okul.entity.Ders;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DersRepository {
    private CRUD crud;
    private ResultSet rs;

    public DersRepository(){
        crud = new CRUD("OkulDB");
    }

    public void save(Ders ders){
        String sql ="insert into tblders(ad) values('"+ders.getAd()+"')";
        crud.executeUpdate(sql);
    }
    public void update(Ders ders){
        String sql ="update tblders set ad='"+ders.getAd()+"' wherer id="+ders.getId();
        crud.executeUpdate(sql);
    }
    public void delete(int id){
        String sql ="delete from tblders where id="+id;
        crud.executeUpdate(sql);
    }
    public List<Ders> findAll(){
        String sql ="select * from tblders";
        rs = crud.getAllTableRows(sql);
        List<Ders> dersList = new ArrayList<>();
        try {
            while (rs.next()){
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                Ders ders =  new Ders(id,ad);
                dersList.add(ders);
            }
        }catch (Exception exception){

        }
        return  dersList;
    }

}
