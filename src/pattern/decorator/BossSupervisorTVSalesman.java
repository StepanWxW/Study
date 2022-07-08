package pattern.decorator;

public class BossSupervisorTVSalesman extends SupervisorTVSalesman{
    public BossSupervisorTVSalesman(Salesman salesman) {
        super(salesman);
    }
    public String manWork(){
        return "А также руководить продавцами. ";
    }

    @Override
    public String man() {
        return super.man() + manWork();
    }
}
