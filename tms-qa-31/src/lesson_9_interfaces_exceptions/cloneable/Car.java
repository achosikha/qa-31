package lesson_9_interfaces_exceptions.cloneable;

public class Car implements Cloneable{
    private final String model;
    private final String type;

    public Car(String model, String type) {
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public Car clone() {
        try {
            Car clone = (Car) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
