package chapter13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("это строка");
        int i = 1;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
    }
}
