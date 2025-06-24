package lesson_8_abstract_interface.pc;

public class Processor {
    private String model;
    private int cores;
    private double speed;

    public Processor(String model, int cores, double speed) {
        this.model = model;
        this.cores = cores;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Processor model: " + this.model + "\n\t\t" +
                "Processor cores: " + this.cores + "\n\t\t" +
                "Processor speed: " + this.speed + "\n";
    }
}
