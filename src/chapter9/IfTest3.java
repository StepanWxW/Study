package chapter9;

class IfTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fx = new FixedStack(8);
        mystack = ds;
        for (int i= 0; i<12; i++) mystack.push(i);
        mystack = fx;
        for (int i= 0; i<8; i++) mystack.push(i);

        mystack = ds;
        System.out.println("Dinamic stack");
        for (int i= 0; i<12; i++)
            System.out.println(mystack.pop());
        mystack = fx;
        System.out.println("Static stack");
        for (int i= 0; i<8; i++)
            System.out.println(mystack.pop());

    }
}
