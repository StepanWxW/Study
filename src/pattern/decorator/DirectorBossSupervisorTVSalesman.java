package pattern.decorator;

public class DirectorBossSupervisorTVSalesman extends SupervisorTVSalesman{
    public DirectorBossSupervisorTVSalesman(Salesman salesman) {
        super(salesman);
    }
    public String director() {
        return "И руководить теми кто куроводит продавцами.";
    }

    @Override
    public String man() {
        return super.man() + director();
    }
}
