package task_4_para;

import java.util.List;

public interface Controller {

    /** Метод возвращает список автомобилей заданной марки
     *  @param  mark
     *          марка машины
     *  @param  cars
     *          список всех машин
     *  @return возвращает список автомобилей заданной марки */
    List<Car> getCarsByMark(String mark, List<Car> cars);

    /** Метод возвращает список автомобилей заданной модели,
     *  со сроком эксплуатации более указанного
     *  @param  model
     *          модель машины
     *  @param  age
     *          срок эксплуатации машины
     *  @param  cars
     *          список всех машин
     *  @return возвращает список автомобилей заданной модели и минимальным указанным сроком эксплуатации*/
    List<Car> getCarsByModel(String model, Integer age, List<Car> cars);

    /** Метод возвращает список автомобилей заданного года выпуска,
     *  цена которых более указанной
     *  @param  year
     *          заданный год выпуска машины
     *  @param  price
     *          минимальная заданная цена машины
     *  @param  cars
     *          список всех машин */
    List<Car> getCarsByYear(String year, Integer price, List<Car> cars);
}
