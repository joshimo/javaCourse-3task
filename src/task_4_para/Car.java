package task_4_para;

/** Класс-сущность машины */
public class Car {  
    
    static int lastId = 0;
    
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private int price;
    private String number;

    Car(String _mark, String _model, int _year, String _color, int _price, String _number) {
        id = lastId++;
        mark = _mark;
        model = _model;
        year = _year;
        color = _color;
        price = _price;
        number = _number;
    }

    public static void setLastId(int lastId) {
        Car.lastId = lastId;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static int getLastId() {
        return lastId;
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getNumber() {
        return number;
    }
}
