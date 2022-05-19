package addStudy.OOP.b;

import java.util.Arrays;

public class BublleSort implements Sort {
    Start start = new Start();
    start.array();

    BublleSort() {


        boolean flag = false;
        int buf = 0;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[i + 1]) {
                    flag = false;
                    buf = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buf;
                }
            }
        }

    }
        @Override
        public String getName () {
           return Arrays.toString(array);

        }
    }

