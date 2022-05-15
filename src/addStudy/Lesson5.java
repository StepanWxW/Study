package addStudy;

public class Lesson5 {
    public static void main(String[] args) {


        int array[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int search = 14;
        for (int num : array) {

            if (num == search) {
                System.out.println("Мы нашли искомое число в массиве: " + search + " и прекращаем поиск. Чило это уже не будем выводить далее.");
            break;
            }
            System.out.println(num);
        }
    }
}
