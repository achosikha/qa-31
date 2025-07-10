package lesson_12_collections_advanced;

import javax.crypto.spec.PSource;
import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        // BRAINSTORMING QUESTIONS
        // ArrayList vs. LinkedList
        // List<Integer> values = new ArrayList<>();
        // LinkedList<String> names = new LinkedList<>();

        // Throwable
        // Collection
        // List - Set - Queue

        // List
        // Реализации List, ArrayList & LinkedList:
        // 1. Сохраняется очередность элементов
        // 2. Индексация элементов
        // 3. Повторяющиеся элементы

        useDigitTreeMap();
    }

    public static void useDigitTreeMap(){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(4, "Java Micro");
        map.put(5, "Java SE");
        map.put(6, "Java EE");
        map.put(1, "JDK");
        map.put(2, "JRE");
        map.put(3, "JVM");

        System.out.println(map);
    }

    public static void useTreeMap(){
        TreeMap<String, String> dictionary = new TreeMap<>();
        dictionary.put("Dog", "Собака");
        dictionary.put("House", "Дом");
        dictionary.put("Car", "Машина");
        dictionary.put("Apple", "Яблоко");
        dictionary.put("Bird", "Птичка");
        dictionary.put("Cat", "Кошка");
        dictionary.put("Moon", "Луна");
        dictionary.put("Sun", "Солнце");

        System.out.println(dictionary);
    }

    public static void getMap(){
        Map<String, String> dictionary = new HashMap<>();

        // В своей базовой форме Карта позволяет хранить УНИКАЛЬНЫЕ КЛЮЧИ
        // Их нельзя повторять, но значения, которые привязаны к ключам, можно повторить
        dictionary.put("Apple", "Яблоко");
        dictionary.put("Dog", "Собака");
        dictionary.put("House", "Дом");
        dictionary.put("Car", "Машина");
        System.out.println(dictionary.put("House", "Дом"));
        System.out.println(dictionary.put("Flat", "Дом"));

        System.out.println(dictionary);

        System.out.println(dictionary.get("Apple"));

        System.out.print("Please, enter a KEY: ");
        String key = new Scanner(System.in).nextLine();

        if (dictionary.get(key) == null){
            System.out.println("There is no SUCH KEY in the COLLECTION.");
        } else {
            System.out.println("The value behind the key - " + key + " is: " + dictionary.get(key));
        }
    }

    // TreeSet - обеспечить уникальность значений
    // НО, также автоматически ОТСОРТИРОВАТЬ всю коллекцию - тогда это хороший выбор
    public static void getSorted(){
        TreeSet<String> values = new TreeSet<>();
        values.add("Ursula");
        values.add("Vigo");
        values.add("Anton");
        values.add("Yunona");
        values.add("Barry");

        System.out.println(values);

        TreeSet<Integer> digits = new TreeSet<>();
        digits.add(981);
        digits.add(-1);
        digits.add(100);
        digits.add(0);
        digits.add(-0);
        digits.add(8);
        digits.add(8);
        System.out.println(digits);
    }

    public static void getLinkedHashSet(){
        // Basics
        LinkedHashSet<String> programmingLanguages = new LinkedHashSet<>();
        programmingLanguages.add("Java");

        // LinkedHashSet:
        // 1. Очередность сохраняется
        // 2. Поскольку, СПИСОК
        // 3. Список на основе ХЭШ-КОДА
        // 4. ИНДЕКСОВ ВСЕ РАВНО НЕТ
        // НО, если первый и последний элемент - ТАМ АДРЕС

        System.out.println(programmingLanguages);
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C#");
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("LIST");
        programmingLanguages.add("C#");
        programmingLanguages.add("COBOL");
        programmingLanguages.add("FORTRAN");
        System.out.println(programmingLanguages);

        System.out.println(programmingLanguages.getFirst());
        System.out.println(programmingLanguages.getLast());
    }

    public static void getLinkedHashSetPerson(){
        // LinkedHashSet with class Person
        LinkedHashSet<Person> people = new LinkedHashSet<>();
        people.add(new Person("Archil", "Sikharulidze", 36));
        people.add(new Person("Vova", "Smirnov", 21));
        people.add(new Person("Nina", "Vointseva", 18));

        for (Person person : people){
            System.out.println(person);
            System.out.println(person.hashCode());
            System.out.println("****************************************************");
        }
    }

    // Archil, Stanislav, Ylia, Alisa, Nina - я ТАК ДОБАВИЛ
    // ОН СОХРАНИЛ и ВЫВЕЛ ВОТ ТАК: [Ylia, Archil, Alisa, Nina, Stanislav]

    // SET:
    // 1. Только уникальные значения
    // 2. Порядок вставки элементов не гарантируется
    // 3. Сама форма хранения данных в СЕТЕ не дает возможности получать ИНДЕКСЫ
    // т.е. никаких индексов тут НЕТ
    public static void getSetValues(){
        Set<String> names = new HashSet<>();
        String name = null;

        System.out.println("This is a VOCABULARY with UNIQUE values. You can have only one UNIQUE VALUE.");

        while(true){
            System.out.print("Please enter a value: ");

            if (!(name = new Scanner(System.in).nextLine()).equals("-1")){
                if (names.add(name)){
                    System.out.println("You have added a NEW value: " + name);
                } else {
                    System.out.println("You have tried to add an already existing value: " + name + ". Please, try again.");
                }
            } else {
                break;
            }
        }

        System.out.println(names);
    }

    public static void getHashSet(){
        // HashSet
        // Это структура в которой данные хранятся в ХЭШ-таблице
        // Там своя собственная сложная формула высчитывания hashCode()
        // У каждого ОБЪЕКТА ЕСТЬ СВОЙ СОБСТВЕННЫЙ hashCode и метод, который его возвращает
        String name = "Archil";
        System.out.println("String name = \"Archil\", hashCode(): " + name.hashCode());

        /*
        int value = 100;
        System.out.println(value.??); -> no hashCode() available

         */

        Integer value = 100;
        System.out.println("Integer value = 100, hashCode(): " + value.hashCode());
        Double doubleValue = 89.5;
        System.out.println("Double doubleValue = 89.5, hashCode(): " + doubleValue.hashCode());
        Boolean isAlive = true;
        System.out.println("Boolean isAlive = true, hashCode(): " + isAlive.hashCode());
        Character letter = 'G';
        System.out.println("Character letter = 'G', hashCode(): " + letter.hashCode());

        System.out.println("***********************************************");

        HashSet<String> names = new HashSet<>();
        names.add("Katya");
        names.add("Archil");
        names.add("Vasily");
        names.add("Stanislav");
        names.add("Nina");
        names.add("Lyuba");

        // hashCode: 68494048 - быстрее
        // нежели сравнивать Строчки

        System.out.println(names);
        for (String el : names){
            System.out.println("Name: " + el + ". Its hashCode is: " + el.hashCode());
        }
    }

    public static void getSet(){
        // SET - УНИКАЛЬНОСТЬ

        // Собрать данные, которые нужно автоматически отфильтровать таким образом, чтобы в моей коллекции
        // не было повторяющихся элементов
        // Set<Boolean> - во-первых, ограничил двумя значениями,
        // Поскольку СЭТ и его реализация HashSet по своей натуре может хранить только одно уникальное значение
        // То я могу ввести ТОЛЬКО один раз true & false
        Set<Boolean> logicalValues = new HashSet<>();
        System.out.println(logicalValues);

        System.out.println("I have added initial values FALSE & TRUE.");
        System.out.println("I am trying to ADD - false - value, is it successful? " + logicalValues.add(false));
        System.out.println("I am trying to ADD - true - value, is it successful? " + logicalValues.add(true));
        System.out.println(logicalValues);

        System.out.println("I have also added two FALSE and two TRUE.");
        System.out.println("I am trying to ADD - false - value, is it successful? " + logicalValues.add(false));
        System.out.println("I am trying to ADD - false - value, is it successful? " + logicalValues.add(false));
        System.out.println("I am trying to ADD - true - value, is it successful? " + logicalValues.add(true));
        System.out.println("I am trying to ADD - true - value, is it successful? " + logicalValues.add(true));
        System.out.println(logicalValues);
    }

    public static void addName(){
        ArrayList<String> names = new ArrayList<>();

        String name = null;

        while(true){
            System.out.print("Please, enter a name: ");
            if (!(name = new Scanner(System.in).nextLine()).equals("-1")){
                names.add(name);
            } else {
             break;
            }
        }

        System.out.println(names);
    }
}
