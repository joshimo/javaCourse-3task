package task_4_para;

/** Класс-сущность машины */
public class Car {  
    
    static int lastId = 0;
    
    public int id;
    public String mark;
    public String model;
    public int year;
    public String color;
    public int price;
    public String number;

    public Car(String _mark, String _model, int _year, String _color, int _price, String _number) {
        id = lastId++;
        mark = _mark;
        model = _model;
        year = _year;
        color = _color;
        price = _price;
        number = _number;
    }
}
