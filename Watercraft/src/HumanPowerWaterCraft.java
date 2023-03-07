public class HumanPowerWaterCraft extends WaterCraft{
    private static boolean pedale;
    HumanPowerWaterCraft(String _name, String _produceDate, String _material, boolean _pedale){
        super(_name,_produceDate,_material);
    }

    @Override
    public void SetPurpose() {

    }
    private static void HasPedales(){
        System.out.println("Die quietschenden Pedale vom Tretboot sind noch top in Schuss \uD83E\uDDB6");
    }
    private static void HasRowingBlades(){
        System.out.println("Das glitschige Ruderboot hat genügend Ruderblätter am Board");
    }

    public static void PedalesRecognizer(){
        if(pedale){
            HasPedales();
        }
        else {HasRowingBlades();}
    }
}
