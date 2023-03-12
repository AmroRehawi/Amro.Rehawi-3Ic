/**

 Die Klasse RowingBoat erweitert die Klasse HumanPowerWaterCraft und implementiert die Methoden SetPurpose und GetShape.
 */
public class RowingBoat extends HumanPowerWaterCraft{
    /**
     * Erstellt ein neues Ruderboot-Objekt mit dem gegebenen Namen, Produktionsdatum und Material.
     * @param _name Der Name des Ruderboots.
     * @param _produceDate Das Datum der Herstellung des Ruderboots.
     * @param _material Das Material, aus dem das Ruderboot hergestellt ist.
     */
    RowingBoat(String _name, String _produceDate, String _material){
        super(_name,_produceDate,_material, false);
    }
    /**
     * Setzt den Zweck des Ruderboots.
     * Ruft die Methode PedalesRecognizer aus der Klasse HumanPowerWaterCraft auf.
     */
    @Override
    public void SetPurpose() {
        HumanPowerWaterCraft.PedalesRecognizer();
    }
    /**
     * Gibt die Form des Ruderboots aus.
     */
    @Override
    public void GetShape(){
        System.out.println("                                \\\n" +
                "                                  \\   O,\n" +
                "                        \\___________\\/ )_________/\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \\~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "                                        \\");
    }


}
