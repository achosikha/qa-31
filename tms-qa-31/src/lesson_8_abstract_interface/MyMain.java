package lesson_8_abstract_interface;

import lesson_8_abstract_interface.pc.*;

public class MyMain {
    public static void main(String[] args) {
        // Create PC
        createCP();
    }

    public static void createCP(){
        PC i9Intel = new PC(
                new Monitor("Dell", 17, 1920, 160),
                new Motherboard("GK Op 98", 8, 12),
                new Processor("i9 UY567", 8, 3.2),
                new RAM("Kingston", "DDR5", 32),
                new Cooler("KL Kingston A5", 220, 320),
                new HDD("JK Geagabate", "HDD", 2, new String[]{"Voltage: 220", "Ports: 4"})
        );

        System.out.println(i9Intel);
        i9Intel.turnOnPC();
        i9Intel.turnOffPC();

        System.out.println("****************************************************************************************");
        PC pcI10 = new PCI10(
                new Monitor("TOSHIBA", 15, 3200, 220),
                new Motherboard("GK Op 98", 8, 12),
                new Processor("i9 UY567", 8, 3.2),
                new RAM("Kingston", "DDR5", 32),
                new Cooler("KL Kingston A5", 220, 320),
                new HDD("JK Geagabate", "HDD", 2, new String[]{"Voltage: 220", "Ports: 4"})
        );

        System.out.println(pcI10);
    }

    public static void getParameters(String name, int value){
        // Передача в метод дефолтных или заводских значений
        // Это когда метод должен принять определенные значения, но учитан случай, когда их может и не быть
        // Тогда передается что-то заранее подготовленное
        // Например, если я не передам напрямую в String name значение, то в некоторых языках программирования
        // Я могу задать ЗАВОДСКОЕ значение, например, НЕИЗВЕСТНО
        // !!! НО В ДЖАВА ТАКОГО ФУНКЦИОНАЛА ПРОСТО НЕТ
        // НЕЛЬЗЯ УКАЗАТЬ, ЧТО МЕТОД ДОЛЖЕН ПРИНИМАТЬ ЗНАЧЕНИЕ, А ПОТОМ ЕГО НЕ ПЕРЕДАТЬ
        // И НА ТАКОЙ СЛУЧАЙ СОЗДАТЬ КАКОЕ-ТО ЗАВОДСКОН ЗНАЧЕНИЕ
        // ТАК НЕЛЬЗЯ: public static void getParameters(String name = "Unknown", int value = 5){}
        // А потом вызов метода: getParameters();
    }

    public static void getParameters(){
        //
    }
}