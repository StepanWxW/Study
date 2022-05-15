package addStudy;
// нот ворк
public class Array2 {
    public static void main(String[] args) {


        int[] array = new int[]{ 3,2,3,24,1,9,8,6, };
        int maxBet = array[0];
        for (int num: array) {
            if (maxBet < num) {
                maxBet = num;
            }
        }
        System.out.println(maxBet);

        int minBet = array[0];
        for (int num: array) {
            if (minBet > num) {
                minBet = num;
            }
        }
        System.out.println(minBet);

        int sumArray = array[0];
        for (int num: array) {
            sumArray = num + sumArray;
        }
        int answer = sumArray/array.length;
        System.out.println(answer);
    }

}


