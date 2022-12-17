package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarByCount(int count) {
        List<Car> carsList = new ArrayList<>();
        List<Car> result = new ArrayList<>();

        Car car1 = new Car("Model-A", "lux", 2022);
        Car car2 = new Car("Model-B", "sunny", 2023);
        Car car3 = new Car("Model-C", "prelim", 2024);
        Car car4 = new Car("Model-D", "top", 2025);
        Car car5 = new Car("Model-E", "sky", 2026);

        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);

        if (count < 5) {
            for (int i = 0; i < count; i++) {
                result.add(carsList.get(i));
            }
            return result;
        }

        return carsList;
    }

}
