package lesson_8_abstract_interface.hospital;

// Если класс объявлен как final
// ОТ НЕГО ДРУГИЕ КЛАССЫ НЕ МОГУ УНАСЛЕДОВАТЬСЯ!!!!
public final class IT extends StaffMembers{
    public IT(String name, String surname, String birthDate, int age, String profession, String additionalInformation) {
        super(name, surname, birthDate, age, profession, additionalInformation);
    }

    @Override
    public void comeToOffice() {
        System.out.println("This method has been called from the IT class. IT can actually work remotely!");
    }
}