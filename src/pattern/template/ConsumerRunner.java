package pattern.template;

public class ConsumerRunner {
    public static void main(String[] args) {
        Granta granta = new Granta();
        Vesta vesta = new Vesta();

        granta.showEquipment();

        System.out.println("\n=====================\n");

        vesta.showEquipment();
    }
}
