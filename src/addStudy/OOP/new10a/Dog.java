package addStudy.OOP.new10a;

public class Dog extends Animal {
    private String name;
    Dog(String name) {
        super();
        this.name = name;
        System.out.println("Dog have name: " + name);
    }

    @Override
    void vote() {
        System.out.println("GAV!");;
    }
}