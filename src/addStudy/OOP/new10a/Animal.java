package addStudy.OOP.new10a;

class Animal {
     private String nameclass;
     private static String voice;
     private static String head;
     private static int age;
    static {
        voice = "animal vioce.";
        head = "one";
        age = 10;

    }

    public static String getHead() {return head;}
    public static void setHead(String head) {Animal.head = head;}
    public static int getAge() {return age;}
    public static void setAge(int age) {Animal.age = age;}


    Animal() {
            nameclass = getClass().getSimpleName();
           this.head = head;
           this.age = age;
           System.out.println("Name class is: " + nameclass + "\nAnimal have is: " + head + " head, and age is: " + age + ".");
         }
         void vote(){
             System.out.println("Voice animal: " + voice);
         }
    }


