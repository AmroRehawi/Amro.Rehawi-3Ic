public class RowingBoat extends HumanPowerWaterCraft{
    RowingBoat(String _name, String _produceDate, String _material){
        super(_name,_produceDate,_material, false);
    }

    @Override
    public void SetPurpose() {
        HumanPowerWaterCraft.PedalesRecognizer();
    }

}
