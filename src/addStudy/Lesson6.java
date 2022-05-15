package addStudy;

public class Lesson6 {
    public static void main(String[] args) {
        int array[] = new int[] {15,20,75,10,83,11};
        int search = 10;

        for (int num : array) {
            if (num == search) {
                continue;
            }
            System.out.println(num);
        }
    }
}
