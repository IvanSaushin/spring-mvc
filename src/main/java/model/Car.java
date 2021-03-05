package model;

public class Car {
    private String carId;

    private String carModel;

    private String carSeries;

    public Car() {}

    public Car(String carId, String carModel, String carSeries) {
        this.carId = carId;
        this.carModel = carModel;
        this.carSeries = carSeries;
    }


    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarSeries() {
        return carSeries;
    }

    public void setCarSeries(String carSeries) {
        this.carSeries = carSeries;
    }
}
