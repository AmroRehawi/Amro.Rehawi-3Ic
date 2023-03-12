/**

 Die Klasse Pedalboot erweitert die Klasse HumanPowerWaterCraft und implementiert die Methoden SetPurpose und GetShape.
 */
public class PedalBoat extends HumanPowerWaterCraft{
    /**

     Der Konstruktor der Klasse Pedalboot ruft den Konstruktor der Klasse HumanPowerWaterCraft auf und setzt die Variable pedals auf true.
     @param _name Name des Pedalboots.
     @param _produceDate Datum der Herstellung des Pedalboots.
     @param _material Material des Pedalboots.
     */

    PedalBoat(String _name, String _produceDate, String _material){
        super(_name,_produceDate,_material, true);
    }

    /**

     Überschreibt die Methode SetPurpose der Klasse HumanPowerWaterCraft. Ruft die Methode PedalesRecognizer auf.
     */
    @Override
    public void SetPurpose() {
        HumanPowerWaterCraft.PedalesRecognizer();
    }
    /**

     Überschreibt die Methode GetShape der Klasse HumanPowerWaterCraft. Gibt eine Textgrafik des Pedalboots aus.
     */

    @Override
    public void GetShape(){
        System.out.println("                   v  ~.      v\n" +
                "          v           /|\n" +
                "                     / |          v\n" +
                "              v     /__|__\n" +
                "                  \\--------/\n" +
                "~~~~~~~~~~~~~~~~~~~`~~~~~~'~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }



}
