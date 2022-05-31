package chapter19.study;

import java.util.HashMap;
import java.util.Iterator;

public class Lesson3HashMap {
    HashMap<Integer, String> sorted (HashMap<String, Integer> hashIn) {
        String name;
        int old;
        HashMap<Integer,String> newHm = new HashMap<>();
        Iterator<String> itr = hashIn.keySet().iterator();
            while (itr.hasNext()) {
                name = itr.next();
                old =hashIn.get(name);
                newHm.put(old, name);
            }
        return newHm;
    }
}

class starterHM {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Вася", 5);
        hm.put("Лида", 9);
        hm.put("Аня", 6);
        hm.put("Петя", 11);

        Lesson3HashMap starter = new Lesson3HashMap();
        HashMap<Integer, String> print = starter.sorted(hm);
        System.out.println(print);
    }
}
