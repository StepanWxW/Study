package chapter20;

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("src\\chapter20");
        p("Имя файла: " + f1.getName());
        p("Путь: " + f1.getPath());
        p("Абсолютный путь: " + f1.getAbsolutePath());
        p("Родительский каталог: " +f1.getParent());
        p(f1.exists() ? "существует" : "не существует");
        p(f1.canWrite() ? "Доступен для записи" : "не доступен для записи");
        p(f1.canRead() ? "Доступен для чтения" : "не доступен для чтения");
        p(f1.isDirectory() ? "Является каталогом" : "Не являетс каталогом");
        p(f1.isFile() ? "является обычным файлом" : "может быть именнованным каналом");
        p(f1.isAbsolute() ? "яляется абсолютным" : "не является абсолютным");
        p("Последние изменнения в файле: " + f1.lastModified());
        p("Размер " + f1.length() + " байт.");
    }
}
