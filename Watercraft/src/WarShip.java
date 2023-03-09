
import java.util.Scanner;
public class WarShip extends EngineWaterCraft{

    WarShip(String _name, String _produceDate, String _material){
        super(_name,_produceDate,_material);
    }

    @Override
    public void SetPurpose() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Was ist der Zweck vom Schiff " + name + "?");
        purpose = sc.nextLine();
        System.out.println("Der Zweck vom Schiff " + name + " ist "+ purpose);

    }
    @Override
    public void GetShape(){
        System.out.println("                                     |__\n" +
                "                                     |\\/\n" +
                "                                     ---\n" +
                "                                     / | [\n" +
                "                              !      | |||\n" +
                "                            _/|     _/|-++'\n" +
                "                        +  +--|    |--|--|_ |-\n" +
                "                     { /|__|  |/\\__|  |--- |||__/\n" +
                "                    +---------------___[}-_===_.'____               /\\\n" +
                "                ____`-' ||___-{]_| _[}-  |     |_[___\\==--          \\/   _\n" +
                " __..._____--==/___]_|__|_____________________________[___\\==--___,-----' .7\n" +
                "|                                                                   BB-61/\n" +
                " \\_______________________________________________________________________|");
    }


}
