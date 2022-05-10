package chapter07;

public class Test {
    int a,b;
    Test (int o, int j){
        a = o;
        b = j;
    }
    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
            else return false;

    }

    public void meth(int a, int b) {
    }
}
