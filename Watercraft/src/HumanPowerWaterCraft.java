import java.util.Scanner;

public class HumanPowerWaterCraft extends WaterCraft implements IVestWornable{
    private static boolean pedals;
    private boolean crewWearingVest = true;

    HumanPowerWaterCraft(String _name, String _produceDate, String _material, boolean _pedale){
        super(_name,_produceDate,_material);
        pedals = _pedale;
    }

    @Override
    public void SetPurpose() {

    }
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
    }



    @Override
    public void GetShape(){

    }

    private static void HasPedales(){
        System.out.println("Die quietschenden Pedale vom Tretboot sind noch top in Schuss");
    }
    private static void HasRowingBlades(){
        System.out.println("Das glitschige Ruderboot hat genügend Ruderblätter am Board");
    }

    public static void PedalesRecognizer(){
        if(pedals){
            HasPedales();
        }
        else {HasRowingBlades();}
    }

    public void checkCreaWearingVests(boolean crewWearingVests){
        System.out.println("Haben alle Sicherheitswesten an? ja/nein");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        if(userInput.equals("nein")){
            System.out.println("Sicherheitswesten-Alarm! Nicht alle sehen wie Baustellen-Models aus!!");
            crewWearingVests =false;
        }

    }

}
