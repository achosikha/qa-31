package lesson_10_string;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        // Если исключение было проброшено на уровне метода
        // То вызывающий его метод также должен обработать это исключение
        try{
            setMethodSignatureException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setNullPointer(){
        // int value = STACK прямо указывает на значение
        // Примитивный тип не может хранить адрес на что-то отдельное
        // Ключевое слово null это указатель на то, что нет пока адреса на объект поскольку под него нет памяти
        // int value = null;

        // Говорю компилятору, что мне нужно зарезервировать под тип СТРОЧКУ переменную с именем name
        // Но пока у меня нет четкого понимания его значения, т.е. у меня нет и выделенной памяти.
        String name = null;

        System.out.println("Before RUN-TIME EXCEPTION");

        int[] numbers = new int[]{-1, 5, 10};

        try {
            for (int index = 0; index <= numbers.length; index++){
                System.out.println(numbers[index]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("After RUN-TIME MISTAKE!");

        // Null Pointer Exception
        // COMPILE-TIME ERROR

        // try catch block
        // try catch finally block
        // try-with RESOURCES block
        try(Scanner readDocument = new Scanner(new File("src/lesson_10_string/document.txt"))){
            // В случае с ДОКУМЕНТОМ есть два специальных знака, которые указывают на КОНЕЦ
            // -1 или EOF - END OF FILE
            while(readDocument.hasNext()){ // .hasNext() проверяет существование следующего элемента
                System.out.println(readDocument.nextLine()); // Берет всю СТРОЧКУ
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setMethodSignatureException() throws IOException {
        // FileInputStream прочитать документ, а в частности, каждый элемент читается как значение в байте
        // Это прямое использование таблицы ASCII - HIGH ASCII расширенная версия
        FileInputStream readDocument = new FileInputStream("src/lesson_10_string/document.txt");

        int letter;

        while ((letter = readDocument.read()) != -1){
            System.out.print((char) letter);
        }

        readDocument.close();
    }
}