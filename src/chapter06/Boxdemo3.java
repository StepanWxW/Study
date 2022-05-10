package chapter06;

public class Boxdemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box ();
        Box mybox2 = new Box ();

        mybox1.wigft =10;
        mybox1.hight =20;
        mybox1.depth =15;

        mybox2.wigft =3;
        mybox2.hight =6;
        mybox2.depth =9;
        mybox1.volume();
        mybox2.volume();
    }
}
