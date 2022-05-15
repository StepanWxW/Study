package addStudy;

public class Lesson4 {
    public static void main(String[] args) {

        int array[] = new int[]{1, 3, -5, 8, 21, -32, 46};
        int j = 0;


        for (int num : array) {
            int positiveNumbers = array[j];

            if (positiveNumbers > 0)
                System.out.println(positiveNumbers);
            j++;

        }

    }
}