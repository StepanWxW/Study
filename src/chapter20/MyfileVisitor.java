package chapter20;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyfileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes)
        throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
class DirTreeList {
    public static void main(String[] args) {
        String dirname ="\\MyDir";
        System.out.println("Дерево каталогов начиная с каталога " + dirname + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirname), new MyfileVisitor());
        } catch (IOException exc) {
            System.out.println("Ошибка ввода вывода");
        }
    }
}
