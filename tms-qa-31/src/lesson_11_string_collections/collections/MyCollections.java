package lesson_11_string_collections.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyCollections {
    public static void main(String[] args) {
        // COLLECTION
        // MAP

        // COLLECTION:
        // 1. LIST (список)с
        // 2. SET (данность)
        // 3. QUEUE (очередь)

        useLinkedList();
    }

    public static void useLinkedList(){
        // 1. Тут также, есть ИНДЕКСЫ
        // 2. Также сохраняется очередность вставки значений
        LinkedList<String> names = new LinkedList<>();
        names.add("Archil");
        names.add("Tanya");
        names.add("Alisa");
        names.add("Maksim");
        names.add("Katya");

        System.out.println(names);

        for (int index = 0; index < names.size(); index++){
            System.out.println(names.get(index));
        }
    }

    public static void useWrapperClasses(){
        // Как добавить ДЕФОЛТНЫЕ ЗНАЧЕНИЯ В КОНСТРУКТОРЕ?
        // WrapperClasses это реализация примитивных типов на уровне класса для указания в Коллекциях
        // Или где нельзя прямо сослаться на примитивный тип
        // !!! НИ В КОЕМ СЛУЧАЕ НЕ ИСПОЛЬЗОВАТЬ ИХ ОТДЕЛЬНЛ ДЛЯ СОЗДАНИЯ ПЕРЕМЕННЫХ!
        ArrayList<Character> letters = new ArrayList<>();

        for (int index = 0, letter = 65; index < 26; index++, letter++){
            letters.add((char) letter);
        }

        System.out.println(letters);

        // НЕ НАДО ТАК ДЕЛАТЬ!
        Character letter = 'a';
        Boolean isAlive = true;
        Integer age = 36;
        // Double weight = new Double(456.7); -> запрещено с 9 версии, но допустимо в 8
    }

    public static void useArrayList(){
        // ArrayList создается на основе ArrayList, что дает больше функционала
        // Нежели если бы я создал эту коллекцию на основе List

        // 1. Есть индексы, можно к ним обращаться напрямую
        // 2. Порядок вставки объектов сохраняется, т.е. если вы вставили пока объект 1, 2, 3 - их порядок сохранения
        // в коллекции тоже будет таким
        ArrayList<Developer> developers = new ArrayList<>();

        developers.add(
                new Developer
                        ("Archil", "Sikharulidze",
                                "Java Developer", "Write programs in JAVA."));
        developers.add(
                new Developer
                        ("Maksim", "Alekseichuk", "JAVA QA", "Test Java Program."));
        developers.add(
                new Developer("Ilya", "Mamchyk", "JAVA QA", "Test JAVA CORE"));

        System.out.println(developers.getFirst());
        System.out.println("******************************************************");
        System.out.println(developers.getLast());

        System.out.println("********************************************************");

        for (int index = 0; index < developers.size(); index++){
            System.out.println(developers.get(index));
        }

        System.out.println("**********************************************************");

        // Если мы не знаем, какой там объект - МОЖНО ИСПОЛЬЗОВАТЬ КЛАСС Object
        for(Developer el : developers){
            System.out.println(el);
        }
    }

    public static void useList(){
        // Collection: LIST
        // LIST:
        // 1. ArrayList - расширяемые массив
        // 2. LinkedList - Связанный список

        // Empty ArrayList который будет хранить в себе значения Integer
        List<Integer> integerValues = new ArrayList<>();
        integerValues.add(56);
        integerValues.add(457);
        integerValues.add(-11);

        System.out.println(integerValues.get(0));
        System.out.println(integerValues.get(1));
        System.out.println(integerValues.get(2));

        // size() заменяет length()
        for (int index = 0; index < integerValues.size(); index++){
            System.out.println(integerValues.get(index));
        }

        System.out.println("***********************************");

        for (int el : integerValues){
            System.out.println(el);
        }

        integerValues.clear();
        System.out.println(integerValues);
        integerValues.add(9);
        integerValues.add(-11);
        System.out.println(integerValues);
        integerValues.addFirst(0);
        System.out.println(integerValues);
        System.out.println(integerValues.reversed());
    }
}
