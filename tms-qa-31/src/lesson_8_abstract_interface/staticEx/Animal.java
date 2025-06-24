package lesson_8_abstract_interface.staticEx;

public class Animal {
    private final String name;
    private final String type;

    // Это переменная в ОДНОМ ЭКЗЕМПЛЯРЕ
    // ОНА ПРИНАДЛЕЖИТ НЕПОСРЕДСТВЕННО КЛАССУ
    // А НЕ ЕГО РАЗНЫМ ЭКЗЕМПЛЯРАМ
    // К НЕМУ ДОСТУП ИМЕТЮ ВСЕ
    private static int animalsNumber;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        animalsNumber++;
    }

    public static int getAnimalsNumber() {
        return animalsNumber;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
