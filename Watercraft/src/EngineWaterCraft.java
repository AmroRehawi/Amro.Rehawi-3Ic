import java.util.Scanner;
import java.util.Random;
public class EngineWaterCraft extends WaterCraft implements IRefuelable{
    Random rand = new Random();
    private int fuelCapacity = rand.nextInt(1, 100);
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

        //falls probleme kommen dann ist nextLine schuld
        // " When sc.nextLine() is used after sc.nextInt(), it will read a newline character after the integer input."
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
    @Override
    public void Charactaristics(){
        System.out.println("Name: "+ name);
        System.out.println("Herstellungsdatum: " + produceDate);
        System.out.println("Material: " + material);
        System.out.println("Aktueller Fuellstand: "+ fuelCapacity);
        System.out.println("Geschichte: hier kommt die generierte Geschichte");
    }



    @Override
    public void GetShape(){

    }
}
