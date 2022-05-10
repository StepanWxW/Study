package chapter07;

public class Test3 {
    int c;
    Test3 (int i) {
        c = i;
    }
    Test3 incrByTen () {
        Test3 temp = new Test3 (c +10);
        return temp;
    }
}
