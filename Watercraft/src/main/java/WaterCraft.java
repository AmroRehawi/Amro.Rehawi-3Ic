/**

 Die abstrakte Klasse WaterCraft stellt eine Grundlage für Wasserfahrzeuge dar.
 */
public abstract class WaterCraft {


    protected String name;

    protected String produceDate;

    protected String material;

    private String story;

    protected String purpose;
    /**

     Konstruiert ein neues WaterCraft-Objekt.
     @param _name Der Name des Wasserfahrzeugs.
     @param _produceDate Das Produktionsdatum des Wasserfahrzeugs.
     @param _material Das Material, aus dem das Wasserfahrzeug gebaut ist.
     */
    WaterCraft(String _name, String _produceDate, String _material) {
        name = _name;
        produceDate = _produceDate;
        material = _material;
    }
    /**

     Ruft die Geschichte des Wasserfahrzeugs ab.
     @param _story Die Geschichte des Wasserfahrzeugs.
     */
    void GetStory(String _story) {
        story = _story;
    }
    /**

     Gibt den Steckbrief des Wasserfahrzeugs zurück.
     */
    public abstract void Charactaristics();
    /**

     Setzt den Zweck des Wasserfahrzeugs.
     */
    public abstract void SetPurpose();
    /**

     Gibt die Form des Wasserfahrzeugs zurück.
     */
    public abstract void GetShape();
}