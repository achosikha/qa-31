package lesson_8_abstract_interface.pc;

public class Cooler {
    private String model;
    private double voltage;
    private int speed;

    public Cooler(String model, double voltage, int speed) {
        this.model = model;
        this.voltage = voltage;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Cooler model: " + this.model + "\n\t\t" +
                "Cooler voltage: " + this.voltage + "\n\t\t" +
                "Cooler speed: " + this.speed + "\n";
    }
}
