package lesson_5_operators_arrays;

import java.util.Random;
import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args){
        // Array массив
        // А есть еще отдельно класс Arrays - у которого есть свои методы, для упрощения работы с массивами
        extendArray();
    }

    // У меня есть определенный массив с длиной Х
    // Мне нужно увеличить этот массив с учетом старой длины и данных + Х количество новых элементов
    public static void extendArray(){
        int[] coordinatesY = new int[]{9, 19, 5, 10, 21, 9, -1};
        // coordinatesY = 7 elements
        // Add ? MORE ELEMENTS

        System.out.print("How many new elements must be added? ");
        Scanner input = new Scanner(System.in);
        int elementsNumber = input.nextInt();

        // 7 + значение которое мы ввели
        int[] coordinatesYUpdated = new int[coordinatesY.length + elementsNumber];

        // Перебросить в новый массив старые данные и оставить задел для новых
        for (int index = 0; index < coordinatesY.length; index++){
            coordinatesYUpdated[index] = coordinatesY[index];
        }

        // Прочитать новый массив и посмотреть, сделана ли копия и есть ли место для новых элементов
        for (int index = 0; index < coordinatesYUpdated.length; index++){
            System.out.println("coordinatesYUpdated[" + index + "]: " + coordinatesYUpdated[index]);
        }

        Random value = new Random();

        // У меня в координатах не может быть значения 0
        for (int index = coordinatesY.length; index < coordinatesYUpdated.length; index++){
            coordinatesYUpdated[index] = value.nextInt(-5, 21);
        }

        System.out.println("**********************************************************");
        for (int index = 0; index < coordinatesYUpdated.length; index++){
            System.out.println("coordinatesYUpdated[" + index + "]: " + coordinatesYUpdated[index]);
        }
    }

    // Запросить у пользователя длину массива
    // Исходя из данного параметра, создать массив соответствующей длины
    // Опираясь на длину, заполнить массив случайными числами от 1 по 20
    public static void setRandomNumbersArray(){
        Random value = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter array length: ");
        int arrayLength = input.nextInt();

        int[] randomNumbers = new int[arrayLength]; // выделяю память под н-ое количество элементов

        for (int index = 0; index < randomNumbers.length; index++){
            randomNumbers[index] = value.nextInt(1, 21);
        }

        System.out.println("*******************************************************");

        for (int index = 0; index < randomNumbers.length; index++){
            // (index + 1) не меняет само значение переменной index, а просто выводит сумму index + 1
            // (index++) у вас поменяется само значение переменной и будет сбой в индексации
            System.out.println("randomNumbers[" + (index + 1) + "]: " + randomNumbers[index]);
        }
    }

    public static void readArray(){
        int[] randomNumbers = new int[]{9, 10, -5, 0, 4, 8, 10, 101, 19, 20}; // int[] randomNumbers = new int[5]{....}

        System.out.println(randomNumbers[0]);
        System.out.println(randomNumbers[4]);

        for (int index = 0; index < randomNumbers.length; index++){
            System.out.println("randomNumbers[" + index + "]: " + randomNumbers[index]);
        }
    }

    public static void setBasicArray(){
        // Одномерный МАССИВ One dimensional array
        // 1. Массив это цепочка переменных одного типа
        // 2. Это цепочка имеет свою длину
        // 3. Изменить длину массива (т.е. цепочки) невозможно, если вы задали ей 5 элементов, она будет неизменна
        // 4. Можно создавать массивы из любых переменных, как примитивных, так и ссылочных
        // 5. Массивы нужны для того, что объединять однотипные значения и хранить в одной переменной
        // 6. Массив самая быстра коллекция - коллекция это переменная которая хранит в себе целую группу значений
        // 7. Массивы до сих пор активно используются для хранения данных, поскольку они самые быстрые с точки зрения
        // обработки и сравнения

        int uniqueValues[]; // C-style array declaration

        // ОБЪЯВЛЕНИЕ МАССИВА ТИПА CHAR с именем symbols
        char[] symbols; // Java-style array declaration - МЫ ПРОСТО ОБЪЯВИЛИ массив типа char
        char symbol; // Allocate in STACK 1 BYTE of MEMORY for the variable SYMBOL
        symbol = 'A'; // INITIALIZATION

        System.out.println(symbol);

        // symbols 26 bytes, char 1 byte = 26
        symbols = new char[26]; // МЫ заставили компилятор ВЫДЕЛИТЬ пространство для нашего массива с длиной в 26 эл.

        // У меня в массиве 26 элементов, т.е. у меня 26 индексов, индекс это номер элемента в массиве
        // 26, индексация начинается с 0, индекс последнего элемента будет не 26 а 25
        symbols[0] = 'c';
        symbols[1] = 'R';
        symbols[2] = '!';
        symbols[3] = '/';

        System.out.println("Array symbols[0]: " + symbols[0]);
        System.out.println("Array symbols[1]: " + symbols[1]);
        System.out.println("Array symbols[2]: " + symbols[2]);
        System.out.println("Array symbols[3]: " + symbols[3]);
        System.out.println("Array symbols[18]: " + symbols[18]); // index 18, 19 element
    }
}