package chapter19.study;
import java.util.*;
public class StudyTwo {
    int counter = 1;
    boolean tf = false;
    int num;
    void search(HashSet<IntNumber> hashIn) {
        Iterator<IntNumber> itr = hashIn.iterator();
        while (itr.hasNext()) {
            IntNumber element = itr.next();
        }




//        for (int i = 0; i < hashIn.size(); i++) {
//            for (int y = i + 1; y < hashIn.size(); y++) {
//                if (hashIn.get(i) == hashIn.get(y)) {
//                    num = hashIn.get(i);
//                    counter++;
//                    tf = true;
//                    break;
//                }
//            }
//        }
//        System.out.println(hashIn);
        if (tf == true) {
            System.out.println("Result = " + tf + "\nЧисло " + num + " повторяется " + counter + " раза.");
        } else System.out.println("Result = " + tf + "\nДубликатов нет.");
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
}
class StudyTwoStart {
    public static void main(String[] args) {
        IntNumber in1 = new IntNumber(1);
        IntNumber in2 = new IntNumber(2);
        IntNumber in3 = new IntNumber(3);
        IntNumber in4 = new IntNumber(4);
        IntNumber in5 = new IntNumber(3);
        IntNumber in6 = new IntNumber(6);
        IntNumber in7 = new IntNumber(7);
        HashSet<IntNumber> list = new HashSet<IntNumber>();
        list.add(in1);
        list.add(in2);
        list.add(in3);
        list.add(in4);
        list.add(in5);
        list.add(in6);
        list.add(in7);
        StudyTwo st = new StudyTwo();
        st.search(list);
    }
}
