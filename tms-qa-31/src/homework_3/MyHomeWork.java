package homework_3;

public class MyHomeWork {
    public static void main(String[] args){
        showASCIILettersOptimized();
    }

    // ДЗ 1. Используя цикл for вывести на экран буквы нижнего регистра от латинского a по z
    // Используите переменную типа char
    public static void showASCIILetters(){
        // от 97 по 122 и чтобы отражались как символы
        char letter = 97;

        for(int counter = 0; counter < 26; counter++){
            System.out.println("Your letter " + (char)(letter + counter) + " has ASCII code: " + (letter + counter));
        }
    }

    // ДЗ 1. Код был оптимизирован - переделан для чистоты, простоты
    public static void showASCIILettersOptimized(){
        for(int letter = 97; letter <= 122; letter++){
            System.out.println("Your letter " + (char) letter + " has ASCII code: " + letter);
        }
    }
}