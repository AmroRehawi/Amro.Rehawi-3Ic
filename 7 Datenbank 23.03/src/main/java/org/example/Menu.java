package org.example;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scnr = new Scanner(System.in);

    ArrayList<Object> databases = new ArrayList<>();


    public Menu() throws SQLException {
        databases.add(website.getInstance());
    }


    public void Start() throws SQLException {

        boolean finish = false;
        do {
            System.out.println("**********************");
            System.out.println("1. Create a new database");
            System.out.println("2. Use an existing Database - insert or show data (Includes the website database)");
            System.out.println("3. Delete an existing Database");
            System.out.println("4. Finish the program");
            System.out.println("**********************");
            int input = scnr.nextInt();
            scnr.nextLine();
            switch (input) {
                case 1:
                    CreateDB();
                    break;
                case 2:
                    UseDatabase();
                    break;
                case 3:
                case 4:
                    finish = true;
            }
        } while (!finish);

    }

    // case 1
    private void CreateDB() throws SQLException {
        System.out.println("Give the database a name (If it already exists, it will be replaced)");
        String dbName = scnr.nextLine();
        databases.add(new CreateDB(dbName));
        System.out.println("++++++The database " + dbName + " was created with the table 'user'++++++");
        System.out.println();
    }

    // case 2
    private void UseDatabase() throws SQLException {
        boolean finish2 = false;
        do {
            System.out.println("**********************");
            System.out.println("1. Go back to main menu");
            System.out.println("2. Choose one of the databases:");
            System.out.println("    NOTE that in the 'website' database you can't insert new data");
            System.out.println("**********************");
            int input = scnr.nextInt();
            scnr.nextLine();
            switch (input) {
                case 1:
                    finish2 = true;
                    break;
                case 2:
                    ListExistingDB();
                    String userInput = scnr.nextLine();
                    for (Object obj : databases) {
                        if (obj instanceof website && userInput.equals("website")) {
                            ValidateWebsiteDataSearch(obj);
                        } else if (obj instanceof CreateDB) {
                            ValidateDataSearch(obj,userInput);
                        }
                    }
                    break;
            }
        } while (!finish2);
    }
// case 3

    public void ValidateDataSearch(Object obj, String userinput) throws SQLException {
        CreateDB db = (CreateDB) obj;
        if (db.getName().equals(userinput)){
            System.out.println("**********************");
            System.out.println("1. Show 'user' table");
            System.out.println("2. Insert into 'user' table");
            System.out.println("3. Delete database");
            int input = scnr.nextInt();
            scnr.nextLine();
            switch (input) {
                case 1:
                    db.ShowData(userinput);
                    break;
                case 2:
                    try {
                        db.InsertData(userinput);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                case 3:
                    db.DeleteDatabase(userinput);
                    System.out.println("Database deleted");
                    for (int i = 0; i < databases.size(); i++) {
                        obj = databases.get(i);
                        String s = obj.getClass().getSimpleName();
                        if (s.equals("CreateDB")) {
                            if (((CreateDB) obj).getName().equals("CreateDB"))
                            databases.remove(i);
                        }}

                    break;
            }
        }
    }

    public void ValidateWebsiteDataSearch(Object obj) throws SQLException {
        website website = (website) obj;
        boolean finish2 = false;
        do {
            System.out.println("**********************");
            System.out.println("1. Show 'user' table");
            System.out.println("2. Show 'street' table");
            System.out.println("3. Search in 'user' table");
            System.out.println("4. Search in 'street' table");
            System.out.println("5. Go back");
            System.out.println("**********************");
            int input = scnr.nextInt();
            if (input == 1) {
                website.WebsiteUserTable();
            } else if (input == 2) {
                website.WebsiteStreetTable();
            } else if (input == 3) {
                System.out.println("What Userid are you looking for? 44,45,46");
                input = scnr.nextInt();
                scnr.nextLine();
                website.SearchInUserTable(input);
            } else if (input == 4) {
                System.out.println("What Streetid are you looking for?");
                input = scnr.nextInt();
                scnr.nextLine();
                website.SearchInStreetTable(input);
            } else if (input == 5) {
                finish2 = true;
                break;
            }
        } while (!finish2);
    }

    private void ListExistingDB() throws SQLException {
        for (Object obj : databases) {
            Class c = obj.getClass();
            if (c.getSimpleName().equals("website")) {
                website website = (org.example.website) obj;
                System.out.println("* " + website.getName() + " (the Database of the website)");
            } else {
                CreateDB db = (CreateDB) obj;
                System.out.println("* " + db.getName());
            }
        }

    }
}
