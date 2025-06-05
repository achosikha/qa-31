package lesson_5_operators_arrays;

import java.util.Random;
import java.util.Scanner;

public class MyOperators {
    public static void main(String[] args){
        useFormatters();
    }

    public static void forAdvanced(){
        // Eternal LOOP
        // for (; ;)

        /*
        for (int counter = 1, backwardCounter = 1; counter < 50; counter++, backwardCounter++){

        }
         */

        for(; ;){
            // ОН НИКОГДА НЕ СЛОМАЕТСЯ
            Scanner input = new Scanner(System.in);
            System.out.print("Would you like to break the eternal loop for (y/n)? ");
            String answer = input.nextLine();

            // String -> methods, equals()
            if (answer.equals("y")){
                break;
            }
        }

        System.out.println("You have BROKEN the ETERNAL LOOP FOR... This code COMES AFTER BREAK!");
    }

    public static void reachableCodeAccess(){
        // Видимость и время жизни
        // Видимость - исходя из того, где вы создаете переменные они будут видны другим элементам или нет
        int coordinate = 100; // Переменная уровня метода, она доступна лишь внутри метода
        // Следовательно, ее время жизни - это когда она объявлена в теле метода и до того момента пока ее
        // использование не происходит или же метод не заканчивается
        // Если метод закончился или она больше не используется в коде - ее удаляет сборщик мусора из СТЭКА
        // Происходит освобождение памяти и ресурса

        {
            int coordinateY = 200;

            System.out.println(coordinate);
        }

        for (int counter = 1; counter <= 10; counter++){
            System.out.println(counter);
        }

        int counter = 1;

        while(counter <= 10){
            System.out.println(counter++);
        }
    }

    public static void generateRandomNumberMath(){
        // ИГРА В КОСТИ
        // Math. -> methods
        // Симулировать бросок костей, две штуки от 1 по 6
        // Math.round() vs. Math.floor()
        // Math.random() - 0.1 - 0.99 double
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        for (int counter = 1, randomNumber; counter <= 10; counter++){
            randomNumber = (int)(Math.random() * range) + min;
            System.out.println(randomNumber);
        }
    }

    public static void useRandom(){
        Random random = new Random();

        for (int counter = 1; counter <= 20; counter++){
            System.out.println(random.nextInt(1, 11)); // от 1 до 11 или по 10
        }
    }

    public static void imitateGame(){
        Random dice = new Random();

        System.out.println("Please, roll the dice.");
        System.out.println("The first dice value is: " + dice.nextInt(1, 7));
        System.out.println("The second dice value is: " + dice.nextInt(1, 7));
    }

    public static void useFormatters(){
        String surname = "Sikharulidze";
        String prefix = "Mr.";

        System.out.println("Welcome to Java " + prefix + " " + surname + ". We would like to cooperate with...");

        System.out.printf("Welcome to Java %s %s. We would like to work with you, especially in your age: %d.\n",
                prefix, surname, 36);

        double PI = 3.14159;
        System.out.println("PI equals: " + PI);

        // Formatted String in Java
        // printf()
        System.out.printf("PI equals: %.4f.\n", PI); // System.out.println("PI equals: " + PI) - 3.141
    }
}