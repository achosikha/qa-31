package lesson_10_string;

public class MyStrings {
    public static void main(String[] args) {
        // Strings
        useStringBuilder();
    }

    public static void useStringBuilder(){
        // Возможности по сужению и расширению СТРОЧКИ добавлены и реализованы в классе StringBuilder
        // По сути, StringBuilder - используется всегда, когда надо менять элементы или значения СТРОЧЕК
        // Calculator: 15x20-5/2
        // BACKSPACE и удаляю по одному элементу значения строчки
        // Такой функционал выполняется лишь через StringBuilder
        StringBuilder dynamicString = new StringBuilder();

        System.out.println(dynamicString);
        dynamicString.append("A");
        System.out.println(dynamicString);
        dynamicString.append(" means Archil");
        System.out.println(dynamicString);
        dynamicString.delete(0, dynamicString.length());
        System.out.println(dynamicString);
        dynamicString.append("Java Development is INTERESTING!");
        System.out.println(dynamicString);
        dynamicString.reverse();
        System.out.println(dynamicString);
        dynamicString.reverse();
        System.out.println(dynamicString);
        dynamicString.replace(0, 4, "PHP");
        System.out.println(dynamicString);
        dynamicString.delete(15, dynamicString.length());
        System.out.println(dynamicString);
    }

    public static void getStringBasicMethods(){
        // toString(), valueOf(), toCharArray(), charAt()

        // STRING это неизменяемая переменная, СТРИНГ нельзя поменять
        // Т.е. значение переменной СТРИНГ не меняется, а оно заново создается
        String name = "Archil"; // КОНСТАНТА, ее нельзя менять
        name = "Vasily"; // Благодаря внутренней оптимизации, строчка "Archil" удалятся, создается новая с новым значением

        for (int index = 0; index < name.length(); index++){
            System.out.println(name.charAt(index));
        }
    }

    public static void concatenateString(){
        String name = "Archil";
        String surname = "Sikharulidze";
        int age = 36;
        String birth = "16/10/1988";

        String fullDetails = "Your name is: " + name + ". Your surname is: " + surname +
                ". Your age is: " + age + ". And your date of birth is: " + birth + ".\n";

        System.out.print(fullDetails);

        // Чтобы превратить любое другое значение в СТРОЧКУ надо вместе с ним передать хоть что-то из СТРОЧКИ
        // В том числе ничего ""
        String ageValue = "" + age;
        System.out.println(ageValue);

        // String - valueOf() превращает любой тип в СТРОЧКУ
        String ageMethod = String.valueOf(age);
        System.out.println(ageMethod);
    }

    public static void getStringOptimization(){
        // Если String это класс
        // То почему мне не нужно создавать его через ключевое слово NEW
        // И что будет если я создам его таким образом
        String name = "Archil"; // 0x0045df -> Heap - "Archil"
        String surname = "Sikharulidze"; // 0x33934df -> Heap - "Sikharulidze"

        // STRING POOL -> name (address) -> "Archil" - name (address) == nameDuplicate (address)
        String nameDuplicate = "Archil";
        String fullName = name + " " + surname; // "Archil Sikharulidze" IN STRING POOL

        // НИКОГДА, НИКОГДА не создавать СТРОЧКУ через КЛЮЧЕВОЕ СЛОВО NEW
        // ИСКЛЮЧЕНИЕ: ЕСЛИ ВЫ ЦЕЛЕНАПРАВЛЕННО НАРУШАЕТЕ ОПТИМИЗАЦИЮ КЛАССА
        // Т.Е. ВЫ ЗНАЕТЕ ЧТО ДЕЛАЕТЕ И КАКИЕ БУДУТ ПОСЛЕДСТВИЯ
        String fullNameNotOptimized = new String("Archil Sikharulidze"); // NOT IN STRING POOL

        // == - оно сравнивает не значения, а адреса
        // У разных строчек будут обязательно разные адреса даже в СТРИНГ ПУЛЕ
        // Но у оптимизированных строчек, у которых одинаковые значения и адреса одинаковые
        // Потому что класс СТРИНГ пытается сохранить пространство и не тратить его зря
        System.out.println(name == surname); // TRUE -- FALSE
        System.out.println(name == nameDuplicate); // FALSE -- TRUE СОВПАЛИ АДРЕСА ПОСКОЛЬКУ ОНИ УКАЗЫВАЮТ НА ОДНО ЗНАЧЕНИЕ

        // Нарушена оптимизация строчек, вы целенаправленно создали и выделили память отдельно
        // Под определенную строчку
        // Поэтому, даже если значения совпадают, адреса будут разными
        // == это сравнение адресов, поэтому тут ЛОЖЬ
        System.out.println(fullName == fullNameNotOptimized); // FALSE -- FALSE
        System.out.println(fullName.equals(fullNameNotOptimized)); // TRUE
    }

    public static void getStringBasics(){
        String name = "Archil";
        String surname = "Sikharulidze";

        // null - что у экземпляра класса String нет пока адреса, т.е. нет значения и нет выделенной памяти
        String address = null;

        // CharSequence
        // Массив символов типа знак - char
        String value = "Archil Sikharulidze";

        // value = valueLetters
        char[] valueLetters = new char[]
                {'A', 'r', 'c', 'h', 'i', 'l', ' ', 'S', 'i', 'k', 'h', 'a', 'r', 'u', 'l', 'i', 'd', 'z', 'e'};

        // Компьютер может различить МАССИВ от СТРОЧКИ одним знаком, этот знак ставится автоматический в конце каждой
        // строки - '\0' - это знак КОНЦА СТРОКИ
        String position = "Java Developer"; // 14 знаков + 1 знак конца строки * 2 байта = 30 байтов
        char[] positionArray = position.toCharArray(); // Он просто убирает символ КОНЦА СТРОКИ и превращается в массив

        System.out.println("String: " + position);

        System.out.print("Array of chars: ");
        for (char el : positionArray){
            System.out.print(el);
        }

        System.out.println();

        // Character - обертка примитивного типа char
        // SIZE берет размер, который занимает мой символ в памяти
        System.out.println("SIZE OF CHARACTER in my JAVA: " + Character.SIZE + " bits, " +
                (Character.SIZE / 8) + " bytes");
    }
}