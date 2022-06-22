package chapter20;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String s ="Это знак авторского права &copy; " +
                ", а &copy - нет.\n";
        char buf[] = new char[s.length()];
        s.getChars(0,s.length(), buf, 0);
        CharArrayReader in = new CharArrayReader(buf);
        int c;
        boolean marker = false;
        try (BufferedReader f = new BufferedReader(in)){
            while ((c = f.read()) !=-1) {
                switch (c) {
                    case '&':
                        if(!marker) {
                            f.mark(32);
                            marker = true;
                        } else {
                            marker = false;
                        }
                        break;
                    case ';':
                        if (marker) {
                            marker = false;
                            System.out.print("(c)");
                        } else
                            System.out.print((char) c);
                        break;
                    case ' ':
                        if (marker) {
                            marker =false;
                            f.reset();
                            System.out.print("&");
                        } else System.out.print((char) c);
                        break;
                    default:
                        if (!marker)
                            System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода " + e);
        }
    }
}
