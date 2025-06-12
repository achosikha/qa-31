package lesson_6_methods_objects.myobject;

// class говорит о том, что это ЭКЗЕМПЛЯР MyMain
// OBJECT - чтобы представить в физической форме объект, надо создать КЛАСС
public class MyMain {
    public static void main(String[] args) {
        // OOP introduction to OBJECTS and CLASSES
        // new -> если вы создаете ОБЪЕКТ нужно всегда использовать ключевое слово new
        // исключения - String и массивы (в массивах, можно обойти)
        // Нельзя создать объект без использования new
        // !!! Поскольку в ДЖАВА все объекты ХРАНЯТСЯ В ХИПЕ (КУЧЕ)
        // А ЧТОБЫ СОЗДАТЬ ПРОСТРАНСТВО И РАСПОЛОЖИТЬ ТУДА ПЕРЕМЕННУЮ НУЖНО ИСПОЛЬЗОВА NEW
        createATMConstructor();
    }

    public static void createATMConstructor(){
        ATM tbc = new ATM("TBC", 5869293759L, 2195.6);
        tbc.getATMData();

        System.out.println("***********************************************************");

        ATM bog = new ATM("BOG", 20293038355L, 1934.56);
        bog.getATMData();

        bog.bankAccountDebit -= 100;
        System.out.println("How much money do you have on BOG account? " + bog.bankAccountDebit);
    }

    public static void createCarClasses(){
        Car bmw = new Car(); // создал экземпляр класса Car и назвал его bmw
        bmw.getCarInformation();

        System.out.println("***********************************************************");
        // Use method and pass variables
        bmw.setValues("BMW", "Black", 2014, 3.4, 40, 280);
        bmw.getCarInformation();

        Car mercedes = new Car();
        mercedes.setValues("Mercedes", "Red", 2022, 5.2, 40, 360);
        System.out.println("***************************************************************");
        mercedes.getCarInformation();

        // Получить доступ прямо из другого класса к полям класса МАШИНА
        mercedes.maximumSpeed = 500;
        System.out.println("Mercedes Maximum speed: " + mercedes.maximumSpeed);
    }
}