package addStudy;

public class Lesson6 {
    public static void main(String[] args) {
        Start1 start1 = new Start1();
        start1.starter();
    }
}
        class Start1 {

            void starter() {
                int array[] = new int[]{15, 20, 75, 10, 83, 11};
                int search = 10;

                for (int num : array) {
                    if (num == search) {
                        continue;
                    }
                    System.out.println(num);
                }

            }
        }

