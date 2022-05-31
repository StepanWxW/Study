package chapter19.study;
import java.util.*;
public class StudyTwo {
//    void search(HashSet<IntNumber> hashIn) {
//        Set<String> duplicates = new HashSet<>();
//        for (int i = 0; i < data.length; i++)
//        {
//            if (duplicates.contains(data[i]))
//            {
//                continue;
//            }
//            for (int j = i + 1; j < data.length; j++)
//            {
//                if (data[i].equals(data[j]))
//                {
//                    duplicates.add(data[i]);
//                    break;
//                }
//            }
//        }
//        System.out.println(duplicates.size());
//    }
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
        HashSet<IntNumber> ts = new HashSet<>();
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
//        st.search(ts);

    }
}
