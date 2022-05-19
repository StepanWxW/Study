package addStudy.OOP.new10a;

public class Dog extends Animal {
    private static String name;
    public Dog(String vote, int age, String name) {
        super(vote, age);
        Dog.name = name;
    }
    @Override
    public String toString() {
        return super.toString() + " Name dog is: " + Dog.name;
    }
}
