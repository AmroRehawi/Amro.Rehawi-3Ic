public class ContainerShip extends EngineWaterCraft{
    ContainerShip(String _name, String _produceDate, String _material){
        super(_name,_produceDate,_material);
    }

    @Override
    public void SetPurpose() {
        System.out.println("Der Zweck vom Schiff "+ name + " ist Containertransport");
    }



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

