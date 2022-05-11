package kostya;

public class Leg {
    private String name;
    public Leg(){
    }

    public Leg(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void print() {
        System.out.println(name);
    }
}
