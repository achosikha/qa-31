package lesson_5_arrays_more;

import java.util.Scanner;

public class MyArraysMore {
    public static void main(String[] args) {
        // Программа должна инициализировать работу
        start();
        // Сюда же она придет, чтобы закончиться
    }

    // Если мы пишем в функциональном стиле, т.е. Каждый код находится в теле метода
    // То каждый метод должен выполнять ОДНУ ЗАДАЧУ!
    public static void start(){
        // 1. Позвольте пользователю самостоятельно выбрать длину массива
        // 2. Проверьте введенное значение (если оно допустимо, следующий шаг, если нет, заново запросить значение)
        // 3. Позволить пользователю ввести каждое значение элемента массива
        // 4. Собрать сумму всех значений и вывести пока каждый элемент отдельно, а потом среднее значение суммы
        getInitialMessage();

        int arrayLength;

        while(true){
            System.out.print("Please, enter a valid number of elements for an array ( > 0): ");

            // getInput() - Scanner.nextInt()
            if ((arrayLength = getInput().nextInt()) > 0) break;
            System.out.println("\nYou have entered incorrect array length: " + arrayLength);
        }

        System.out.println();
        int[] values = new int[arrayLength];

        System.out.println("Your array - values has " + arrayLength + " elements.\n");

        setArrayValues(values);
        System.out.println();
        readArray(values);
        System.out.println();

        // showAvgSum - вызовет другой метод calculateElementsSum
        // Это метод и он выполнится в первую очередь
        // showAvgSum(_будет_поставлено_число_SUM, values.length)
        showAvgSum(calculateElementsSum(values), values.length);
    }

    public static void getInitialMessage(){
        System.out.println("This is a small program that let's you to set array length and enter values.");
        System.out.println("It calculates stored values and looks for average value via formula: SUM/ArrLength.");
    }

    // Передача одномерного массива в метод
    public static void setArrayValues(int[] values){
        for (int index = 0; index < values.length; index++){
            System.out.print("Please enter a value for the array - values[" + (index + 1) + "]: ");
            values[index] = getInput().nextInt();
        }
    }

    public static void readArray(int[] values){
        for (int index = 0; index < values.length; index++){
            System.out.printf("values[%d]: %d.\n", (index + 1), values[index]);
        }
    }

    public static int calculateElementsSum(int[] values){
        int sum = 0;

        // Если мы ТОЛЬКО ЧИТАЕМ массив, и его не исправляем, т.е. не задаем новые значения
        // То можно использовать т.н. enhanced-for
        // enhanced-for цикл был создан для того, чтобы не позволить программисту случайно изменить значения элементов
        // и дать возможность только их читать из массива
        for (int el : values){
            sum = sum + el;
        }

        return sum;
    }

    public static void showAvgSum(int sum, int length){
        System.out.println("Your sum of the values stored in the elements equals: " + sum);
        System.out.printf("The average sum of values of the elements equals SUM/LENGTH: %.4f",
                (double) sum / length);
    }

    // Method as a SCANNER CALL
    // Каждый метод может возвращать или пустоту или какое-либо значение/объект
    // Возвращение значения происходит путем добавления к public static + ключевого слова с указанием ТИПА
    // Например, если я хочу, чтобы метод вернул значение типа целое число - public static int
    // Для возвращения типа нужно в теле кода вписать ключевое слово return а потом переменную или само значение
    // return возвращает значение и заканчивает метод
    // void - означает то, что НИКАКОГО ЗНАЧЕНИЯ МЕТОД НЕ ВОЗВРАЩАЕТ
    // Поэтому, когда мы указывали там return - он ломался
    // Если у нас тип Scanner - то он может в любой части кода вернуть этот тип
    public static Scanner getInput(){
        // Scanner input = new Scanner (System.in);
        // return input;

        // return new Scanner(System.in); - создает АНОНИМНЫЙ вызов ЭКЗЕМПЛЯРА КЛАССА СКАННЕР
        // Анонимный означает, то, что у него нет ИМЕНИ, значит он создается по нужде и пропадает
        // К этому экземпляру нельзя будет обратиться или вернуться, поскольку у него просто нет имени
        return new Scanner(System.in);
    }
}