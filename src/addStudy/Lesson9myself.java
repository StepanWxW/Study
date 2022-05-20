package addStudy;

import java.util.Arrays;

public class Lesson9myself {
    public static void main(String[] args) {
        bubbles starter = new bubbles();
        starter.start();
    }
}
class bubbles {
    void start() {
        int[] array = new int[]{53, 21, 13, 45, 67, 9, 1, 55, 33, 568, 32, 13};
        boolean check = false;
                int buf = 0;
                while (!check) {
                    check = true;
                    for (int i = 0; i < array.length - 1; i++) {
                        if (array[i] > array[i + 1]) {
                            check = false;
                            buf = array[i + 1];
                            array[i + 1] = array[i];
                            array[i] = buf;
                        }

            }

        }
        System.out.println(Arrays.toString(array));
    }
}