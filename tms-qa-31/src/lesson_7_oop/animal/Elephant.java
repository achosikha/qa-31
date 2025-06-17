package lesson_7_oop.animal;

public class Elephant extends Animal{
    public Elephant(String animalType, String animalName, String animalColor, String animalSex,
                    int animalAge, double animalWeight) {
        super("Elephant", animalName, animalColor, animalSex, animalAge, animalWeight);
    }

    @Override
    public void walks() {
        System.out.println("I am an ELEPHANT. My name is: " + this.getAnimalName());
    }
}
