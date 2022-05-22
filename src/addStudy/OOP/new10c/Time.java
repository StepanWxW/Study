package addStudy.OOP.new10c;

public class Time implements Sort  {


    int[] array = new int[]{12, 30, 45, 64, 12, 323, 11};


    public void stasticTime()
    {
        long startTime = System.currentTimeMillis();
        sort();
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");
    }
    BubbleSort b = new BubbleSort();

    b.sort(array);
    public void exTime(b.sort(array))

    {
        long startTime = System.nanoTime();
        methodToTime();
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
    }
}

