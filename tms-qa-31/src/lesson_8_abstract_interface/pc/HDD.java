package lesson_8_abstract_interface.pc;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HDD {
    private String model;
    private String type;
    private double size;
    private String[] additionalCharacteristics;

    public HDD(String model, String type, double size, String[] additionalCharacteristics) {
        this.model = model;
        this.type = type;
        this.size = size;
        this.additionalCharacteristics = additionalCharacteristics;
    }

    @Override
    public String toString() {
        return "HDD model: " + this.model + "\n\t\t" +
                "HDD type: " + this.type + "\n\t\t" +
                "HDD size: " + this.size + "\n\t\t" +
                "HDD additional characteristics: " + Arrays.toString(this.additionalCharacteristics);
    }
}
