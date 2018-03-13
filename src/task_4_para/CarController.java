package task_4_para;

import java.util.List;

/** Класс-контроллер, который будет фильтровать список автомобилей по указанным параметрам и возвращать список машин,
 * удовлетворяющих условию*/
public class CarController implements Controller {

    /** Метод возвращает список автомобилей заданной марки */
    @Override
    public List<Car> getCarsByMark(String mark, List<Car> cars) {
        return null;
    }

    /** Метод возвращает @return список автомобилей заданной модели,
     * со сроком эксплуатации более указанной */
    @Override
    public List<Car> getCarsByModel(String model, Integer age, List<Car> cars) {
        return null;
    }

    /** Метод возвращает список автомобилей заданного года выпуска,
     * цена которых более указанной */
    @Override
    public List<Car> getCarsByYear(String year, Integer price, List<Car> cars) {
        return null;
    }
}
