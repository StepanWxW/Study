package chapter15;

public interface MyFunc5<T> {
    int func(T[] vals, T t);
}
class MyArrayOps {
    static <T> int countMachine (T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if(vals[i] == v) count++;
        } return count;
    }
}
class GenericMethodRefDemo {
    static <T> int myOp(MyFunc5<T> f, T[] vals,T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1,2,3,4,2,3,4,4,5};
        String[] strs = {"One", "Two", "Tree", "Two"};
        int count;
        count = myOp(MyArrayOps::<Integer>countMachine,vals,4);
        System.out.println("vals имеет столько четверок: " + count);
        count = myOp(MyArrayOps::<String>countMachine, strs, "Two");
        System.out.println("strs имеет столько \"Two\": " + count);
    }
}