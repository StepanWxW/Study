package pattern.adapter;

public class Adapter extends JavaApplication implements Crud{
    @Override
    public void create() {
        insert();
    }

    @Override
    public void read() {
        deliver();
    }

    @Override
    public void update() {
        improve();
    }

    @Override
    public void delete() {
        deleteJavaApplication();
    }
}
