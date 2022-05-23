package addStudy.OOP.new10c;

import java.util.Arrays;

public class SelectSort implements Sort {
    String name;
    @Override
    public int[] sort(int[] array) {
        int min, temp;

        for (int i = 0; i < array.length-1; i++){
            min = i;
            for (int scan = i+1; scan < array.length; scan++)
                if (array[scan] < array[min])
                    min = scan;

            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }System.out.println("Select");
        return array;
    }


    @Override
    public String getName() {
        name = "Select";
        return name;
    }
}
