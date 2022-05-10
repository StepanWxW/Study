package chapter06;

public class Box6 {
    double wight;
    double hight;
    double depht;
     Box6 () {
         System.out.println("Конструктор объекта Box6");
         wight = 10;
         hight = 10;
         depht = 10;
     }
     double volume6 () {
         return wight * hight * depht;
         }



}
