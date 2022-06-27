package chapter20;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriteDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "Эти данные должны быть выведены в массив";
        char buf[] = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буфер");
            return;
        }
        System.out.println("Буфер в виде символьной строки: ");
        System.out.println(f.toString());
        System.out.println("В массив");

        char[] cr = f.toCharArray();
        for (int i = 0; i< cr.length; i++) {
            System.out.print(cr[i]);
        }
        System.out.println("\n В поток вывода типа FileWriter()");
        try (FileWriter f2 = new FileWriter("test.txt")){
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода: " + e);
        }

        System.out.println("Установка в исходное состояние");
        f.reset();
        for (int i =0; i<3; i++) {
            f.write('X');
        }
        System.out.println(f.toString());
    }
}