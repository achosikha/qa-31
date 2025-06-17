package lesson_7_oop;

import lesson_7_oop.animal.Animal;
import lesson_7_oop.animal.Elephant;
import lesson_7_oop.animal.Lion;
import lesson_7_oop.animal.Wolf;
import lesson_7_oop.atm.DebitCard;

public class MyAgenda {
    public static void main(String[] args) {
        // 1. Constructors  - Interview questions?
        // 2. Constructors - overload
        // 3. Keyword - this
        // 4. OOP - introduction
        // 4.1. Encapsulation
        // 4.2. Inheritance
        // 4.3. Polymorphism
        getObjectInfoDirectly();
    }

    public static void getObjectInfoDirectly(){
        Animal archil = new Lion("Lion", "Archil", "Yellow", "Male",
                5, 110);

        System.out.println(archil);
    }

    public static void createAnimals(){
        Animal lionJohnny = new Lion("Lion", "Johnny", "Yellow", "Male",
                2, 99);
        Animal lionTeresa = new Lion("Lion", "Teresa", "Yellow", "Female",
                4, 131);

        System.out.println(lionJohnny.getAnimalInformation());
        System.out.println("*****************************************************");
        System.out.println(lionTeresa.getAnimalInformation());

        Animal[] zoo = new Animal[]{
                new Lion("Lion", "Maksim", "Yellow", "Male",
                        3, 111),
                new Elephant("Elephant", "Archil", "Grey", "Male",
                        40, 1450),
                new Wolf("Wolf", "Maria", "Grey", "Female",
                        10, 85),
                new Elephant("Elephant", "Zoy", "Grey", "Female",
                        5, 500)
        };

        System.out.println("*****************************************************");

        System.out.println(zoo[0].getAnimalInformation());

        System.out.println("*****************************************************");

        for (Animal element : zoo){
            System.out.println(element.getAnimalInformation());
            System.out.println("*****************************************************");
        }

        zoo[0].walks();
        zoo[1].walks();
        zoo[2].walks();
        zoo[3].walks();
    }

    public static void createAnimal(){
        Animal animal = new Animal("Lion", "Johnny", "Yellow", "Male",
                3, 130);

        System.out.println(animal.getAnimalInformation());
        animal.setAnimalWeight(128.7);
        System.out.println("*****************************************");
        System.out.println("Weight DATA UPDATED!");
        System.out.println(animal.getAnimalInformation());
    }

    public static void createDebitCardAddMoney(){
        DebitCard katya = new DebitCard("Katya Ivanova", "JH Minsk",
                586058499503L, 20395064493L, 1945);

        System.out.println(katya.getDebitCardInformation());

        System.out.println("Add money.");
        katya.addMoney(56);
        System.out.println("Katya has the balance of: " + katya.getBalance());
        System.out.println("Get money.");
        katya.takeMoney(459);
        System.out.println("Katya has the balance of: " + katya.getBalance());
    }

    public static void createObjectSeeThis(){
        DebitCard debitCardAddress = new DebitCard("Archil Sikharulidze", "Unknown",
                56804840485L, 0L, 1990);

        // lesson_7_oop.atm.DebitCard@5caf905d (прямо через имя объекта)
        // lesson_7_oop.atm.DebitCard@5caf905d (через ключевое слово - this)
        System.out.println(debitCardAddress.getDebitCardInformation());

        // String - "Unknown"
        // - 1
        DebitCard debitCardSetMyDefaultValues = new DebitCard();

        System.out.println("*******************************************************************");
        System.out.println(debitCardSetMyDefaultValues.getDebitCardInformation());

        DebitCard debitCardTwoParameters = new DebitCard("Archil Sikharulidze", "BOG");

        System.out.println("*******************************************************************");
        System.out.println(debitCardTwoParameters.getDebitCardInformation());
    }

    public static void createDebitCard(){
        DebitCard tbc_archil = new DebitCard("Archil Sikharulidze", "TBC",
                576984047294L, 45867495053L, 6745L); // Вызываем КОНСТРУКТОР

        System.out.println(tbc_archil.getDebitCardInformation());

        System.out.println("***********************************************************");

        DebitCard bog_stas = new DebitCard();
        System.out.println(bog_stas.getDebitCardInformation());

        System.out.println("***********************************************************");

        DebitCard kl_alisa = new DebitCard("Alisa");
        System.out.println(kl_alisa.getDebitCardInformation());

        System.out.println("***********************************************************");

        DebitCard jh_viktoria = new DebitCard("Viktoria", "JH Minsk");
        System.out.println(jh_viktoria.getDebitCardInformation());

        System.out.println("***********************************************************");
    }
}