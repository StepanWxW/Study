package Thread.lesson1v4;


import java.util.concurrent.Phaser;

public class Start {
    private static final Phaser PHASER = new Phaser(1);
    public static void main(String[] args) {
        Foo foo = new Foo();
        PHASER.register();
        new Thread(foo::first);
    }
}
