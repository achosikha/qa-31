package lesson_8_abstract_interface.pc;

// COMPOSITION - т.е. когда сам объект состоит из других объектов и отношения между ними - ИМЕЕТ/has
public class PC {
    private String pcName;
    private Monitor monitor;
    private Motherboard motherboard;
    private Processor processor;
    private RAM ram;
    private Cooler cooler;
    private HDD hdd;

    public PC(Monitor monitor, Motherboard motherboard, Processor processor, RAM ram, Cooler cooler, HDD hdd){
        this.pcName = "PC";
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.processor = processor;
        this.ram = ram;
        this.cooler = cooler;
        this.hdd = hdd;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public void turnOnPC(){
        System.out.println("Your PC is RUNNING...");
    }

    public void turnOffPC(){
        System.out.println("Your PC is TURNED OFF...");
    }

    // ПЕРЕОПРЕДЕЛЕНИЕ - ЭТО И ЕСТЬ ПОЛИМОРФИЗМ, Т.Е. ОДИН ИНТРФЕЙС (метод просто одинаковый), но МНОЖЕСТВЕННАЯ
    // РЕАЛИЗАЦИЯ, само тело метода РАЗНОЕ
    @Override
    public String toString() {
        return "You PC has the following details:\n\t" +
                "PC name: " + this.pcName + "\n\t" +
                "Monitor:\n\t\t" + this.monitor + "\t" +
                "Motherboard:\n\t\t" + this.motherboard + "\t" +
                "Processor:\n\t\t" + this.processor + "\t" +
                "RAM:\n\t\t" + this.ram + "\t" +
                "Cooler:\n\t\t" + this.cooler + "\t" +
                "HDD:\n\t\t" + this.hdd;
    }
}