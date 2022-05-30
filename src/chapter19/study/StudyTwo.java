package chapter19.study;
import java.util.*;
public class StudyTwo {
    void search(HashSet<IntNumber> hashIn) {
        Iterator<IntNumber> itr = hashIn.iterator();
        while (itr.hasNext()) {
            IntNumber element = itr.next();
            IntNumber element2 = itr.next();
            System.out.println(element.equals(element2));

        }
    }

//        System.out.println(hashIn);
//        if (tf == true) {
//            System.out.println("Result = " + tf + "\nЧисло " + num + " повторяется " + counter + " раза.");
//        } else System.out.println("Result = " + tf + "\nДубликатов нет.");
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
        IntNumber in1 = new IntNumber(1);
        IntNumber in2 = new IntNumber(2);
        IntNumber in3 = new IntNumber(3);
        IntNumber in4 = new IntNumber(4);
        IntNumber in5 = new IntNumber(5);
        IntNumber in6 = new IntNumber(6);
        IntNumber in7 = new IntNumber(7);
        IntNumber in8 = new IntNumber(8);
        IntNumber in9 = new IntNumber(9);
        IntNumber in10 = new IntNumber(10);
        HashSet<IntNumber> list = new HashSet<>();
        list.add(in1);
        list.add(in2);
        list.add(in3);
        list.add(in4);
        list.add(in5);
        list.add(in6);
        list.add(in7);
        list.add(in8);
        list.add(in9);
        list.add(in10);
        System.out.println(list);
        StudyTwo st = new StudyTwo();
        st.search(list);

    }
}
