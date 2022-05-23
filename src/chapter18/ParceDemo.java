package chapter18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParceDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        int i;
        int sum =0;
        System.out.println("Введите число, 0 - для выхода.");
        do {
            br.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат");
                i = 0;
            }
            sum +=i;
            System.out.println("Текущая сумма: " + sum);
        } while (i !=0);

    }
}
