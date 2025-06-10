package lesson_5_arrays_more;

import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // Одномерный массив - это ЦЕПЬ
        // Двухмерный массив - это МАТРИЦА (ТАБЛИЦА)
        // Трехмерный массив - это КУБ
        // Четырехмерный и т.д. - УЧИТЕ ГЕОМЕТРИЮ

        // Создать таблицу для ИГРЫ
        // 3 на 3 - любая таблица это ДВУХМЕРНЫЙ МАССИВ
        // Мы создали двухмерный массив
        // Потом его для игры надо проинициализировать
        // Т.е. задать всем элементам пустоту или же любое другое дефолтное значение
        getThreeDimensionalArray();
    }

    public static void start(){
        // 1. Создать массив двухмерный и проинициализировать его знаками * чтобы понять, где находятся пустые места
        char[][] gameTable = initializeTable();

        readGameTable(gameTable);

        makeUserMove(gameTable);

        readGameTable(gameTable);
    }

    public static char[][] initializeTable(){
        return new char[][]{
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'}
        };
    }

    public static void readGameTable(char[][] gameTable){
        // Первая ячейка двухмерного массива - это 0,0
        // 0,0 - 0,1 - 0,2
        // 1,0 - 1,1 - 1,2
        // 2,0 - 2,1 - 2,2

        /*
        for(int rows = 0; rows < gameTable.length; rows++){
            for (int columns = 0; columns < gameTable[rows].length; columns++){
                System.out.println("gameTable[" + rows + "][" + columns + "]: " + gameTable[rows][columns]);
            }
        }
         */

        // Взять из двухмерного массива первый массив
        // сохранить его в rows
        // из первого одномерного массива достать поочередно элементы типа char и сохранить в переменной cols
        for (char[] rows : gameTable){
            for (char cols : rows){
                System.out.print(cols + "\t");
            }
            System.out.println();
        }
    }

    public static void makeUserMove(char[][] gameTable){
        System.out.print("Please, enter ROW (0 to 2): ");
        int coordinateRow = getUserInput();
        System.out.print("Please, enter COLUMN (0 to 2): ");
        int coordinateCol = getUserInput();

        gameTable[coordinateRow][coordinateCol] = 'U';
    }

    // Получать ТОЛЬКО ЧИСЛА
    public static int getUserInput(){
        return new Scanner(System.in).nextInt();
    }

    public static void getThreeDimensionalArray(){
        int[][][] values = new int[][][]{
            {
                {12, 5, 10},
            },
            {
                    {6, 7, 10},
                    {8, 9, -1}
            },
            {
                    {-1, 9},
                    {0, 0, -1, 2},
                    {9, 11, 101, 0, 4}
            }
        };

        for (int outer = 0; outer < values.length; outer++){
            for (int inner = 0; inner < values[outer].length; inner++){
                for (int inside = 0; inside < values[outer][inner].length; inside++){
                    System.out.println(values[outer][inner][inside]);
                }
                System.out.println();
            }
            System.out.println();
        }

        // enhanced-for
        for (int[][] outer : values){
            for (int[] inner : outer){
                for (int inside : inner){
                    System.out.println(inside);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
