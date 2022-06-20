package chapter20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class InputStreamEnumeration implements Enumeration<FileInputStream> {
    private Enumeration<String> files;
    public InputStreamEnumeration(Vector<String> files) {
        this.files = files.elements();
    }
    public boolean hasMoreElements () {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (IOException e) {
            return null;
        }
    }
}
class SequenceInputDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<String>();
        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        InputStreamEnumeration ise = new InputStreamEnumeration(files);
        InputStream input = new SequenceInputStream(ise);
        try {
            while ((c = input.read()) !=-1)
                System.out.print((char) c);
        } catch (NullPointerException e) {
            System.out.println("Ошибка открытия файла");
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода: " + e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия потока ввода SequenceInputStream");
            }
        }
    }
}
