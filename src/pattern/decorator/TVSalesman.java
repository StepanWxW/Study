package pattern.decorator;

public class TVSalesman implements Salesman{

    @Override
    public String man() {
        return "Умеет продавать телевизоры. ";
    }
}
