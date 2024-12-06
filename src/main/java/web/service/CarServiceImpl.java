package web.service;

import org.springframework.stereotype.Service;
import web.Model.Cars;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    private final List<Cars> cars;
    public CarServiceImpl(){
        cars = new ArrayList<>();
        cars.add(new Cars("Audi",3,"White"));
        cars.add(new Cars("BMW",4,"Red"));
        cars.add(new Cars("VW",7,"MoonGray"));
        cars.add(new Cars("Mercedes",4,"black"));
        cars.add(new Cars("Lada",228,"purple"));
    }

    @Override
    public List<Cars> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
