package addStudy.OOP.new10a;

import static java.lang.System.out;

class Animal {
    private String nameClass;
    private String voice;
    private String head;
    private int age;
    static {
        out.println("static block");
    }
    {
        voice = "abc";
        out.println("non static block");
    }
    Animal() {
        out.println("constructor block" + voice);
    }

    void vote() {
        System.out.println("Voice animal: " + voice);
    }
    String vote(String name) {
        out.println("Voice animal: " + voice);
        return name;
    }
}


