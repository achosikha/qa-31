package lesson_7_oop.animal;

// Access modifier - модификатор доступа
public class Animal {
    // Public - полный внешний доступ, нет никаких ограничений
    // Private - никому не доступен извне, доступ только сам класс
    // Protected - защищенный доступ, пакет + классы, которые унаследуются
    // Default (package-private) - доступ на уровне ПАКЕТА

    // По правилам СКРЫТИЯ ДАННАХ - внещним объектам должно быть ЗАПРЕЩЕНО ПОЛУЧАТЬ ПРЯМОЙ ДОСТУП К ПОЛЯМ КЛАССА
    // ПОЛЯ КЛАССА ДОЛЖНЫ БЫТЬ СКРЫТЫ ОТО ВСЕХ, и с ними работать мы должно через вспомогающие методы
    // Вспомогающий метод, который поможет нат задать значение называется СЕТТЕРОМ
    // Вспомогающий метод, который поможет нам взять значение из переменной называется ГЕТТЕРОМ
    private String animalType;
    private String animalName;
    private String animalColor;
    private String animalSex;
    private int animalAge;
    private double animalWeight;

    public Animal(String animalType, String animalName, String animalColor, String animalSex,
                  int animalAge, double animalWeight){
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.animalSex = animalSex;
        this.animalAge = animalAge;
        this.animalWeight = animalWeight;
    }

    // Классический ГЕТТЕР
    public String getAnimalType(){
        return this.animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    // Классический СЕТТЕР
    public void setAnimalAge(int animalAge){
        this.animalAge = animalAge;
    }

    public void setAnimalWeight(double animalWeight){
        this.animalWeight = animalWeight;
    }

    public void walks(){
        System.out.println("This method WALKS is ORIGINAL from class ANIMAL.");
    }

    // toString() попытка привести непосредственно имя объекта к какому-то сточному значению
    // Мы можем использовать полиморфизм и сразу же его переопределить для нас
    @Override
    public String toString() {
        return "Your animal information is: \n" +
                "Animal type: " + this.animalType + "\n" +
                "Animal name: " + this.animalName + "\n" +
                "Animal color: " + this.animalColor + "\n" +
                "Animal sex: " + this.animalSex + "\n" +
                "Animal age: " + this.animalAge + "\n" +
                "Animal weight: " + this.animalWeight;
    }

    public String getAnimalInformation(){
        return "Your animal information is: \n" +
                "Animal type: " + this.animalType + "\n" +
                "Animal name: " + this.animalName + "\n" +
                "Animal color: " + this.animalColor + "\n" +
                "Animal sex: " + this.animalSex + "\n" +
                "Animal age: " + this.animalAge + "\n" +
                "Animal weight: " + this.animalWeight;
    }
}
