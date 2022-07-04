package pattern.factory;

public class Factory {
    public static void main(String[] args) {
        ProductionLine auto = chooseAuto("Vesta");
        Lada lada = auto.create();
        lada.create();

    }

    public static ProductionLine chooseAuto(String name) {
       if (name.equals("Largus")) {
           return new LargusProductionLine();
       } else if (name.equals("Vesta")) {
           return new VestaProductionLine();
       } else throw new RuntimeException("Беда, нет такого авто.");
    }
}
