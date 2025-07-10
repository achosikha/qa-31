package lesson_12_collections_advanced;

import java.util.Random;

public class Person {
    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        // 555 + 2_000_000_000
        String initialValue = "555" + new Random().nextInt(0, 2001);
        return Integer.parseInt(initialValue);
    }
}