/**

 Die Klasse WarShip ist eine Unterklasse von EngineWaterCraft und repräsentiert
 ein Kriegsschiff mit einem Namen, Produktionsdatum und Material.
 */
import java.util.Scanner;
public class WarShip extends EngineWaterCraft{
/**
 * Erstellt ein neues WarShip Objekt mit einem gegebenen Namen, Produktionsdatum und Material.
 * @param _name Der Name des Schiffes.
 * @param _produceDate Das Produktionsdatum des Schiffes.
 * @param _material Das Material des Schiffes.
 */
    WarShip(String _name, String _produceDate, String _material){
        super(_name,_produceDate,_material);
    }
    /**
     * Fordert den Benutzer auf, den Zweck des Schiffs einzugeben und speichert die Eingabe in der Variable "purpose".
     */
    @Override
    public void SetPurpose() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Was ist der Zweck vom Schiff " + name + "?");
        purpose = sc.nextLine();
        System.out.println("Der Zweck vom Schiff " + name + " ist "+ purpose);

    }
    /**
     * Gibt die Form des Kriegsschiffs in der Konsole aus.
     */
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
