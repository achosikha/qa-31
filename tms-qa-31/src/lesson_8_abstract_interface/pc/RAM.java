package lesson_8_abstract_interface.pc;

public class RAM {
    private String model;
    private String type;
    private double size;

    public RAM(String model, String type, double size) {
        this.model = model;
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "RAM model: " + this.model + "\n\t\t" +
                "RAM type: " + this.type + "\n\t\t" +
                "RAM size: " + this.size + "\n";
    }
}
