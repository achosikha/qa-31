package lesson_9_interfaces_exceptions.inher;

public interface NonClassicalInt {
    // Неклассический интерфейс - это когда мы ДОБАВЛЯЕМ
    // ПОЛЯ и дефолтную реализацию МЕТОДОВ
    // ВСЕ ПОЛЯ ИНТЕРФЕЙСА, т.е. переменные - они СТАТИК и КОНСТАНТЫ
    String name = "Archil";
    String dateBirth = "16/10/1988";
    int height = 171;
    String eyesColor = "Brown";

    // keyword DEFAULT - позволяет добавить дефолтную реализацию методу в интерфейсе
    default String getInterfaceFields(){
        // this - статическая переменная не может использовать this
        return "Name: " + name + "\n" +
                "Date of birth: " + dateBirth + "\n" +
                "Height: " + height + "\n" +
                "Eyes color: " + eyesColor;
    }
}