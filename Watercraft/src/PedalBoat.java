public class PedalBoat extends HumanPowerWaterCraft{

    PedalBoat(String _name, String _produceDate, String _material){
        super(_name,_produceDate,_material, true);
    }
    @Override
    public void SetPurpose() {
        HumanPowerWaterCraft.PedalesRecognizer();
    }



}
