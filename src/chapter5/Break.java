package chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first: {
            second: {
            third:{
                System.out.println("Предшествует оператору break");
                if (t) break second;
                System.out.println("Это не будет выполняться1");

            }System.out.println("Это не будет выполняться2");
            }System.out.println("Этот оператор следует за блоком");
        }
    }
}
