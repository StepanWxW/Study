package addStudy.OOP.new10a;

public class Start {
    public static void main(String[] args) {
        Cat cat = new Cat( "meow",3);
        Dog dog = new Dog("Gav", 5, "Ball");
        Cow cow = new Cow("Myy",8,"Byrenka");
        System.out.println(cat);
        cat.vote();
        System.out.println(dog);
        dog.vote();
        System.out.println(cow);
        dog.setAge(6);
        System.out.println(dog);
    }
}
