package task_4_para;

import java.util.ArrayList;
import java.util.List;

/** Класс-заглушка для создания тестового списка автомобилей */
public class DBMock {

    /** Метод, создающий тестовые данные и возвращающий их в виде списка */
    public static List<Car> createCars() {
        List<Car> carList = new ArrayList();
        
        carList.add(new Car("Real", "A1", 2000, "red", 99999, "0001"));
        carList.add(new Car("Real", "A1", 2001, "black", 41234, "0002"));
        carList.add(new Car("Real", "A2", 2012, "black", 51515, "0003"));
        
        carList.add(new Car("Fake", "newModel", 1970, "green", 99999, "1001"));
        carList.add(new Car("Fake", "newModel", 1923, "white", 88888, "1011"));
        carList.add(new Car("Fake", "oldModel", 1845, "white", 77777, "1111"));
        
        carList.add(new Car("Flying", "Mark77", 2015, "white", 99999, "xxx42"));
        carList.add(new Car("Flying", "Mark13", 2015, "black", 44444, "xx132"));
        carList.add(new Car("Flying", "Mark13", 2015, "red", 33333, "xx1232"));
        carList.add(new Car("Flying", "Mark42", 2020, "blue", 11111, "x13213"));
        carList.add(new Car("Flying", "Mark42", 2020, "red", 77777, "xx1232"));
        
        
        return carList;
    }

}
