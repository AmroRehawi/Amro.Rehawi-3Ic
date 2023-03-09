import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList<WaterCraft> myOcean = new ArrayList<WaterCraft>();
    String name;
    String produceDate;
    String material;

    public void CallList(){

        WarShip yamato = new WarShip("IJN Yamato", "1990", "Stahl, Alu und Titan");
        ContainerShip jellyFish = new ContainerShip("G.S. Jolly Jellyfish", "1890", "Stahl");
        PedalBoat pedalPirates = new PedalBoat("Pedal Pirate", "1900", "Holz");
        RowingBoat bananaBoat = new RowingBoat("banana Boat", "2010", "Holz");
        myOcean.add(yamato);
    }
    private void ListMenu(){
        System.out.println("Eine Wahl treffen:");
        System.out.println("1. Schiff erzeugen");
        System.out.println("2. Schiff generieren lassen");
        System.out.println("3. Steckbrief");
        System.out.println("4. Eines der Schiffe loeschen");
    }
    public void ProcessMenuSelection(){

        int menuSelection;
        boolean invalidInput = false;
        ListMenu();
        menuSelection = sc.nextInt();

        switch (menuSelection) {
            case 1:
                CreateShip();
                System.out.println(myOcean);
                break;
            case 2:
                System.out.println(myOcean.get(0));
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                invalidInput = true;
                System.out.println("Eingabe ungueltig, nochmal probieren!");
                break;
        }

    }
    // Wahl 1

    private void ListShips(){
        System.out.println("1. Kriegsschif");
        System.out.println("2. Containerschiff");
        System.out.println("3. Pedalboot");
        System.out.println("4. Ruderboot");


    }
    private void ShipsSpecifications(){
        System.out.println("Schiffsname eingeben:");
        name = sc.nextLine();
        System.out.println("Herstellungsjahr: ");
        produceDate = sc.nextLine();
        System.out.println("Material: ");
        material = sc.nextLine();
    }
    private void CreateShip(){
        int shipSelection;
        System.out.println("Art des Schiffes wählen: ");
        ListShips();
        shipSelection = sc.nextInt();

        ShipsSpecifications();

        switch (shipSelection) {
            case 1 -> myOcean.add(new WarShip(name, produceDate, material));
            case 2 -> myOcean.add(new ContainerShip(name, produceDate, material));
            case 3 -> myOcean.add(new PedalBoat(name, produceDate, material));
            case 4 -> myOcean.add(new RowingBoat(name, produceDate, material));
        }
    }
    private void ShowCharactaristics(){
        System.out.println("Von welchem Tier moechten Sie den Steckbrief sehen?");

        for (int i=0; i<myOcean.toArray().length; i++){

        }
    }


}
