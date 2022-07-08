package pattern.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        CarProject car = new CarProject(1, "BestCar", "wheel, body");
        System.out.println(car);

        CarProjectFactory factory = new CarProjectFactory(car);
        CarProject carcopy = factory.cloneCarProject();
        System.out.println(carcopy);
    }
}
