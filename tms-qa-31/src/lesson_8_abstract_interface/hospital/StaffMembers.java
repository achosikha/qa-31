package lesson_8_abstract_interface.hospital;

// abstract - что класс StaffMembers не может себя создать
// Не может создать собственный экземпляр класса
// Поскольку он общий и лишь передает данные и свои свойства дочерним классам
// Эти дочерние классы и должна определять в какую группу попадает сотрудник
// В списке сотрудников не может быть ЧТО-то ОБЩЕЕ
public abstract class StaffMembers {
    // final вместе с переменной делают ее КОНСТАНТОЙ
    // Т.е. ее значение нельзя после определения изменить
    private final String name;
    private final String surname;
    private final String birthDate; // ВОТ ДАТА РОЖДЕНИЯ ЭТО КОНСТАНТА
    private final int age;
    private final String profession;
    private final String additionalInformation;

    public StaffMembers(String name, String surname, String birthDate, int age, String profession,
                        String additionalInformation) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.age = age;
        this.profession = profession;
        this.additionalInformation = additionalInformation;
    }

    // abstract method - может находиться лишь в абстрактном классе
    // Он говорит следующее - я объявляю себя, но реализацию оставляю непосредственно
    // Не абстрактным дочерним классам
    public abstract void comeToOffice();

    @Override
    public String toString() {
        return "StaffMembers{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", additionalInformation='" + additionalInformation + '\'' +
                '}';
    }
}