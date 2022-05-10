package chapter07;

public class StringSemo2 {
    public static void main(String[] args) {
        String strOb1 = "First line";
        String strOb2 = "Second line";
        String strOb3 = strOb1;

        System.out.println("Lenght line strOb1 is: " + strOb1.length());
        System.out.println("Sumbol by index (3) is: " + strOb1.charAt(3));

        if(strOb2.equals(strOb1))
            System.out.println("First line = Second line");
        else
            System.out.println("First line != Second line");

        if (strOb1.equals(strOb3))
            System.out.println("First line = Third line");
        else
            System.out.println("First line != Third line");
    }
}
