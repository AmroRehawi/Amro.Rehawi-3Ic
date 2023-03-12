/**

 Diese Klasse definiert ein Menü zur Verwaltung von Wasserfahrzeugen.
 Es können Schiffe erzeugt, generiert, gelöscht oder Steckbriefe angezeigt werden.
 Das Menü wird durch die Methode CallMenu aufgerufen.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList<WaterCraft> myOcean = new ArrayList<WaterCraft>();
    String name;
    String produceDate;
    String material;

    public void GenerateShips(){
        // test methode

        WarShip yamato = new WarShip("IJN Yamato", "1990", "Stahl, Alu und Titan");
        ContainerShip jellyFish = new ContainerShip("G.S. Jolly Jellyfish", "1890", "Stahl");
        PedalBoat pedalPirates = new PedalBoat("Pedal Pirate", "1900", "Holz");
        RowingBoat bananaBoat = new RowingBoat("banana Boat", "2010", "Holz");
        myOcean.add(yamato);
        myOcean.add(jellyFish);
        myOcean.add(pedalPirates);
        myOcean.add(bananaBoat
        );
    }
    /**
     * Diese Methode listet die Menüoptionen auf.
     */
    private void ListMenu(){
        System.out.println("Eine Wahl treffen:");
        Wait(250);
        System.out.println("1 - Schiff erzeugen");
        Wait(250);
        System.out.println("2 - Schiff generieren lassen");
        Wait(250);
        System.out.println("3 - Steckbrief");
        Wait(250);
        System.out.println("4 - Eines der Schiffe loeschen");
        Wait(250);
        System.out.println("5 - Das Spiel beenden");
    }
    /**
     * Diese Methode ruft das Menü auf und verarbeitet die Eingaben des Benutzers, bis das Spiel beendet wird.
     */
    public void CallMenu(){

        int menuSelection=0;
        boolean invalidInput;
        boolean finishGame = false;
        do{
            ListMenu();
        try {
            invalidInput = false;
            menuSelection = sc.nextInt();
            DeleteScannerBuffer();
            switch (menuSelection) {
                case 1 -> CreateShip();
                case 2 -> { System.out.println("Entschuldigung! Das Feature generieren ist momentan nicht verfuegbar"); Wait(2000);}
                case 3 -> ShowCharactaristics();
                case 4 -> DeleteShip();
                case 5 -> FinishGame(finishGame);
            }

        }catch (Exception e) {
            System.out.println("Eingabe ungueltig, nochmal probieren!");
            invalidInput = true;
            DeleteScannerBuffer();
        }
        }while (invalidInput || menuSelection == 0 || !finishGame);

    }

    // Wahl 1
    /**
     * Diese Methode löscht den Scannerpuffer.
     */
    private void DeleteScannerBuffer(){
        sc.nextLine();
    }
    /**
     * Diese Methode leert die Konsole.
     */
    private void ClearConsole(){
        for (int i = 0; i < 45; i++) {
            System.out.println();
        }
    }
    /**
     * Methode zum Anzeigen der verfügbaren Schiffstypen.
     */
    private void AvailableShipTypes(){

        System.out.println("1 - Kriegsschif");
        Wait(500);
        System.out.println("2 - Containerschiff");
        Wait(500);
        System.out.println("3 - Pedalboot ");
        Wait(500);
        System.out.println("4 - Ruderboot");

 }
    /**
     * Methode Definieren des Steckbriefes
     */
    private void DefineShipCharacteristics(){
        boolean unvalidInput;
        do{
        System.out.println("Schiffsname eingeben:");
        name = sc.nextLine();
        System.out.println("Herstellungsjahr: ");
        produceDate = sc.nextLine();
        System.out.println("Material: ");
        material = sc.nextLine();

        unvalidInput = false;
        if(name.trim().isEmpty() || produceDate.trim().isEmpty() || material.trim().isEmpty() )
        {
            System.out.println("Kein Feld darf leer sein! Nochmal probieren:");
            unvalidInput =true;
        }
        }while (unvalidInput);
    }
    /**

     Diese Methode erstellt ein neues Schiff basierend auf der vom Benutzer ausgewählten Option.
     */
    private void CreateShip(){
        int shipSelection;
        System.out.println("Art des Schiffes waehlen: ");
        AvailableShipTypes();
        shipSelection = sc.nextInt();
        sc.nextLine();
        DefineShipCharacteristics();
        switch (shipSelection) {
            case 1 -> myOcean.add(new WarShip(name, produceDate, material));
            case 2 -> myOcean.add(new ContainerShip(name, produceDate, material));
            case 3 -> myOcean.add(new PedalBoat(name, produceDate, material));
            case 4 -> myOcean.add(new RowingBoat(name, produceDate, material));
        }
    }
    /**

     Diese Methode lässt das Programm für eine bestimmte Anzahl von Millisekunden warten.
     @param millis Anzahl der Millisekunden, für die das Programm warten soll.
     */
public void Wait(int millis){
    try {
        Thread.sleep(millis);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    /**

     Diese Methode gibt eine Liste der erstellten Schiffe aus oder zeigt eine entsprechende Meldung an, wenn keine Schiffe vorhanden sind.
     */
    private void ListCreatedShips(){
        if(myOcean.isEmpty()){

            System.out.println("Im Oszean sind momantan keine Schiffe vorhanden.");
            System.out.println("Soll ich fuer dich automatisch ein Schiff generieren?");
        }else {
            for (WaterCraft obj : myOcean) {
                System.out.println(obj.name);
            }
        }
    }
    /**

     Diese Methode sucht nach einem bestimmten Schiff in der Liste der erstellten Schiffe.

     @param searchedObj Das Schiff, nach dem gesucht wird.

     @return Das gefundene Schiff.
     */
    private WaterCraft LocateSearchedShip( WaterCraft searchedObj){
        String shipName;
        do{
            shipName = sc.nextLine();
        for (WaterCraft obj : myOcean) {
            if (obj.name.equals(shipName)) {
                searchedObj = obj;
            }
        }
        if(searchedObj == null){
            System.out.println("Das Schiff existiert nicht. Probiere es nochmal!");
        }
        } while(searchedObj == null);

        return searchedObj;
    }
    //wahl 3
    /**

     Diese Methode zeigt den Steckbrief eines bestimmten Schiffs an.
     */
    private void ShowCharactaristics(){
        WaterCraft searchedObj = null;
        System.out.println("Schiffe werden aufgelistet...");
        Wait(3000);
        ListCreatedShips();
        searchedObj = LocateSearchedShip(searchedObj);
        searchedObj.Charactaristics();
    }

    //wahl 4
    /**

     diese Methode löscht ein Schiff aus der Liste der erstellten Schiffe im Ozean.
     */
    private void DeleteShip(){
        WaterCraft searchedObj = null;
        System.out.println("Welches Schiff moechtest du loeschen?");
        ListCreatedShips();
        searchedObj = LocateSearchedShip(searchedObj);
        myOcean.remove(searchedObj);
        ListCreatedShips();
    }

    // wahl 5
    /**

     Beendet das Spiel.
     @param finish true, um das Spiel zu beenden.
     */
    private  void FinishGame(boolean finish){
        System.out.println("Das spiel wird beendet");
        finish = true;
    }

}
