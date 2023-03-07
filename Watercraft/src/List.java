
public class List {
    public static void CallList(){
        WarShip yamato = new WarShip("IJN Yamato", "1990", "Stahl, Alu und Titan");
        ContainerShip jellyFish = new ContainerShip("G.S. Jolly Jellyfish", "1890", "Stahl");
        PedalBoat pedalPirates = new PedalBoat("Pedal Pirate", "1900", "Holz");
        RowingBoat bananaBoat = new RowingBoat("banana Boat", "2010", "Holz");

        yamato.SetPurpose();
        System.out.println("UND");
        jellyFish.SetPurpose();
        System.out.println("WAEHREND");
        pedalPirates.SetPurpose();
        System.out.println("UND");
        bananaBoat.SetPurpose();

        yamato.Refuel();
    }
}
