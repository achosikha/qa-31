package lesson_7_oop.animal;

public class Wolf extends Animal{
    public Wolf(String animalType, String animalName, String animalColor, String animalSex,
                int animalAge, double animalWeight) {
        super("Wolf", animalName, animalColor, animalSex, animalAge, animalWeight);
    }

    @Override
    public void walks() {
        System.out.println("I am a WOLF! My name is: " + this.getAnimalName());
    }
}
