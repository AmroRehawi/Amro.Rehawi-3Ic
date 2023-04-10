package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class website {
    private static website instance = null;
    private Connection conn= MysqlConnection.Connect();
    private String name = "website";

    private website(){
    }
    public static website getInstance() {
        if (instance == null) {
            instance = new website();
        }
        return instance;
    }
    public String getName(){
        return name;
    }
    public void WebsiteUserTable() throws SQLException {
        String sql = "SELECT idUser, surname, familyname FROM websiteuserdata.userdata;";
        Pstmt(sql);
    }

    public void WebsiteStreetTable() throws SQLException {
        String sql = "Select idStreet, streetName, city_idcity as id_City FROM websiteuserdata.street;";
        Pstmt(sql);
    }
    public void SearchInUserTable(int searchid) throws SQLException {
        String sql = "SELECT idUser, surname, familyname FROM websiteuserdata.userdata "+
                "where idUser ="+ searchid + ";";
        Pstmt(sql);

    }
    public void SearchInStreetTable(int searchid) throws SQLException {

        String sql = "Select idStreet, streetName, city_idcity as id_City FROM websiteuserdata.street" +
                " where idStreet = " + searchid + ";";
        Pstmt(sql);
    }


    private void Pstmt(String sql) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  | "  + rs.getString(2) + " | " + rs.getString(3));
            }
        }
    }
}
