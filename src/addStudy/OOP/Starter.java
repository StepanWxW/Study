package addStudy.OOP;

public class Starter {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.Characteristics();

        Lada lada = new Lada("Lada",14);
        lada.Characteristics();

        Mercedes mercedes = new Mercedes();
        mercedes.Characteristics();

        Nissan nissan = new Nissan();
        nissan.Characteristics();



        auto = mercedes;
        System.out.println("Again show Mercedes:");
        auto.Characteristics();

        auto = lada;
        System.out.println("Again now Lada: ");
        auto.Characteristics();

        Toyota toy = new Toyota();
        toy.Characteristics();

    }
}
