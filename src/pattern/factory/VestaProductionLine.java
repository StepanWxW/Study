package pattern.factory;

public class VestaProductionLine implements ProductionLine{


    @Override
    public Lada create() {
        return new Vesta();
    }
}
