package addStudy.OOP.new10a;

public class Cow extends Animal {
    static{
        System.out.println("static block of cow");
    }

    {
        System.out.println("non static block of cow");
    }
    Cow() {
        System.out.println("Constuructor of cow");
    }
    @Override
    void vote() {
        System.out.println("Myyy!");;
    }

}
