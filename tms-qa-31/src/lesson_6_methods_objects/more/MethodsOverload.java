package lesson_6_methods_objects.more;

public class MethodsOverload {
    public static void main(String[] args) {
        // Мы передаем ПРИМТИВНЫЕ ТИПЫ ЧЕРЕЗ ЗНАЧЕНИЯ
        // т.е. когда мы передаем данные в методы - это данные просто копируются и создаются дубликаты
        // И в передаваемых метода работа идем в дубликатами, а не оригиналами
        // Следовательно, изменение передаваемых значений в методах не отражается на оригинальных значениях
        // PASS-BY-VALUE
        String name = "Archil";
        int age = 36;
        boolean isEmployed = true;

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Are you employed? " + isEmployed);

        getPrimitiveTypes(name, age, isEmployed);
        System.out.println("******************************");

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Are you employed? " + isEmployed);

        int[] values = new int[]{9, 5, -1, 10, 6};

        System.out.println("**********************************");
        readArray(values);
        changeArrayValues(values);
        System.out.println("**********************************");
        readArray(values);

        // ВСЕ ОБЪЕКТЫ ЗА ИСКЛЮЧЕНИЕМ STRING ПЕРЕДАЮТСЯ ПО ССЫЛКЕ
        // А ЭТО ЗНАЧИТ, ЧТО ПЕРЕДАЕТСЯ ПРЯМО АДРЕС НА ОРИГИНАЛЬНУЮ ПЕРЕМЕННУЮ
        // Т.Е. МЫ МОЖЕМ ПРЯМО МЕНЯТЬ ОРИГИНАЛ - это невозможно сделать с примитивными значения
        // PASS-BY-REFERENCE

        //
        getSum();
        getSum(14);
        getSum(14, 67);
        getSum(14, 67D); // D - double

        short value = 109;

        getSum(109);
    }

    // Массив это тоже ОБЪЕКТ, значит это ссылочного типа переменная
    // Его адрес - указывает на первый элемента МАССИВА
    public static void changeArrayValues(int[] values){
        values[0] = -1;
        values[1] = 0;
        values[2] = 1;
        values[3] = 2;
        values[4] = 3;
    }

    public static void readArray(int[] values){
        for (int el : values){
            System.out.println(el);
        }
    }

    public static void getPrimitiveTypes(String name, int age, boolean isEmployed){
        name = "Vladimir";
        age = 191;
        isEmployed = false;
    }

    public static void useTernaryOperator(){
        // if (isMarried){}
        // if (isMarried) && ..
        // Ternary operator ?:

        boolean isMarried = true;

        if (isMarried) System.out.println("Your are married");

        // (logical_condition) ? _true : _false
        System.out.println("You are " + ((isMarried) ? "married" : "not married"));

        int valOne = 19;
        int valTwo = 34;

        // There is also Math.max()
        double highestNumber = (valOne > valTwo) ? valOne : valTwo;
        System.out.println("The highest number is: " + highestNumber);

        String day = "Thursday";
        System.out.println("Is it Monday, Tuesday or any other day? " +
                ((day.equals("Monday")) ? "Monday" : (day.equals("Tuesday") ? "Tuesday" : day)));
    }

    public static void usePrefixIncDec(){
        // +=, -=, *=, /*
        // postfix-increment, postfix-decrement
        int volume = 9;
        volume += 1;

        volume++; // postfix increment, +1
        System.out.println("Postfix-increment regular: " + volume);

        volume--; // postfix decrement, -1
        System.out.println("Postfix-decrement regular: " + volume);

        System.out.println("Postfix-increment in the statement: " + volume++);
        System.out.println("Postfix-decrement in the statement: " + volume--);
        System.out.println(volume);

        System.out.println();

        // prefix-increment and prefix-decrement
        System.out.println("Postfix-increment in the statement: " + ++volume); // prefix-increment
        System.out.println("Postfix-decrement in the statement: " + --volume); // prefix-decrement

        int[] val = new int[]{1, 5, 10, -1};

        for (int index = 0; index < val.length; index++){
            System.out.println(val[index]);
        }
    }

    public static void getWeekDayNewSwitch(String day){
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("Today is " + day + " and it is a WORKING DAY.");
            case "Saturday", "Sunday" -> System.out.println("Today is " + day + " and it is a WEEKEND.");
            default -> System.out.println("No SUCH DAY: " + day);
        }
    }

    public static void getWeekDayRegularSwitch(String day){
        /*
        if (day.equals("Monday").. Tuesday... till Friday
        if (day.equals("Saturyday")... Sunday
         */
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Today is: " + day + " and it is a WORKING DAY.");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Today is: " + day + " and it is a WEEKEND.");
                break;
            default:
                System.out.println("There is no SUCH DAY: " + day);
                break;
        }
    }

    // Перегрузкой МЕТОДА - Method Overload
    // СИГНАТУРА МЕТОДА или ПОДПИСЬ МЕТОДА
    // СИГНАТУРА МЕТОДА или банально ПОДПИСЬ МЕТОДА (METHOD SIGNATURE)
    // ПОДРАЗУМЕВАЕТ - имя метода и его параметры БОЛЬШЕ НИЧЕГО!
    // Возвращаемое значение не является частью СИГНАТУРЫ МЕТОДА
    public static void getSum(){
        System.out.println("getSum method without parameters.");
    }

    public static void getSum(int value){
        System.out.println("getSum method wit int values parameter.");
    }

    // short & int ???? Иногда в некоторых языках могут быть проблемы - компилятору непонятно куда идти
    public static void getSum(short value){}

    public static void getSum(int value, int secondValue){
        System.out.println("getSum method with int value, int secondValue parameters.");
    }

    public static void getSum(double value, double secondValue){
        System.out.println("getSum method with double value, double secondValue parameters.");
    }
}
