/**

 Die Klasse HumanPowerWaterCraft erbt von der Klasse WaterCraft und implementiert das Interface IVestWornable.
 Sie stellt Boote dar, die von Menschenkraft angetrieben werden.
 */
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Scanner;

public class HumanPowerWaterCraft extends WaterCraft implements IVestWornable{
    private static boolean pedals;
    private boolean crewWearingVest = true;
    /**
     * Erzeugt ein neues HumanPowerWaterCraft Objekt mit gegebenen Namen, Herstellungsdatum, Material und der Information, ob es Pedale hat oder nicht.
     * @param _name der Name des Boots
     * @param _produceDate das Herstellungsdatum des Boots
     * @param _material das Material des Boots
     * @param _pedale `true`, wenn das Boot Pedale hat, `false`, wenn es Ruderblätter hat
     */
    HumanPowerWaterCraft(String _name, String _produceDate, String _material, boolean _pedale){
        super(_name,_produceDate,_material);
        pedals = _pedale;
    }
    /**
     * Setzt den Zweck des Boots.
     */
    @Override
    public void SetPurpose() {

    }
    /**
     * Gibt den Steckbrief des Boots aus, einschließlich ob die Crew Sicherheitswesten trägt, ob das Boot Pedale
     * oder Ruderblätter hat und eine generierte Geschichte.
     * Spielt auch einen Sound ab, der je nach Art des Boots unterschiedlich ist.
     */
    @Override
    public void Charactaristics(){
        //eventuell schickst du auch was das für ein schiff ist und zeigst es hier
        // zusätzlich muss in der Klasse hier gebaut werden dass er checkt welches schiff es ist und ein sound abspielt
        System.out.println("Name: "+ name);
        System.out.println("Herstellungsdatum: " + produceDate);
        System.out.println("Material: " + material);
        if(crewWearingVest){ System.out.println("Alle am Bord haben eine Sicherheitsweste an!");}
        else {
            System.out.println("Nicht alle am Bord haben eine Sicherheitsweste an!");
        }
        if(pedals){
            HasPedales();
        }
        else {HasRowingBlades();}

        System.out.println("Geschichte: hier kommt die generierte Geschichte");
        PlaySound();
    }
    /**
     * Gibt die Form des Boots aus. Diese Methode ist leer,
     * da Boote, die von Menschenkraft angetrieben werden, keine bestimmte Form haben.
     */
    @Override
    public void GetShape(){

    }


    /**
     * Überprüft, ob die Crew Sicherheitswesten trägt und gibt eine entsprechende Meldung aus.
     * @param crewWearingVests `true`, wenn alle Crewmitglieder Sicherheitswesten tragen, sonst `false`
     */
    public void checkCrowWearingVests(boolean crewWearingVests){
        System.out.println("Haben alle Sicherheitswesten an? ja/nein");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        if(userInput.equals("nein")){
            System.out.println("Sicherheitswesten-Alarm! Nicht alle sehen wie Baustellen-Models aus!!");
            crewWearingVests =false;
        }
    }
    /**
     * Spielt einen Sound ab, der je nach Art des Boots unterschiedlich ist.
     * Der Sound wird aus einer Audio-Datei abgespielt
     * Der Name der Datei wird aus dem Klassentyp des Boots bestimmt.
     * Das Abspielen des Sounds wird durch das Ende des Clips beendet.
     * Bei einem Fehler wird eine Fehlermeldung ausgegeben.
     */
    /**
     * Überprüft, ob das Boot Pedale hat und gibt eine entsprechende Meldung aus.
     */

    public static void PedalesRecognizer(){
        if(pedals){
            HasPedales();
        }
        else {HasRowingBlades();}
    }
    private void PlaySound(){
        Class<?> c = this.getClass();
        String audioName = "";

        if (c == RowingBoat.class) {
            audioName = "rowingboat.wav";
        } else if (c == PedalBoat.class) {
            audioName = "pedalboat.wav";
        }
        try {
            File soundFile = new File(audioName); // Pfad zur Audio-Datei angeben
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(soundFile));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000); // Warten, bis die Wiedergabe beendet ist
            clip.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void HasPedales(){
        System.out.println("Die quietschenden Pedale vom Tretboot sind noch top in Schuss");
    }
    private static void HasRowingBlades(){
        System.out.println("Das glitschige Ruderboot hat genügend Ruderblätter am Board");
    }



}
