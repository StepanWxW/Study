package pattern.singleton;

public class Audi {
    private static Audi audi;
    private static String body = "Audi has: \n\n";
    public static Audi getAudi() {
        if (audi == null) {
            audi = new Audi();
        }
        return audi;
    }

    private Audi() {}
    public void addBody(String s) {
        body += s + "\n";
    }
    public void showBodyAudi() {
        System.out.println(body);
    }
}
