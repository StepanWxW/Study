package addStudy.OOP;

class Auto {
    private String name;
    private int radius;
    private double maxSpeed;

    Auto(String n, int r, double m) {
        name = n;
        radius = r;
        maxSpeed = m;
    }

    Auto(String n, int r) {
        name = n;
        radius = r;
    }

    Auto() {
        name = "Lexus";
        radius = 16;
        maxSpeed = 165.6;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    void Characteristics() {
        System.out.println("Characteristics: \n Name: " + name + "\n Radius: " + radius + "\n maxSpeed: " + maxSpeed);
    }
}
