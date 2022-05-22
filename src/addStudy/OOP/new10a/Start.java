package addStudy.OOP.new10a;

public class Start {
    public static void main(String[] args) {
        Dog dog = new Dog("asad");
        System.out.println(dog);
        System.out.println(dog.toString());
        Animal cow = new Cow();
        Animal cat = new Cat();
        animal(dog);
        animal(cow);
        animal(cat);

    }
    public static void animal(Animal animal) {
        animal.vote();
    }
}
