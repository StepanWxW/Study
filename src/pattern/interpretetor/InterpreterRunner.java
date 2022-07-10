package pattern.interpretetor;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isLada = getLadaNormalExpression();
        Expression isLadaConditioner = getLadaNormalConditioner();
        System.out.println("Лада в комплектации нормал? : " + isLada.interpret("LadaNormal"));
        System.out.println("Лада в комплектации нормал? и кондиционер? : " + isLadaConditioner.interpret("LadaNormalConditioner"));
    }
    public static Expression getLadaNormalExpression(){
        Expression lada = new TerminalExpression("Lada");
        Expression ladaNormal = new TerminalExpression("LadaNormal");
        return new OrExpression(lada,ladaNormal);
    }
    public static Expression getLadaNormalConditioner() {
        Expression lada = new TerminalExpression("Lada");
        Expression ladaNormal = new TerminalExpression("LadaNormalConditioner");
        return new AndExpression(lada,ladaNormal);
    }
}
