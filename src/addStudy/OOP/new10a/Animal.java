package addStudy.OOP.new10a;

class Animal {
    private String nameClass;
    private String voice;
    private String head;
    private int age;
    static {
        System.out.println("static block");
    }
    {
        voice = "abc";
        System.out.println("non static block");
    }
    Animal() {
        System.out.println("constructor block" + voice);
    }

    void vote() {
        System.out.println("Voice animal: " + voice);
    }
    String vote(String name) {
        System.out.println("Voice animal: " + voice);
        return name;
    }
}


