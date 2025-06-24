package lesson_8_abstract_interface.hospital;

public class Doctors extends StaffMembers{
    public Doctors(String name, String surname, String birthDate, int age, String profession, String additionalInformation) {
        super(name, surname, birthDate, age, profession, additionalInformation);
    }

    @Override
    public void comeToOffice() {
        System.out.println("This method has been called from the Doctors class. Doctors come early in the morning!");
    }

    public void justForDoctors(){
        System.out.println("This message is just for DOCTORS!");
    }
}
