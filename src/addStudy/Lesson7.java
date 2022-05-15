package addStudy;

public class Lesson7 {
    public static void main(String[] args) {
        Start start = new Start();
        start.Box(5);
        start.Year();
        start.Char();
    }
}
class Start{
     double Box(int i) {
        double j = (double) i;
         System.out.println(j);
        return j;
     }
     void Year (){
        int year = 365;
        int day = 45;
        double x = (double) day / (double) year;
         System.out.printf("%.1f", x);
    }
    void Char () {
         char x = '1';
         char y = 'B';
         char z = '%';
         int x1 = (int) x;
         int y1 = (int) y;
         int z1 = (int) z;
        System.out.println("\n" + x1 + " " + y1 + " " + z1);
        float x2 = (float) x;
        float y2 = (float) y;
        float z2 = (float) z;
        System.out.println( x2 + " " + y2 + " " + z2);
    }
}

