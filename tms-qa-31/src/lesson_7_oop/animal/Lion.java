package lesson_7_oop.animal;

// KEYWORD - extends говорит, что ЛЕВ ЭТО ЖИВОТНОЕ
// И он должен забрать у него все основные качества
// Особенно, ПОЛЯ - и внутреннюю структуру
public class Lion extends Animal{
    public Lion(String animalType, String animalName, String animalColor, String animalSex,
                int animalAge, double animalWeight) {
        // В дочернем классе, т.е. когда один класс наследуется от другого - старший класс называется
        // БАЗОВЫМ ИЛИ СУПЕР-КЛАССОМ, а тот что унаследовал от него какие-то данные - ДОЧЕРНИМ
        // KEYWORD: super() - в дочернем классе вызывает КОНСТРУКТЕР СУПЕР-КЛАССА
        // В нашем случаем, конструктор ЛЕВ, принимает параметры, вызывается конструктор класса ANIMAL
        // и через super передает туда значения
        super("Lion", animalName, animalColor, animalSex, animalAge, animalWeight);
    }

    // АННОТАЦИЯ которая СПРАШИВАЕТ КОМПИЛЯТОРА, в СУПЕР КЛАССЕ КЛАССА ЛЕВ (в нашем случае, Animal)
    // Есть такой метод, с точно таким названием и всеми параметрами: public void walks()
    // Если да, то ПЕРЕОПРЕДЕЛИ ЕГО СПЕЦИАЛЬНО для ЛЬВА
    // Т.е. создай свое собственное поведение - это и есть ПОЛИМОРФИЗМ
    @Override
    public void walks() {
        System.out.println("I am a LION. My name is: " + this.getAnimalName());
    }
}
