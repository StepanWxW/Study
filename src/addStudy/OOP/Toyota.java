package addStudy.OOP;

class Toyota extends Auto {
    String name = "Toyota";
    int radius = 17 ;
    double maxSpeed = 155.12;


    @Override
    public String toString() {
        return "Toyota{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    void Characteristics() {
        System.out.println(toString());
    }
}
