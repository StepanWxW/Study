package chapter15;

public interface StringFunc3 {
    String func (String n);
}
class MyStringOps1 {
    String strReverse(String str) {
        String result = "";
        int i;
        for (i=str.length()-1; i>=0; i--)
            result += str.charAt(i);
        return result;
    }
}
class MethodRefDemo2 {
    static String stringOp(StringFunc3 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда выражения повышают эффективность Java.";
        String outStr;
        MyStringOps1 myStr = new MyStringOps1();
        outStr = stringOp(myStr::strReverse, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращеная строка: " + outStr);
    }
}
