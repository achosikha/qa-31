package lesson_6_methods_objects;

public class MyMain {
    public static void main(String[] args){
        // Archil 5 -1 \
        // How to use String[] args
        for (int index = 0; index < args.length; index++){
            System.out.printf("Your %d parameter is: %s.\n", (index + 1), args[index]);
        }
    }
}