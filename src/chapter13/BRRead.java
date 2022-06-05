package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите q - для выхода.");
        do {
            c = (char) bf.read();
            System.out.print(c);
        } while (c != 'q');
    }
}
