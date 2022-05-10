package chapter07;

public class VarArgs {
        static void VaTest (int ... v) {
            System.out.println("Number of arguments: " +v.length + " content: " );
            for (int x: v) {
                System.out.print(x + " ");
                System.out.println();
            }
    }

    public static void main(String[] args) {
        VaTest(10);
        VaTest(1,2,3);
        VaTest();
    }
}
