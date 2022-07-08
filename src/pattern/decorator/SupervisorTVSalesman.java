package pattern.decorator;

public class SupervisorTVSalesman implements Salesman{
    Salesman salesman;

    public SupervisorTVSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    @Override
    public String man() {
        return salesman.man();
    }

}
