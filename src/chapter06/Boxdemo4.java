package chapter06;

public class Boxdemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        mybox1.wigft = 10;
        mybox1.hight = 20;
        mybox1.depth = 15;

        mybox2.wigft = 3;
        mybox2.hight = 6;
        mybox2.depth = 9;
        vol = mybox1.volume();
        System.out.println("Объем первого равен: " + vol);

        vol = mybox2.volume();
        System.out.println("Объем первого равен: " + vol);
    }
}
