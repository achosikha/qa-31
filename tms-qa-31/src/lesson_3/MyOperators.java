package lesson_3;

// IDE (Project) - GIT (Virtual project)
// Document ADDED Добавление документа
// Commit Точка сохранения
// Changes applied Изменения внесены - отражены

// $ git add .
// $ git commit -am "SOME MESSAGE"

// $ git push подгрузить все изменения на ГитХаб

// $ git fetch - проверить количество коммитов на ГитХабе и сравнить с количеством коммитов на локальном Гите
// $ git status - получить результат сравнения

// Lesson 3 -> Operators
// if, else if, switch - flow operators
// while, do while, for - loops (циклы)
// Три ключевых слова: break, continue, return

import java.io.IOException;
import java.util.Scanner;

// Java - вводить по одному символу -
// Вводить целые строчки, числа
public class MyOperators {
    public static void main(String[] args) throws IOException {
        keyWordsBreakContinueReturn();
    }

    // break, continue, return
    public static void keyWordsBreakContinueReturn(){
        // break - ломает структуру
        for (int counter = 1; counter <= 10; counter++){
            if (counter == 6){
                break;
            }
            System.out.println("Counter: " + counter);
        }

        System.out.println("*****************************");

        for (int counter = 1; counter <= 10; counter++){
            if (counter == 6){
                continue;
            }
            System.out.println("Counter: " + counter);
        }

        System.out.println("*****************************");

        for (int counter = 1; counter <= 10; counter++){
            if (counter == 6){
                return;
            }
            System.out.println("Counter: " + counter);
        }

        System.out.println("This code comes after RETURN! YOU WILL NEVER MANAGE TO COME HERE!");
    }

    // Циклы - loops
    public static void useLoops(){
        // Цикл - это повторение одного и того же кода определенное количество раз
        // Например, вывести одно и тоже сообщение 10 раз
        // Три типа цикла: while, do while, for

        int counter = 1;

        while(counter <= 10){
            System.out.println("Counter: " + counter);
            counter++;
        }

        System.out.println("***************************");
        counter = 1;

        do{
            System.out.println("Counter: " + counter);
            counter++;
        }while(counter <= 10);

        System.out.println("*****************************");

        // for (объявление переменной; логическое условие; изменение статуса переменной)
        for (int count = 1; count <= 10; count++){
            System.out.println("Count: " + count);
        }
    }

    // switch
    public static void useSwitch(){
        System.out.print("Please, enter the DAY: ");
        Scanner input = new Scanner(System.in);
        String day = input.nextLine();

        // if (day == "Monday")
        // else if (day == "Tuesday")
        // ...
        // else {...}
        switch (day){
            case "Monday":
                System.out.println("Today is " + day);
                break;
            case "Tuesday":
                System.out.println("Today is " + day);
                break;
            case "Wednesday":
                System.out.println("Today is " + day);
                break;
            case "Thursday":
                System.out.println("Today is " + day);
                break;
            case "Friday":
                System.out.println("Today is " + day);
                break;
            case "Saturday":
                System.out.println("Today is " + day);
                break;
            case "Sunday":
                System.out.println("Today is " + day);
                break;
            default:
                System.out.println("There is NO SUCH DAY!");
                break;
        }
    }

    // else if
    public static void useElseIf(){
        System.out.print("Please, enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age > 0 && age < 18){
            System.out.println("Your are " + age + " years old. You are underaged.");
            System.out.println("You cannot be officially MARRIED!");
        } else if (age >= 18 && age < 65){
            System.out.println("Your are " + age + " years old. You are an ADULT.");

            System.out.print("Please, enter if you are married (true/false): ");
            boolean isMarried = input.nextBoolean();

            // if (isMarried) - isMarried == true
            // if (!isMarried) - isMarried == false
            // >, <, >=, <=, ==, != (не равно), ! - НЕ
            if (!isMarried){ // ! - НЕ
                System.out.println("Your are not married.");
            } else {
                System.out.println("You are MARRIED!");
            }
        } else if (age >= 65){
            System.out.println("Your are " + age + " years old. You are a PENSIONER.");

            System.out.print("Please, enter if you are married (true/false)? ");
            boolean isMarried = input.nextBoolean();
            System.out.print("Please, enter if you have children (true/false)? ");
            boolean haveChildren = input.nextBoolean();

            if (isMarried || haveChildren){ // ты должен быть или женат, или иметь детей
                System.out.println("You either are married or you have children.");
            } else {
                System.out.println("You are not married and you have no children.");
            }
        } else {
            System.out.println("If you came here your data is CORRUPTED.");
        }
    }

    // Операторы управления потоком
    // if, else if, switch
    public static void useIf(){
        // Если - if
        System.out.print("Please, enter number from 1 to 10: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        if (value == 0) // == банальное сравнение если 0
            System.out.println("You have entered VALUE 0!");

        if (value > 0 && value <= 5) // > больше, && логическое И число меньше или равно 5
            System.out.println("Your value is between 1 and 5: " + value);

        if (value > 5 && value <= 10)
            System.out.println("Your value is between 6 and 10: " + value);

        if (value == -1){
            System.out.println("Your value is -1!");
            System.out.println("Your value is -1 again!");
            System.out.println("This is still inside -1.");
        }
    }

    public static void calculateBMI(){
        // Создать BMI калькулятор
        // Посмотреть как должен работать калькулятор - т.е. какую формулу он использует для высчитывания индекса тела
        // Вес в КГ делить на Рост в Квадрате в метрах, если я 88кг / 1.72 * 1.72 (172 см)
        // Алгоритм - это определенные шаги в определенной последовательности
        // 1. Запросить ваш вес в КГ
        // 2. Запросить вас рост в МЕТРАХ
        // 3. Сохранить значение деления вашего веса в КГ и вас рост в квадрате в метрах
        // 4. Вывести сообщение с указанием индекса вашего тела - это результат деления по выше указанной формуле
        System.out.println("Welcome to BMI Calculator for TMS.");
        System.out.println("This program calculates your Body Mass Index, comparing your weight and height.");
        System.out.print("Please, enter your weight in KG: ");

        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        System.out.print("Please, enter your height in METERS (172 cm - 1.72 m): ");
        double height = input.nextDouble();

        // 88 / (1.72 * 1.72)
        double sumBMI = weight / (height * height);

        System.out.println("Your weight is " + weight + " and your height is " + height + ". Your BMI is: " + sumBMI);

        // 5. Проанализировать мой индекс массы и исходя из результата дать ВЫВОД - ОПЕРАТОРА УПРАВЛЕНИЯ
        /*
        Severe Thinness	< 16
        Moderate Thinness	16 - 17
        Mild Thinness	17 - 18.5
        Normal	18.5 - 25
        Overweight	25 - 30
        Obese Class I	30 - 35
        Obese Class II	35 - 40
        Obese Class III	> 40
         */
        if (sumBMI < 16){
            System.out.println("DIAGNOSE: Severe Thinness!");
        } else if (sumBMI >= 16 && sumBMI < 17){
            System.out.println("DIAGNOSE: Moderate Thinness!");
        } else if (sumBMI >= 17 && sumBMI < 18.5){
            System.out.println("DIAGNOSE: Mild Thinness!");
        } else if (sumBMI >= 18.5 && sumBMI < 25){
            System.out.println("DIAGNOSE: Normal!");
        } else if (sumBMI >= 25 && sumBMI < 30){
            System.out.println("DIAGNOSE: Overweight!");
        } else if (sumBMI >= 30 && sumBMI < 35){
            System.out.println("DIAGNOSE: Obese Class I!");
        } else if (sumBMI >= 35 && sumBMI <= 40){
            System.out.println("DIAGNOSE: Obese Class II");
        } else if (sumBMI > 40){
            System.out.println("DIAGNOSE: Obese Class III");
        } else {
            System.out.println("YOUR DATA IS CORRUPTED!");
        }
    }

    // How to enter a full String of values or numbers
    // There is a special CLASS - SCANNER
    public static void getScanner(){
        // Difference between SCANNER and System.in.read()
        // System.in.read() - требует пробрасывания исключения
        // Использует стандартный класс вывода System
        // Может брать только один символ

        // Scanner - специальный класс, который надо добавить из пакета
        // Он создан для упрощения ввода данных с клавиатуры
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter your name: ");
        String name = input.nextLine();
        System.out.print("Please, enter your surname: ");
        String surname = input.nextLine();
        System.out.print("Please, enter your age: ");
        int age = input.nextInt(); // НУЖНО ЦЕЛОЕ ЧИСЛО, ЕСЛИ ВЫ ВВЕДЕТЕ ЧТО-ТО НЕПРАВИЛЬНОЕ - ПРОГРАММА РУХНЕТ !!!
        System.out.print("Please, enter your height: ");
        int height = input.nextInt();
        System.out.print("Please, enter your weight: ");
        double weight = input.nextDouble();
        System.out.print("Are you married (false/trueм)? ");
        // В некоторых языках программирования тип boolean может быть целочисленным
        // Например, в С/С++ 0 это ложь, != 0 - истина
        // Поэтому, можно задавать и использовать целочисленные значения для отражения логической переменной
        // В Джава - число не связано с типом boolean, поэтому только false & true
        boolean isMarried = input.nextBoolean();

        System.out.println();

        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height);
        System.out.println("Your weight is: " + weight);
        System.out.println("Are you married? " + isMarried);
    }

    // How to enter one symbol
    public static void enterOneSymbol() throws IOException {
        System.out.print("Please enter a value: ");

        // Читает один символ
        int value = System.in.read(); // Он принимает один символ, превращает его в ASCII код
        // Например, число 5 - это 53
        System.out.println("You have entered the following symbol in ASCII code: " + value);
        System.out.println("You have entered the following symbol in char: " + (char) value);
    }
}