package chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class Transform extends RecursiveAction {
    int seqThreshold;
    double[] data;
    int start, end;
    Transform(double[] vals, int s,int e, int t) {
        data = vals;
        start = s;
        end = e;
        seqThreshold = t;
    }

    @Override
    protected void compute() {
        if((end-start) < seqThreshold) {
            for(int i= start; i <end; i++) {
                if((data[i] % 2) == 0)
                data[i] =Math.sqrt(data[i]);
                else data[i] = Math.cbrt(data[i]);
            }
        }
        else {
            int middle = (start + end)/2;
            invokeAll(new Transform(data, start, middle, seqThreshold), new Transform(data, middle,end,seqThreshold));
        }
    }
}
class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;
        if (args.length !=2) {
            System.out.println("Использование: FJExperiment параллелизм порог ");
            return;
        }
        pLevel = Integer.parseInt(args[0]);
        threshold = Integer.parseInt(args[1]);
        long beginT, endT;
        ForkJoinPool fjp = new ForkJoinPool(pLevel);
        double[] nums = new double[1000000];
        for (int i =0; i<nums.length; i++)
            nums[i] = (double) i;
        beginT = System.nanoTime();
        Transform task = new Transform(nums, 0, nums.length, threshold);
        endT = System.nanoTime();
        System.out.println("Уровень паралелизма: " + pLevel);
        System.out.println("Порог последовательно обработки " + threshold);
        System.out.println("Истекшее время: " + (endT-beginT) + " нс");
        System.out.println();
    }
}