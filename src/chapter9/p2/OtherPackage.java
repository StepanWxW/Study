package chapter9.p2;

public class OtherPackage {
    OtherPackage() {
        chapter9.p1.Protection p = new chapter9.p1.Protection();
        System.out.println("OtherPackage");
//        System.out.println("n = " + p.n);
//        System.out.println("n_pri = " + p.n_pri);
//        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
