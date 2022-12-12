package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> carList;

    public CarServiceImpl() {
        carList = Arrays.asList(
                new Car(1L, "Car1", 1500),
                new Car(2L, "Car2", 1500),
                new Car(3L, "Car3", 1500),
                new Car(4L, "Car4", 1500),
                new Car(5L, "Car5", 1500)
        );
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null) {
            count = 5;
        }
        List<Car> cars;
        if (count > 0 && count < 5) {
            cars = carList.stream().limit(count).toList();
        } else {
            cars = carList;
        }
        return cars;
    }
}
