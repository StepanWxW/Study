package chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/a;
        } catch (Exception e) {
            System.out.println("Общий перехват.");
        }
//        catch (ArithmeticException e) {
//            System.out.println("Эта ошибка не будет достигнута!");
//        }
     }
}
