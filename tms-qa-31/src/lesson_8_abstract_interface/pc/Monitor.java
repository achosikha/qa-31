package lesson_8_abstract_interface.pc;

public class Monitor{
    private String model;
    private double screenDimension;
    private int pixels;
    private int hz;

    public Monitor(String model, double screenDimension, int pixels, int hz){
        this.model = model;
        this.screenDimension = screenDimension;
        this.pixels = pixels;
        this.hz = hz;
    }

    @Override
    public String toString() {
        return "Monitor model: " + this.model + "\n\t\t" +
                "Monitor dimension: " + this.screenDimension + "\n\t\t" +
                "Monitor pixels: " + this.pixels + "\n\t\t" +
                "Monitor HZ: " + this.hz + "\n";
    }
}