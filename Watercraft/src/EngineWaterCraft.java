import java.util.Scanner;
import java.util.Random;
public class EngineWaterCraft extends WaterCraft implements refuelable{
    Random rand = new Random();
    private int fuelCapacity =0 + rand.nextInt(1, 100);
    EngineWaterCraft(String _name, String _produceDate, String _material){

        super(_name,_produceDate,_material);
    }
    public void Refuel(){
        boolean refuel = false;
        String input;
        int refulPercantageFromUser;
        Scanner sc = new Scanner(System.in);
        System.out.println("Aktueller Füllstand " + fuelCapacity + "%");
        System.out.println("Schiff tanken? ja/nein");
        input = sc.nextLine();

        //falls probleme kommen dann ist nextLine schuld " When sc.nextLine() is used after sc.nextInt(), it will read a newline character after the integer input."
        if (input.equals("ja")){
            refuel = true;
            System.out.println("Wie viel? ");
            refulPercantageFromUser = sc.nextInt();
            fuelCapacity = fuelCapacity + refulPercantageFromUser;
            System.out.println("Tank ist jetzt zu " + fuelCapacity + "% gefullt");
        }


    }

    @Override
    public void SetPurpose() {

    }
}
