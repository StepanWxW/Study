package addStudy.OOP.new10c;


import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Random random = new Random();
        Sort bubble = new BubbleSort();
        Sort quick = new QuickSort();
        Sort select = new SelectSort();
        Time time = new Time();
        time.stasticTime(bubble, random.random());
//        time.stasticTime(quick, random.random());
        time.stasticTime(select, random.random());
    }
}
