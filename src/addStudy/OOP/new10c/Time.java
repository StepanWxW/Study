package addStudy.OOP.new10c;

public class Time  {
    public void stasticTime(Sort sortTime, int[] array) {
        long startTime = System.nanoTime();
        sortTime.sort(array);
        long endTime = System.nanoTime();
        long output = (endTime- startTime);
        double outputInSecond = (double) output / 1000000000;
        System.out.println("Total execution time: " + (outputInSecond) + " секунды.");
    }
}

