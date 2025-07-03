package lesson_11_string_collections.collections;

public class Developer {
    private final String name;
    private final String surname;
    private final String position;
    private final String jobDescription;

    public Developer(String name, String surname, String position, String jobDescription) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Developer: \n" +
                "\tName = " + this.name + "\n" +
                "\tSurname = " + this.surname + "\n" +
                "\tPosition = " + this.position + "\n" +
                "\tJob description = " + this.jobDescription;
    }
}
