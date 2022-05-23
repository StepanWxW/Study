package addStudy.OOP.new10c;

public class Random {

    int[] random() {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 1000));
        }
        return array;
    }
}
