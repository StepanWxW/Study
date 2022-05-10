package chapter07;

public class VarArgs3 {
    static void VaTest (int ... v) {
        System.out.print("vaTest int: number of arguments" + v.length + " content: ");
        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }
        static void VaTest(boolean ... v) {
            System.out.print("vaTest boolean: number of arguments" + v.length + " content: ");
            for (boolean x : v) {
                System.out.print(x + " ");
                System.out.println();
            }
        }
        static void VaTest(String msg, int ... v) {
            System.out.print("vaTest (String, int... ): number of arguments" + v.length + " content: ");
            for (int x : v) {
                System.out.print(x + " ");
                System.out.println();
            }
        }

    public static void main(String[] args) {
        VaTest(1,2,3);
        VaTest("Examination: ", 10,30);
        VaTest(true,false,true);
    }
}
