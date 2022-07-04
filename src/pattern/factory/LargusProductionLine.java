package pattern.factory;

public class LargusProductionLine implements ProductionLine{

    @Override
    public Lada create() {
        return new Largus();
    }
}
