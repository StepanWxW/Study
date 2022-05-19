package addStudy.OOP.new10a;

public class Cow extends Animal {
    private static String name;
    public Cow(String vote, int age, String name) {
        super(vote, age);
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + " Name Cow is: " +Cow.name;
    }
}
