package chapter15;

public interface StringFunc2 {
    String func (String n);
}
class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        int i;
        for (i=str.length()-1; i>=0; i--)
            result += str.charAt(i);
        return result;
    }
}
class MethodRefDemo {
    static String stringOp(StringFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда выражения повышают эффективность Java.";
        String outStr;
        outStr = stringOp(s -> MyStringOps.strReverse(s), inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращеная строка: " + outStr);
    }
}

