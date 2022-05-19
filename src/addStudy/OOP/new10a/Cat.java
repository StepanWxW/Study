package addStudy.OOP.new10a;

public class Cat extends Animal{
    private String name;
    Cat() {
        super();
        name = "Kitten";
        System.out.println("Cat have name: " + name);
    }

    @Override
    void vote() {
        System.out.println("Meow");;
    }

    @Override
    public String toString() {
        return "Ignor!";
    }
}
