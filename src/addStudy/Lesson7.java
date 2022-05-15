package addStudy;

public class Lesson7 {
    public static void main(String[] args) {
        Start start = new Start();
        start.Box(5);
        start.Year();
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

}

