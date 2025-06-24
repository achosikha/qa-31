package lesson_8_abstract_interface.hospital;

public class Surgeon extends Doctors{
    public Surgeon(String name, String surname, String birthDate, int age, String profession, String additionalInformation) {
        super(name, surname, birthDate, age, profession, additionalInformation);
    }

    @Override
    public void comeToOffice() {
        System.out.println("This method has been called from the Surgeon that extends Doctors class." +
                "Surgeon are elites Doctors they come when they do operate!");
    }

    @Override
    public void justForDoctors() {
        System.out.println("This method has been initiated in DOCTORS but changed value in SURGEON!");
    }

    public void justForSurgeons(){
        System.out.println("This method is JUST FOR SURGEONS!");
    }

    // У меня есть метод, у которого ЕСТЬ ТОЛЬКО ОДНА РЕАЛИЗАЦИЯ
    // Т.е. если я хочу ЗАПРЕТИТЬ ПОЛИМОРФИЗМ и заставить все дальнейшие дочерние классы
    // использовать только мою реализацию - то я сделаю метод final
    public final void noOtherRealizations(){
        System.out.println("This method cannot be overridden. Even if you inherit this class you can't " +
                "have you realization of this method");
    }
}