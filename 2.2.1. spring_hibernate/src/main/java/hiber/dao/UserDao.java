package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   User getUserByModelAndSeriesCar(String modelCar, int seriesCar);
   List<User> listUsers();
}
