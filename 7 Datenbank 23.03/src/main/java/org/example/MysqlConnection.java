package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {

    public static Connection Connect(){
        Connection connection=null;
        String url="jdbc:mysql://localhost:3306/websiteuserdata";
        String user="root";
        String password="";
        try{
        connection=DriverManager.getConnection(url,user,password);

        }catch(SQLException e){
        e.printStackTrace();
        }finally {
            if (connection == null) {
                System.out.println("Verbindung wurde nicht aufgebaut");
            }
        }
        return connection;

    }
    public static void Disconnect(Connection con)throws SQLException  {
            con.close();
            if(con.isClosed()){
                System.out.println("Verbindung geschlossen");}
        }
    }

