package chapter07;

public class VarArgs2 {
    static void vaTest (String msg, int ... v) {
        System.out.print(msg + v.length + " content: ");


        for(int x : v)
        System.out.print( x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One variable length parameter: ", 10);
        vaTest("Three variable length parameter: ", 1,2,3);
        vaTest("Without variable length paramter");
    }
}
