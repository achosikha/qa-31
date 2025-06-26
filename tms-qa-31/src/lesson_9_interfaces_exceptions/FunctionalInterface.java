package lesson_9_interfaces_exceptions;

// Annotation - @FunctionalInterface - говорит компилятору, что у нас ФУНКЦИОНАЛЬНЫЙ ИНТЕРФЕЙС
// Т.е. должен быть только один метод и пожалуйста компилятор убедить, что это так
@java.lang.FunctionalInterface
public interface FunctionalInterface {
    // Это интерфейс, где ТОЛЬКО ОДИН МЕТОД
    // Interface: RUNNABLE - THREADS
    void start();
}