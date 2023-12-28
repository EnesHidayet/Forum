package org.enes.ForumDB.repository;

import java.sql.*;

import static org.enes.ForumDB.utility.Constants.*;

public class CRUD {

    private final String databaseName;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public CRUD(String databaseName) {
        this.databaseName = databaseName;
    }

    private boolean openConneciton(){
        try {
            Driver.class.forName(DRIVER_CLASS_NAME);
            conn= DriverManager.getConnection("jdbc:postgresql://"+DB_IP+":"+DB_PORT+"/"+databaseName, DB_USERNAME,DB_PASSWORD);
            return true;
        }catch (Exception e){
            System.out.println("Bağlantı açma hatası...:"+e);
            return false;
        }
    }

    private void closeConnection(){
        try {
            if (!this.conn.isClosed()){
                this.conn.close();
            }
        }catch (Exception e){
            System.out.println("Bağlantı kapatma hatası...:"+e);
        }
    }

    /**
     * Verilen SQL komutunu ilgili bağlantı üzerinden DB ye işler
     * @param SQL
     * @return başarılı olup olmadığını boolean olarak bildirir.
     */
    public boolean executeUpdate(String SQL){
        try {
            if (openConneciton()){
                conn.prepareStatement(SQL).executeUpdate();
                return true;
            }else {
                System.out.println("Bağlantı açılamadı");
                return false;
            }
        }catch (Exception e){
            System.out.println("Database update işlem hatası...:"+e);
            return false;
        }
    }

    public ResultSet getAllTableRows(String SQL){
        try {
            if (openConneciton()){
                rs=conn.prepareStatement(SQL).executeQuery();
                closeConnection();
                return rs;
            }else {
                System.out.println("Bağlantı açılamadı.");
                return null;
            }
        }catch (Exception e){
            System.out.println("Database sorgu hatası...:"+e);
            return null;
        }
    }





}
