package chapter19.study;
import java.util.*;
public class StudyTwo {
    void search(TreeSet<IntNumber> hashIn) {
//        System.out.println(hashIn);
//        if (tf == true) {
//            System.out.println("Result = " + tf + "\nЧисло " + num + " повторяется " + counter + " раза.");
//        } else System.out.println("Result = " + tf + "\nДубликатов нет.");
    }
}
class IntNumber {
    int num;
    public IntNumber(int num) {
        this.num = num;
    }
    @Override
    public String toString() {
        return "IntNumber{" +
                "num=" + num +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntNumber intNumber = (IntNumber) o;
        return num == intNumber.num;
    }
}
class StudyTwoStart {
    public static void main(String[] args) {
        IntNumber in1 = new IntNumber(5);
        IntNumber in2 = new IntNumber(4);
        IntNumber in3 = new IntNumber(2);
        IntNumber in4 = new IntNumber(3);
        IntNumber in5 = new IntNumber(1);
        IntNumber in6 = new IntNumber(6);
        IntNumber in7 = new IntNumber(8);
        IntNumber in8 = new IntNumber(7);
        IntNumber in9 = new IntNumber(3);
        IntNumber in10 = new IntNumber(10);
        TreeSet<IntNumber> ts = new TreeSet<>();
        ts.add(in1);
        ts.add(in2);
        ts.add(in3);
        ts.add(in4);
        ts.add(in5);
        ts.add(in6);
        ts.add(in7);
        ts.add(in8);
        ts.add(in9);
        ts.add(in10);
        System.out.println(ts);
        StudyTwo st = new StudyTwo();
        st.search(ts);

    }
}
