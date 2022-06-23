package chapter20;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitchannelWrite {
    public static void main(String[] args) {
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("text.txt"))) {
            ByteBuffer mBuff = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++)
                mBuff.put((byte) ('A' + i));
            mBuff.rewind();
            fChan.write(mBuff);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указаня пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода " + e);
            System.exit(1);
        }
    }
}
