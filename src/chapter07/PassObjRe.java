package chapter07;

public class PassObjRe {
    public static void main(String[] args) {
        Test2 ob = new Test2(15,20);
        System.out.println("ob.a and ob.b bofore get" +ob.a +" " +ob.b);

        ob.meth(ob);
        System.out.println("ob.a and ob.b after get" +ob.a +" " + ob.b);

    }
}
