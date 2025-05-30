package lesson_2;

public class MyMain {
    public static void main(String[] args){
        // Объявление собственного МЕТОДА
        makeTypeCasting();
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

    public static void getMemoryInformation(){
        // Вопрос о том, как в Джава хранятся данные
        // Мы поделили переменные на две категории
        // 1. ПРИМИТИВНЫЕ, ALL except STRING
        // 2. ССЫЛОЧНЫЕ, STRING - ОБЪЕКТЫ В ДЖАВА МОГУТ ХРАНИТЬСЯ ТОЛЬКО В КУЧУ!!!!

        // In RAM - есть два пространства для хранения данных
        // КРАТКОСРОЧНАЯ ПАМЯТЬ - STACK перевода нет
        // ДОЛГОСЧРОНАЯ ПАМЯТЬ - КУЧА / HEAP
        // STACK - хранятся все примитивные типы данных и они появляются, удаляются
        // удаление происходит тогда, когда переменная перестает использоваться
        // КУЧА / HEAP хранит данные до тех пор, пока ваш Java Garbage Collector (Сборщик Мусора)
        // Не решит, что пора оптимизировать опять и зачистить концы
        int age = 4; // int - 4 bytes STACK, behind age -> address for the MACHINE
    }

    public static void getOperatorsInformation(){
        System.out.println("What type of operators do we have?");
        System.out.println("Arithmetic - Logical - Bitwise.");
        System.out.println("+, -, *, /, %, =, ++, --");

        double weight = 18.56;
        double weightB = 78.6;
        int height = 171;
        int heightB = 89;

        double sum = weight - weightB;
        double sumP = weightB + weight;
        double sumF = weight * weightB;
        double sumD = weight / weightB;

        // sout - System.out.println()
        System.out.println(sum);
        System.out.println(sumP);
        System.out.println(sumF);
        System.out.println(sumD);

        System.out.println();

        System.out.println("How much is 5 + 10? " + (5 + 10));
        System.out.println("How much is 5 * 10? " + (5 * 10));
        System.out.println("Result: " + 5 + (10 - 6) / (5 * 10));
        System.out.println("20 четное число? " + (23%2)); // Остаток - 0, значит четное, 1 - нечетное

        int cost = 100; // Объявление переменной и указание значения
        cost = cost - 1; // Классическое убавление
        cost-= 1; // сокращенное, по сути, cost = cost - 1; cost+=10;
        cost--; // пост-декремент, -- ставится после имени переменной и убавляет число 1

        int costB = 101;
        costB = costB + 1;
        costB+= 1;
        costB++; // пост-инкремент, когда ++ ставится после имени переменной и означает +1

        int productCost = 0;
        productCost+= 10; // 0 + 10
        productCost/= 5; // 10 / 5

        System.out.println("Result: " + (productCost/2));

        // И, ИЛИ, НЕ РАВНО, РАВНО
        // И - &&, ИЛИ - ||, НЕ РАВНО - !=, РАВНО - ==
    }

    public static void makeTypeCasting(){
        // int 4 byte
        int height = 171;

        // double 8 byte
        double weight = 88.3;

        double sum = height / weight;

        System.out.println(sum);

        double heightD = 171.8; // если мы пытаемся уложить числа после запятой в целочисленное значение, все после
        // точки просто отбрасывается - результат 171
        int weightD = 178;

        // Принудительное преобразования типа, когда более большая переменная должна быть уложена в менее большу
        // В данном случае, мы пытаемся сохранить double в int
        int newSum = (int) heightD / weightD;
    }
}
