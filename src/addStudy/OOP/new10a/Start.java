package addStudy.OOP.new10a;

public class Start {
    public static void main(String[] args) {
        Animal animal =new Animal();
        Dog dog = new Dog("Ball");
        dog.vote();
        dog.toString();
        Cat cat = new Cat();
        cat.vote();
        cat.toString();
        Cow cow = new Cow();
        cow.vote();
        cow.toString();
    }
}
