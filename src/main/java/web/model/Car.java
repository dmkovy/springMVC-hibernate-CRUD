package web.model;

public class Car {

    private String modelCar;
    private String series;
    private int yearManufactured;

    public Car() {
    }

    public Car(String modelCar, String series, int yearManufactured) {
        this.modelCar = modelCar;
        this.series = series;
        this.yearManufactured = yearManufactured;
    }

    @Override
    public String toString() {
        return "Car{" +
               "modelCar='" + modelCar + '\'' +
               ", series='" + series + '\'' +
               ", yearManufactured=" + yearManufactured +
               '}';
    }
}
