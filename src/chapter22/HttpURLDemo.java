package chapter22;

import java.io.*;
import java.net.*;
import java.util.*;

public class HttpURLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        System.out.println("Метод запроса: " + hpCon.getRequestMethod());
        System.out.println("Код ответа: " + hpCon.getResponseCode());
        System.out.println("Ответное сообщение: " + hpCon.getResponseMessage());
//        Map<String, List<String>> hdrMAp = hpCon.getHeaderField();
//        Set<String> hdrField = hdrMAp.keySet();
//        System.out.println("\n Далее следует заголовок:");
//        for (String k: hdrField)
//            System.out.println("Ключ: " + k + " Знаечние " + hdrMAp.get(k));
        ;
    }
}
