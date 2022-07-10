package pattern.iterator;

public class LadaRunner {
    public static void main(String[] args) {
        String[] equipment = {"Кондиционер","Люк","Подогрев сидений","Поворотники"};
        Lada lada = new Lada("Granta", equipment);
        Iterator iterator = lada.getIterator();
        System.out.println("Lada: " + lada.getName());
        System.out.println("equipment: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + ", ");
        }
    }
}
