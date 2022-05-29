package chapter19.study;
import java.util.*;
public class StudyTwo {
    int counter = 1;
    boolean tf = false;
    int num;
    void search(ArrayList<Integer> listIn) {
        for (int i = 0; i < listIn.size(); i++) {
            for (int y = i + 1; y < listIn.size(); y++) {
                if (listIn.get(i) == listIn.get(y)) {
                    num = listIn.get(i);
                    counter++;
                    tf = true;
                    break;
                }
            }
        }
        System.out.println(listIn);
        if (tf == true) {
            System.out.println("Result = " + tf + "\nЧисло " + num + " повторяется " + counter + " раза.");
        } else System.out.println("Result = " + tf + "\nДубликатов нет.");
    }
}
class StudyTwoStart {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(8);
        StudyTwo st = new StudyTwo();
        st.search(list);
    }
}
