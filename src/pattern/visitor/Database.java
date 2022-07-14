package pattern.visitor;

public class Database implements ProjectElement{
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
