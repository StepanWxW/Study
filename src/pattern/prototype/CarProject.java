package pattern.prototype;

public class CarProject implements Copyable {
    private int idCar;
    private String nameCar;
    private String nameBody;

    public CarProject(int idCar, String nameCar, String nameBody) {
        this.idCar = idCar;
        this.nameCar = nameCar;
        this.nameBody = nameBody;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getNameBody() {
        return nameBody;
    }

    public void setNameBody(String nameBody) {
        this.nameBody = nameBody;
    }

    @Override
    public Object copy() {
        CarProject copy = new CarProject(idCar,nameCar,nameBody);
        return copy;
    }

    @Override
    public String toString() {
        return "CarProject{" +
                "idCar=" + idCar +
                ", nameCar='" + nameCar + '\'' +
                ", nameBody='" + nameBody + '\'' +
                '}';
    }
}
