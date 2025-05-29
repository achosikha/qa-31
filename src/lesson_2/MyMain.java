package lesson_2;

public class MyMain {
    public static void main(String[] args){

        // Объявление собственного МЕТОДА
    }

    public static void getBasicVariableInfo(){
        // Variables
        // Operators
        // Casting
        // Formatters
        // Escape sequences

        // Variable - это ячейка внутри операционной памяти вашего компьютера, где временно хранится что-то
        // Большинство ваших переменных хранится в RAM - Randomly Accessed Memory - ОПЕРАТИВКА
        System.out.println("My name is: Archil");
        System.out.println("My surname is: Sikharulidze");
        System.out.println("My age is: 36");
        System.out.println("My profession is: Java Developer.");

        // Переменные пишутся по принципу - LowerCamelCase
        // Примитивные типы
        // Целочисленные значения
        // Java это СТРОГИЙ ЯЗЫК ПРОГРАММИРОВАНИЯ
        // Т.е. ЭТО ЯЗЫК СТРОГОЙ ТИПИЗАЦИИ
        // byte -> -128 по 127
        // signed and unsigned values
        // Java нет возможности создать переменные только с минусом (0 и меньше) или только с плюсом (0 и выше)

        // Если вы используете переменную для передачи данных или же в любых арифметических операциях, то
        // Использовать byte, short, float не имеет значения. Поскольку byte & short автоматически буду превращены в
        // тип int, а float будет превращен в тип double
        byte myByteValue = 19;
        short myShortValue = 29456;
        int myIntValue = -100000000;
        long myLongNumber = -35L; // Говорит компилятору, я знаю что ты выделяешь память под ЛОНГ и ЭТО ПРАВИЛЬНО

        char letter = 'A'; // Только ОДИН СИМВОЛ А -> за занавесом, это целочисленная переменная

        // Значения с плавающей запятой
        float myFloatNumber = 45.567F; // Для компилятора любое число я плавающей запятой - это double
        double myDoubleFloat = 456.184758940;

        // Логические переменное
        boolean isMarried = true; // ИСТИНА
        boolean isEmployed = false; // ЛОЖЬ
        boolean turnOnLamp = true;

        // Ссылочные типы
        String myName = "Archil";
        String mySurname = "Sikharulidze";
    }

    public static void showVariableOutput(){
        String name = "Archil";
        String surname = "Sikharulidze";
        int age = 36;
        String profession = "Java Developer";
        char prefix = 'J';
        boolean isEmployed = true;
        double scoreTMS = 34.5;

        // + конкатенация - присоединение
        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
        System.out.println("Your age is: " + age);
        System.out.println("Your prefix is: " + prefix);
        System.out.println("Are you employed? " + isEmployed);
        System.out.println("Your profession is: " + profession);
        System.out.println("Your TMS score is: " + scoreTMS);

        System.out.print("\n"); // Специальные знаки для определенных шагов

        System.out.println("Your name is: " + name + "\n" + "Your surname is: " + surname + "\n" +
                "Your age is: " + age + "\n" + "Your prefix is: " + prefix + "\n" +
                "Are you employed? " + isEmployed + "\n" + "Your profession is: " + profession + "\n" +
                "Your TMS score is: " + scoreTMS);
    }
}
