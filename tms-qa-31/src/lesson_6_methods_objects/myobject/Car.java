package lesson_6_methods_objects.myobject;

// НАБРОСОК ОБЪЕКТА МАШИНА
// У каждого наброска должны быть определенные общие черты или КАЧЕСТВА и ДЕЙСТВИЯ
public class Car {
    // Переменные которые задают КАЧЕСТВА нашей машины
    // Называются ПОЛЯМИ КЛАССА
    // По сути, эти переменные УРОВНЯ КЛАСС
    // Они доступны всем внутренностям КЛАССА и играют роль ДАННЫХ УРОВНЯ КЛАСС
    // Создаются, когда создается экземпляр класса и умирают вместе с ним

    // На уровне КЛАССА даже если вы не зададите значения КЛАСС САМ ИМ ЗАДАСТ АВТОМАТИЧЕСКИЕ ЗНАЧЕНИЯ
    String model; // null
    String color; // null
    int productionYear; // 0
    double enginePower; // 0.0
    int maximumSpeed; // 0
    int minimumSpeed; // 0

    // In method int x - no value - и попытаетесь использовать - ОБИШКА
    // Но если вы используете ссылочные типы int[] - 0, char[] - /, String - null

    // Действия и какие-то механизмы работы с полями происходят через МЕТОДЫ
    // Метод Класса МАШИНА - управляет ДЕЙСТВИЯМИ, это ГЛАГОЛ, он что-то должен делать
    // Не описывать КЛАСС как ПОЛЯН (Черный, 2014 года производства), а делать (например, начать, двинуться, включить
    // фары, остановиться, поднять капот и т.д.)
    // Или же, задать значения ПОЛЯМ, управлять изменением состояния
    public void getCarInformation(){
        System.out.println("Your car information is: ");
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Production year: " + productionYear);
        System.out.println("Engine power: " + enginePower);
        System.out.println("Minimum speed: " + minimumSpeed);
        System.out.println("Maximum speed: " + maximumSpeed);
    }

    public void setValues(String carModel, String carColor, int prdYear, double engPower, int minSp, int maxSp){
        model = carModel;
        color = carColor;
        productionYear = prdYear;
        enginePower = engPower;
        minimumSpeed = minSp;
        maximumSpeed = maxSp;
    }
}