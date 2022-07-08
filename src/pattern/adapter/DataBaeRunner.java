package pattern.adapter;

public class DataBaeRunner {
    public static void main(String[] args) {
        Crud crud = new Adapter();
        crud.create();
        crud.read();
        crud.update();
        crud.delete();
    }
}
