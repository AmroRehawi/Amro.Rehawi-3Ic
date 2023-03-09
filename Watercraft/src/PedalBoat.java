public class PedalBoat extends HumanPowerWaterCraft{

    PedalBoat(String _name, String _produceDate, String _material){
        super(_name,_produceDate,_material, true);
    }
    @Override
    public void SetPurpose() {
        HumanPowerWaterCraft.PedalesRecognizer();
    }

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
