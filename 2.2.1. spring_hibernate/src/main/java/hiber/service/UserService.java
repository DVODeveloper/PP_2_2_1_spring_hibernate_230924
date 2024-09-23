package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User getUserByModelAndSeriesCar(String modelCar, int seriesCar);
    List<User> listUsers();
}
