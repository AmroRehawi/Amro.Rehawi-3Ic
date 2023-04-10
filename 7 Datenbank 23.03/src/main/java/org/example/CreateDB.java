package org.example;
import java.sql .*;
import java.util.Scanner;

// Klasse zum Erstellen von Datenbank und Tabellen
public class CreateDB {
    private Connection conn;
    private final String dbName;
    Scanner scnr = new Scanner(System.in);
    // Konstruktor, der eine Verbindung zur Datenbank aufbaut
    public CreateDB(String dbName) throws SQLException {
        conn = MysqlConnection.Connect();
        this.dbName = dbName;
        createDatabase();
        CreateTable();
    }
    public String getName(){
        return dbName;
    }

    public void createDatabase() throws SQLException {
        String query = "CREATE DATABASE IF NOT EXISTS " + dbName;
        Pstmt(query);
    }
    private void Pstmt(String sql) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.execute();
        }
    }
    public void DeleteDatabase(String dbName) throws SQLException {
        String sql = "DROP DATABASE "+ dbName;
        Pstmt(sql);
    }

    public void CreateTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS " + dbName+ ".user ("+
                "PersonID int ,"+
                "LastName varchar(255),"+
                "FirstName varchar(255));";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.execute();
        }
    }
public void ShowData(String dbName) throws SQLException{
    String sql = "SELECT PersonID, LastName, FirstName FROM "+dbName+ ".user;";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    ResultSet rs = pstmt.executeQuery();
    while (rs.next()) {
        int id = rs.getInt("PersonID");
        String surname = rs.getString("LastName");
        String familyname = rs.getString("FirstName");
        System.out.println("ID: " + id + ", Nachname: " + surname + ", Vorname: " + familyname);
    }
    pstmt.close();
}
    public void InsertData(String dbName) throws SQLException {

        System.out.println("Bitte geben Sie die Werte für den neuen Datensatz ein:");
        System.out.println("ID: (not AI)");
        int id = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Nachname: ");
        String lastName = scnr.nextLine();
        System.out.println("Vorname: ");
        String firstName = scnr.nextLine();

        String sql = "INSERT INTO "+ dbName+".user (PersonID, LastName, FirstName) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, lastName);
            pstmt.setString(3,firstName);

            pstmt.executeUpdate();
        }}
    /*public void DeleteDatabase(String dbName) throws SQLException {
        String sql = "DROP DATABASE " + dbName;
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            System.out.println("Database " + dbName + " has been deleted.");
        } catch (SQLException e) {
            System.out.println("Error deleting database " + dbName + ": " + e.getMessage());
        }
    }*/

}



