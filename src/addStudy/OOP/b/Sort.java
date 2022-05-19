package addStudy.OOP.b;

public interface Sort {
    int[] sort(int[] array) {
        int[] array1 = new int[array.length];
        for (int i=0; i<array.length; i++){
        array1[i] = array[i] + 1;}
        return array1;
    }
    String getName() {
        return "Something";
    }
}
