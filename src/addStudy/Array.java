package addStudy;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[]{ 3,2,3,1,5 };
        int j;
        int n = 0;
        for (int i = 0; i<array.length; i++) {
            j = array[n];
            System.out.println(j);
            n++;
        }
            int[] array1 = new int[]{ 3,2,3,1,5,9,1 };
            for ( int num : array1) {
                System.out.println(num);
            }

    }
}
