package chapter19;
import java.util.*;
public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Иллиноис","Спрингфилд");
        capitals.put("Миссури","Джефферсон-сити");
        capitals.put("Ващингтон","Олимпия");
        capitals.put("Калифорния","Сакраменто");
        capitals.put("Индиана","Индианаполис");
        Set<?> states = capitals.keySet();
        for (Object name : states)
            System.out.println("Столица штата: " + name + " - " +capitals.getProperty((String) name) + ".");
        System.out.println();
        String str = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Столица штата Флорида " + str +".");
    }
}
