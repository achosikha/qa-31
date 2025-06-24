package lesson_8_abstract_interface.pc;

public class Motherboard {
    private String model;
    private int speed;
    private int sockets;

    public Motherboard(String model, int speed, int sockets) {
        this.model = model;
        this.speed = speed;
        this.sockets = sockets;
    }

    @Override
    public String toString() {
        return "Motherboard model: " + this.model + "\n\t\t" +
                "Motherboard speed: " + this.speed + "\n\t\t" +
                "Motherboard sockets: " + this.sockets + "\n";
    }
}