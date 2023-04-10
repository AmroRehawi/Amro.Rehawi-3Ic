/**
 Die Klasse EngineWaterCraft erbt von WaterCraft und implementiert das Interface IRefuelable.
 Sie repräsentiert ein Wasserfahrzeug mit Motor und Kraftstofftank.
 */

import java.util.Scanner;
import java.util.Random;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class EngineWaterCraft extends WaterCraft implements IRefuelable{
    Random rand = new Random();
    private int fuelCapacity = rand.nextInt(1, 100);
    /**
     * Konstruktor der Klasse EngineWaterCraft
     * @param _name Name des Wasserfahrzeugs
     * @param _produceDate Herstellungsdatum des Wasserfahrzeugs
     * @param _material Material des Wasserfahrzeugs
     */
    EngineWaterCraft(String _name, String _produceDate, String _material){

        super(_name,_produceDate,_material);
        Refuel();
    }
    /**
     * Methode zum Betanken des Wasserfahrzeugs.
     * Es wird ein Random Füllstand Wert generiert
     * Der User wird gefragt ob das Schiff betankt werden soll
     */
    public void Refuel(){
        String input;
        int refulingPercantage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Aktueller Fuellstand " + fuelCapacity + "%");
        System.out.println("Schiff tanken? ja/nein");
        input = sc.nextLine();

        if (input.equals("ja")){
            System.out.println("Wie viel? ");
            refulingPercantage = sc.nextInt();
            fuelCapacity = fuelCapacity + refulingPercantage;
            System.out.println("Tank ist jetzt zu " + fuelCapacity + "% gefullt");
        }
    }

    @Override
    public void SetPurpose() {

    }
    /**
     * Methode zum Ausgeben des Steckbriefes des Wasserfahrzeugs.
     */
    @Override
    public void Charactaristics(){
        System.out.println("Name: "+ name);
        System.out.println("Herstellungsdatum: " + produceDate);
        System.out.println("Material: " + material);
        System.out.println("Aktueller Fuellstand: "+ fuelCapacity);
        System.out.println("Geschichte: hier kommt die generierte Geschichte");
        GetShape();
        PlaySound();

    }
    /**
     * Methode zum Abspielen eines Sounds passend zum Typ des Wasserfahrzeugs.
     */
private void PlaySound(){
    Class<?> c = this.getClass();
    String audioName = "";

    if (c == WarShip.class) {
        audioName = "warship.wav";
    } else if (c == ContainerShip.class) {
        audioName = "containership.wav";
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

    @Override
    public void GetShape(){

    }
}
