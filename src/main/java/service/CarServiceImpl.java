package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCars() {
        return createCars();
    }

    public List<Car> createCars() {
        List<Car> cars = new ArrayList<>();
        String[] carModels = {"BMW", "Audi", "Land Rover", "Volvo", "Mers"};
        String[] carSeries = {"M5", "A4", "Vogue", "QZ300", "E300"};;
        for (int i = 0; i < 5; i++) {
            cars.add(new Car(String.valueOf(i), carModels[i], carSeries[i]));
        }

        return cars;
    }
}
