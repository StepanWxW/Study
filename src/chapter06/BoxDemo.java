package chapter06;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box ();
        double vol;

        mybox.wigft =10;
        mybox.hight =20;
        mybox.depth =15;

        vol = mybox.depth * mybox.hight * mybox.wigft;
        System.out.println("Объем равен " + vol);
    }
}
