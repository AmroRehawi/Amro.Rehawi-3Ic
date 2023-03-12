/**

 Die Klasse ContainerShip ist eine Unterklasse von EngineWaterCraft, die ein Containerschiff repräsentiert.
 */
public class ContainerShip extends EngineWaterCraft{
    /**

     Konstruktor, um ein ContainerShip-Objekt zu erstellen.
     @param _name Der Name des Containerschiffs.
     @param _produceDate Das Herstellungsdatum des Containerschiffs.
     @param _material Das Material des Containerschiffs.
     */
    ContainerShip(String _name, String _produceDate, String _material){
        super(_name,_produceDate,_material);
    }
    /**

     Gibt den Zweck des Containerschiffs aus.
     */
    @Override
    public void SetPurpose() {
        System.out.println("Der Zweck vom Schiff "+ name + " ist Containertransport");
    }


    /**

     Gibt die Form des Containerschiffs aus.
     */
    @Override
    public void GetShape(){
        System.out.println("                                  )___(\n" +
                "                           _______/__/_\n" +
                "                  ___     /===========|   ___\n" +
                " ____       __   [\\\\\\]___/____________|__[///]   __\n" +
                " \\   \\_____[\\\\]__/___________________________\\__[//]___\n" +
                "  \\40A                                                 |\n" +
                "   \\                                                  /\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

