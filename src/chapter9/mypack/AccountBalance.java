package chapter9.mypack;

public class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("Fiel", 123.23);
        current[1] = new Balance("Fiel1", 25.26);
        current[2] = new Balance("Fiel2", -12.23);
        for (int i=0; i<3; i++) current[i].show();
    }
}
