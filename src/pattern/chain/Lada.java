package pattern.chain;

public abstract class Lada {
    private int equipment;
    private Lada nextLada;

    public Lada(int priority) {
        this.equipment = priority;
    }

    public void setNextLada(Lada nextLada) {
        this.nextLada = nextLada;
    }
    public void ladaManager(String message, int level){
        if(level >= equipment){
            write(message);
        }
        if (nextLada != null) {
            nextLada.ladaManager(message, level);
        }
    }
    public abstract void write(String message);
}
