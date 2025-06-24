package lesson_8_abstract_interface.staticEx;

public class MyMain {
    public static void main(String[] args) {
        Animal lion = new Animal("Leo", "Lion");
        Animal lion2 = new Animal("Leo2", "Lion2");

        // ЧТОБЫ ОБРАТИТЬСЯ К СТАТИЧЕСКИМ ЭЛЕМЕНТАМ КЛАССА
        // НАДО ИСПОЛЬЗОВАТЬ ИМЯ КЛАССА. + статика
        System.out.println(Animal.getAnimalsNumber());
    }

    // Не статический метод может вызывать статические
    // НО ЭТО НЕ РАБОТАЕТ НАОБОРОТ
    public void getNonStaticMethod(){
        System.out.println("Non-Static Method.");
        getStaticMethod();
    }

    public static void getStaticMethod(){
        System.out.println("Static Method.");
    }
}
