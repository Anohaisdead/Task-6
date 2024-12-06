package web.service;

import web.Model.Cars;

import java.util.List;

public interface CarService {
    List<Cars> getCars(int count);
}
