package chapter06;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box ();
        Box mybox2 = new Box ();
        double vol;

        mybox1.wigft =10;
        mybox1.hight =20;
        mybox1.depth =15;

        mybox2.wigft =3;
        mybox2.hight =6;
        mybox2.depth =9;

        vol = mybox1.depth * mybox1.hight * mybox1.wigft;
        System.out.println("Объем равен " + vol);
        vol = mybox2.depth * mybox2.hight * mybox2.wigft;
        System.out.println("Объем равен " + vol);
    }
}
