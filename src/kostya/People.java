package kostya;

public class People {
    Leg leg;
    int age;
    String name;

    void print() {
        System.out.println(1);
    }
    @Override
    public String toString() {
        return "Thread.People{" +
                "leg=" + leg +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Leg leg = new Leg();

        leg.setName("Right");
        String right = leg.getName();

        System.out.println(right);
    }
}
