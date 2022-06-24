package chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail{
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}
class NamePhone {
    String name;
    String phone;

    public NamePhone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}


public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "Larry@HerbShildt.com"));
        myList.add(new NamePhoneEmail("Джеймс", "555-4444", "James@HerbShildt.com"));
        myList.add(new NamePhoneEmail("Мерри", "555-3333", "Mary@HerbShildt.com"));
        System.out.println("Исходные данные из списка myList: ");
        myList.stream().forEach((a -> System.out.println(a.name + " " + a.phonenum + " " + a.email)));
        System.out.println();
        Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name,a.phonenum));
        System.out.println("Список имен и номеров телефонов");
        nameAndPhone.forEach((a) -> System.out.println(a.name + " " + a.phone));
      }
}
