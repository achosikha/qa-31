package lesson_11_string_collections;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //
        getLengthCapacity();
    }

    public static void getLengthCapacity(){
        // length - сколько МЫ УЖЕ ЗАНЯЛИ
        // capacity - сколько нам в общем выделили пространства, памяти, она всегда больше длины
        // если длина приближается к capacity оно самостоятельно расширится, чтобы вы не могли дойти до конца
        StringBuilder stringValue = new StringBuilder("Archil Sikharulidze is a JAVA DEVELOPER!");
        System.out.println("Value: " + stringValue);
        System.out.println("Value length: " + stringValue.length());
        System.out.println("StringBuilder capacity: " + stringValue.capacity());

        stringValue.append(" I forgot to say, that he is also a lecturer.");
        System.out.println("Value length: " + stringValue.length());
        System.out.println("StringBuilder capacity: " + stringValue.capacity());
    }

    public static void useStringBuilder(){
        // StringBuilder - это расширяемые и изменяемые вариант String
        // StringBuffer - используется когда нужно разбираться отдельно с вопросом ПОТОКОВ

        // Если вам нужно менять строку на постоянной основе, особенно его элементы
        // То ОБЯЗАТЕЛЬНО ИСПОЛЬЗОВАТЬ StringBuilder()
        String calculatorField = null;
        StringBuilder calculatorFieldEditable = new StringBuilder();

        Scanner input = new Scanner(System.in);

        int counter = 0;

        do{
            System.out.println("StringBuilder field is: " + calculatorFieldEditable);
            System.out.print("Please, add something to the field: ");
            // К вводимой строчке я добавлял автоматом пропуск " "
            calculatorFieldEditable.append((input.nextLine().concat(" ")));
            counter++;
        } while (counter < 5);

        System.out.println("StringBuilder final field is: " + calculatorFieldEditable);
        calculatorField = calculatorFieldEditable.toString();
        System.out.println("Your STRING equivalent of StringBuilder is: " + calculatorField);
    }

    public static void useSplit(){
        // 78+23÷89−6*99
        // 78, 23, 89, 6
        // +, /, -, %, *
        // REGULAR EXPRESSIONS in JAVA
        // ДЛЯ ПРАВИЛЬНОГО ПОНИМАНИЯ КАК МОЖНО ОБРАБАТЫВАТЬ ТЕКСТ И ДРОБИТЬ ЕГО
        // НУЖНО В ОБЯЗАТЕЛЬНО ПОРЯДКЕ РАЗОБРАТЬСЯ С РЕГУЛЯРНЫМИ ВЫРАЖЕНИЯМИ
        // ПРОВЕРКА ПРАВИЛЬНОСТИ ЭЛЕКТРОННОЙ ПОЧТЫ
        // ДОБАВИТЬ СОБСТВЕННОРУЧНО -
        // И ПОПЫТАТЬСЯ СДЕЛАТЬ ТАК, ЧТОБЫ ВЫПОЛНИТЬ ВСЕ ОПЕРАЦИИ
        // ХОТЯ ПО ОЧЕРЕДНОСТИ, ЕСЛИ ЭТО СМОЖЕТЕ
        // ПОТОМ, УЧИТЫВАЯ АРИФМЕТИКУ
        String[] elements = "78+23/89−6*99".split("[+/*-]");
        System.out.println(Arrays.toString(elements));

        // split() + regular expression
        // igor.dv157@mail.ru
        // Разбить строчку на слова, числа и символы
        // igor, ., dv, 257, @, gmail, ., ru
    }

    public static void getStringMethods(){
        // toString() - приведение к строке
        // toCharArray() - приведение к массиву значений
        // toUpperCase() - приведение текста к верхнему регистру
        String value = "java QA development";
        System.out.println("Original String: " + value);
        System.out.println("With toUpperCase(): " + value.toUpperCase());
        System.out.println("After toUpperCase(): " + value);
        // toLowerCase() - приведение текста к нижнему регистру
        String randomValue = "archil sikharulidze is a Java DEVELOPER";
        String randomValueNew = "ARCHIl sikharulidze is a JAVA DEveloper";
        randomValue = randomValue.toLowerCase();
        randomValueNew = randomValueNew.toLowerCase();
        System.out.println(randomValue.equals(randomValueNew));
        // valueOf() - преобразовать в строковое значение
        double x = 45.6;
        double y = 67.987;

        String valueX = String.valueOf(x); // From Double to String
        String expression = x + " / " + y; // " / " заставит компилятор заранее все превратить в строчку
        System.out.println(expression);
        String valueY = Double.toString(y); // From Double to String
        System.out.println(valueY);
        // split() - !!! САМОЕ ЧАСТО ИСПОЛЬЗУВАЕМОЕ - РАЗДЕЛИТЬ СТРОЧКУ НА ОПРЕДЕЛЕННЫЕ ГРУППЫ !!! + РЕГУЛЯРНЫЕ ВЫРАЖЕНИЯ
        // length() - длина строчки - количество элементов + элемент конца строки '\0'
        // equals() -- compareTo()
        System.out.println("Archil".equals("Archil"));
        System.out.println("Archil".equals("Dima"));

        // compareTo - -? 0 +?
        // 0 true
        // -? первый элемент ВЫШЕ
        // +? второй элементы ВЫШЕ
        System.out.println("Archil".compareTo("Archil"));
        System.out.println("archil".compareTo("Archil"));
        System.out.println("Archil".compareTo("archil"));

        // charAt просто берет любой элемент из строчки
        System.out.println("String = \"Archil\", 2 index is: " + "Archil".charAt(2));
        String katya = "Katya";
        // katya.charAt(2) = 'R';

        // indexOf() - дает индекс первой попавшейся буквы, которая соответствует символу
        String word = "Apple";
        System.out.println("If in the word, there is a letter p, show me its index: " + word.indexOf('p'));

        // equalsIgnoreCase() сравнивает уже непосредственно значения без учета регистра
        System.out.println("arChIL".equals("ARCHIL")); // сравнить значения с учетом регистра
        System.out.println("ArchIL".equalsIgnoreCase("ARCHIL"));
    }

    public static void useToCharArray(){
        String position = "Java QA";
        System.out.println(position);

        // toCharArray() - приведение к массиву значений
        System.out.print("Please enter a value: ");
        String hiddenWord = new Scanner(System.in).nextLine();
        char[] hiddenWordArray = hiddenWord.toCharArray();

        for (char el : hiddenWordArray){
            System.out.println(el);
        }

        System.out.println("********************");

        for (char el : "Welcome to Java QA by TMS".toCharArray()){
            System.out.print(el + "\t");
        }
    }

    public static void stringMutable(){
        // Immutable
        String name = "Ilya";
        System.out.println(name);

        // Пересоздает строчку с новой ссылкой и новым значением
        name = "Vasily";
        System.out.println(name);
    }

    public static void setStrings(){
        String carName = "BMW";
        String carNameNew = "BmW";
        String carNameNewAgain = "BMW";
        String carNameKeywordNew = "BMW";

        System.out.println(carName == carNameNew); // FALSE
        System.out.println(carName == carNameNewAgain); // TRUE
        System.out.println(carNameNew == carNameKeywordNew); // FALSE
        System.out.println(carNameNewAgain == carNameKeywordNew); // TRUE

        String carNew = new String("BMW");
        System.out.println(carName == carNew); // FALSE
    }
}
