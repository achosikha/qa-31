package lesson_8_abstract_interface.pc;

public class PCI10 extends PC{
    public PCI10(Monitor monitor, Motherboard motherboard, Processor processor, RAM ram, Cooler cooler, HDD hdd) {
        super(monitor, motherboard, processor, ram, cooler, hdd);
        super.setPcName("PCI10");
    }
}
