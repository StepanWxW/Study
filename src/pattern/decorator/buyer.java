package pattern.decorator;

public class buyer {
    public static void main(String[] args) {
        Salesman salesman = new DirectorBossSupervisorTVSalesman(new BossSupervisorTVSalesman(new TVSalesman()));
        System.out.println(salesman.man());
    }
}
