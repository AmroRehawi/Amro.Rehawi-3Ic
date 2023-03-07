public class ContainerShip extends EngineWaterCraft{
    ContainerShip(String _name, String _produceDate, String _material){
        super(_name,_produceDate,_material);
    }

    @Override
    public void SetPurpose() {
        System.out.println("Der Zweck vom Schiff "+ name + " ist Containertransport");
    }
}
