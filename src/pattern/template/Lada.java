package pattern.template;

public abstract class Lada {
    public void showEquipment(){
        System.out.println("Колеса");
        showEq();
        System.out.println("Музыка");
    }
    public abstract void showEq();
}
