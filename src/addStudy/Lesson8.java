package addStudy;

import java.util.Arrays;

public class Lesson8 {
    public static void main(String[] args) {
        String fraze = "I love dota and java, maybe...";
        A a = new A();
        a.str();
        a.str2(fraze);
//        go.str3("I love dota and java, maybe...");
        B b = new B();
        b.str("I love dota and java, maybe...");
        b.str2();
        C c = new C();
        String x = c.str();
        System.out.println(x);
        E e = new E();
        e.str();
        D d = new D();
        d.str("I love dota and java, maybe...");

        F f = new F();
        int[] y = f.str();
        System.out.println(Arrays.toString(y));

//       System.out.println(f.Arrays.toString(str()));
    }
}
    class A {
        String str() {
            StringBuffer str1 = new StringBuffer("I love dota and java, maybe...");
            StringBuffer str2 = str1.reverse();
            System.out.println(str2);
            return str2.toString();
        }
        void str2(String str) {
            String result ="";
            for (int i =0 ; i<str.length() ; i++){
                result = str.charAt(i) +result;
            }

            System.out.println(result);

        }
//        void str3(String str) {
//
//            String x = "I love dota";
//            String result ="";
//            for (int num : ) {
//                result = str.charAt(i) +result;
//            }
//
//            System.out.println(result);

}
class B {
    //    void str(String str) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ',') {
//                for (int j = 0; i > str.charAt(i); j++) {
//                    result = str.charAt(j) + result;
//                    i++;
//                }
//            }System.out.println(result);
//
//        }
//
//
//    }
    void str(String str) {
        System.out.println(str.substring(20));
    }

    //    void str2() {
//        String x ="I love dota and java, maybe...";
//        String result ="";
//        for (int i =0; i<x.length(); i++) {
//            if (x.charAt(i) == ',') {
//                System.out.println(x.charAt(x.charAt(i)<x.length()));
//            }
//        }
//
//    }
//}
    void str2() {
        String str = "I love dota and java, maybe...";
        String resultStr = str.substring(str.indexOf(',') + 1);
        System.out.println(resultStr);
    }
}
class C {
    String str() {
        String str = "I love dota and java, maybe...";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }

        }
        System.out.println(chars);
        return chars.toString();
    }
}
class E {
    void str(){
        String str = "I love dota and java, maybe...";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'o') {
                chars[i] = 'k';}
            }
        System.out.println(chars);
    }
}
class D {
    String[] str(String str){
        System.out.println("Characters: " + str.length());

        String[] array = str.split(" ");
        System.out.println(array.length);
        return array;
    }
}
class F {
    int[] str() {
            String str = "I love dota and java, maybe...";
            char[] chars = str.toCharArray();
            char e = 'e';
            char o = 'o';
            char a = 'a';
            int count = 0;
        for (char aChar : chars) {
            if (aChar == a) {
                count++;
            }
        }
            int[] array = new int[count];
            int x = 0;
            for (int i = 0; i<chars.length; i++) {
                if (chars[i] == a) {
                    array[x] = i;
                    x++;
                }
            }
        System.out.println(Arrays.toString(array));
            return array;
        }
}