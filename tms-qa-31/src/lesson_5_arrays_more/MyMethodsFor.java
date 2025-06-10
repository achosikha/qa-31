package lesson_5_arrays_more;

import java.util.Random;

public class MyMethodsFor {
    public static void main(String[] args) {
        /*
        String[] names = new String[]{"Archil", "Katya", "Vova", "Artiom", "Ilya", "Maksim"};
        Random randomNumber = new Random();
        int randomElement = randomNumber.nextInt(0, names.length);
         */

        System.out.println("\nYour random name is: " +
                readArray(new String[]{"Archil", "Katya", "Vova", "Artiom", "Ilya", "Maksim"},
                        new Random().nextInt(0, 6)));

        System.out.println();

        System.out.println("Your full name is: " + getMyFullName("Archil", "Sikharulidze"));

        String fullData = getFullData("Archil", "Sikharulidze", 36, 172, 85);
        System.out.println("Your full data is:\n" + fullData);

        readOneDimensionalArray(new char[]{'A', 'B', 'C', 'D', 'E', 'f'});

        // varargs - аргументы неопределенной длины
        // По сути, это возможность передать в метод одномерный массив не указывая его длину
        useVarArgs('a', 'b', 'c', 'd');

        System.out.println();

        getVariousParameters(10, 19, "Exam", 'a', 'R', 't', 'l');
    }

    // Метод который принимает int, int, String, а потом неопределенное количество значений char
    // public static void varArgs(char... values)
    // public static void varArgs(int val, String name, char... values)
    // varargs - не может быть и не может стоять между другими параметрами
    // НЕЛЬЗЯ: public static void varArgs(char... values, int age, String name){}
    // НЕЛЬЗЯ: public static void varArgs(int age, String name, char... values, double weight){}
    public static void getVariousParameters(int val, int valTwo, String name, char... unknown){
        // int = 10
        // int = 19
        // String = "Exam"
        // char[] unknown = new char[]{....}
    }

    // varargs
    public static void useVarArgs(char... symbols){
        // Как одномерный массив
        for (char letter : symbols){
            System.out.println(letter);
        }
    }

    public static void readOneDimensionalArray(char[] letters){
        for (char symbol : letters){
            System.out.println(symbol);
        }
    }

    public static String getFullData(String name, String surname, int age, double height, double weight){
        return "Your name is: " + name + ".\n" +
                "Your surname is: " + surname + ".\n" +
                "Your age is: " + age + ".\n" +
                "Your height is: " + height + ".\n" +
                "Your weight is: " + weight + ".\n";
    }

    public static String getMyFullName(String name, String surname){
        return name + " " + surname;
    }

    public static String readArray(String[] names, int randomName){
        // Чтобы подстраховаться и не допустить возможность изменения значений массива во время чтения
        // Была добавлена новая версия for - enhanced-for
        for (String el : names){
            System.out.println(el);
        }

        return names[randomName];
    }
}