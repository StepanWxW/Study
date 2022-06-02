package chapter19.pripubprodef.extend;

import chapter19.pripubprodef.test.Test;

public class SeeTest extends chapter19.pripubprodef.test.Test  {
    chapter19.pripubprodef.test.Test test = new Test();
    int seeTestPub = test.pub;
    int seeTestProt = test.prot;
    void setTest (Test test) {
        System.out.println(test.prot);
    }
}

