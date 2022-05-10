package chapter07;

public class OverloadCon2 {
        public static void main(String[] args) {
            Box mybox1 = new Box(10,20,15);
            Box mybox2 = new Box();
            Box mybox3 = new Box(7);

            double vol;
            Box myclone = new Box(mybox1);

            vol = mybox1.volume();
            System.out.println("The volume is: " +vol);

            vol = mybox2.volume();
            System.out.println("The volume is: " +vol);

            vol = mybox3.volume();
            System.out.println("The volume is: " +vol);
            vol = myclone.volume();
            System.out.println("The volume is: " +vol);


    }
}
