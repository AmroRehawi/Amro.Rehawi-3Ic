/**
 *
 * @author Amro Rehawi
 * @date 12.03.2023
 * @version 1
 */

import com.google.gson.Gson;
public class Main {
    public static void main(String[] args) {
        /**
         * Die main-Methode initialisiert ein neues Menü-Objekt und ruft die Methode CallMenu auf.
         */
        Menu myMenu = new Menu();
        System.out.println("Herzlich Willkommen im Oszean");
        myMenu.CallMenu();

    }
}
