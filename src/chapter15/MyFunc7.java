package chapter15;

public interface MyFunc7<R,T> {
    R Func(T t);
}
class My1Class<T> {
    private T val;
    My1Class(T v) {
        val = v;
    }
    My1Class(){
        val = null;
    }
    T getVal() {
        return val;
    }
}
class My2Class {
    String str;
    My2Class(String s) {
        str =s;
    }
    My2Class() {
        str = null;
    }
    String getStr(){
        return str;
    }
}
class ConstructorRefDemo3 {
    static <R,T> R myClassFactory(MyFunc7<R,T> cons,T v) {
        return cons.Func(v);
    }

    public static void main(String[] args) {
        MyFunc7<My1Class<Double>, Double> myClassCons = My1Class::new;
        My1Class<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в объекте mc равно: " + mc.getVal());

        MyFunc7<My2Class, String> myClassString = My2Class::new;
        My2Class mc2 = myClassFactory(myClassString, "String");
        System.out.println("Значение string в объекте mc равно: " + mc2.getStr());
    }
}
