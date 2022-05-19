package addStudy.OOP.new10a;

public class Animal {
    private String nameclass;
    private String vote;
    private int age;

    Animal(String vote, int age) {
        this.nameclass = getClass().getSimpleName();
        this.vote = vote;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "nameclass='" + nameclass + '\'' +
                ", vote='" + vote + '\'' +
                ", age=" + age;
    }

    void vote() {
        System.out.println(nameclass + " say: " +vote);
    }

}
