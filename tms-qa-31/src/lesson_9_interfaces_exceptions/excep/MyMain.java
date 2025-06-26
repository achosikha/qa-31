package lesson_9_interfaces_exceptions.excep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        // ИСКЛЮЧЕНИЯ - это механизм защиты программы от фатального прерывания
        readDocument();

        // try-with-resources
        // try-catch-finally
    }

    public static void tryWithResources(){
        File documentAddress = new File("src/lesson_9_interfaces_exceptions/excep/document.txt");

        // if (document есть и открывается, тогда, если нет поймай ошибку
        // try-with-resources нужно для того, чтобы автоматически ЗАКРЫТЬ РЕСУРС, который мы открыли
        try(FileInputStream document = new FileInputStream(documentAddress)){
            System.out.println("NICE DOCUMENT!");

            // ЛЮБОЙ РЕСУРС - НАДО ЗАКРЫТЬ
            document.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void tryCatchFinally(){
        try{
            // BODY
        } catch (Exception e){
            // CATCH MISTAKE
        } finally {
            // THIS BODY WILL ALWAYS BE DONE IN THE END!!!!
        }
    }

    public static void readDocument(){
        // Когда вы пытаетесь подключить что-то внешнее, не просто написать код и там ошибиться
        // Например, открыть файл, подключить базу данных
        // Все это ТРЕБУЕТ автоматически ПРОВЕРКИ на существование
        // Поэтому, компилятор вас обязательно попросит сделать проверку и подстраховаться
        // Это и значит ПРОВЕПЯЕМЫЕ ИСКЛЮЧЕНИЯ
        try{
            Scanner readDocument = new Scanner(
                    new File("src/lesson_9_interfaces_exceptions/excep/document.txt"));
            while(readDocument.hasNext()){
                System.out.println(readDocument.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void basicTryCatch(){
        System.out.println(0/10);

        // Непроверяемые исключения - когда компилятор не дает указание на ОШИБКУ
        // Лишь ломается программа уже в ходе ее работы - такое поведение Runtime Exception
        try{
            System.out.println(10/0);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("You got the EXCEPTION message but the program still works!");

        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Please, enter a DIGITAL VALUE: ");
            double value = input.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("You probably entered a WRONG VALUE, NON DIGITAL!");
        }

        System.out.println("After having a WRONG INPUT FORMAT!");
    }
}
