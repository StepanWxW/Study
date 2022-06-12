package chapter20;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s = "This &copy; , a &copy - not.";
        byte buf[] = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        boolean market = false;
        try (BufferedInputStream f = new BufferedInputStream(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!market) {
                            f.mark(32);
                            market = true;
                        } else {
                            market = false;
                        }
                        break;
                    case ';' :
                        if (market) {
                            market = false;
                            System.out.print(c);
                        } else
                            System.out.print((char) c);
                        break;
                    case ' ' :
                        if (market) {
                            market = false;
                            f.reset();
                            System.out.print("&");
                        } else
                            System.out.print((char) c);
                        break;
                    default:
                        if (!market)
                            System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
        }
    }
}
