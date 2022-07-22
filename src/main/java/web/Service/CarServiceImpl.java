package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> car = new ArrayList<>();
    private static int idCount = 0;

    {
        car.add(new Car(++idCount, "Mazda", 1.4f));
        car.add(new Car(++idCount, "Nissan", 1.6f));
        car.add(new Car(++idCount, "Cherry", 1.8f));
        car.add(new Car(++idCount, "UAZ", 2.0f));
        car.add(new Car(++idCount, "Skoda", 1.2f));
    }

    @Override
    public List<Car> giveSomeCars(Integer count) {
        return car.stream().limit(count).collect(Collectors.toList());
    }

}
