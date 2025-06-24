package lesson_8_abstract_interface;

// INCLUDE ALL CLASSES FROM THE PACKAGE .*;
import lesson_8_abstract_interface.cls.*;

/*
import lesson_8_abstract_interface.cls.MyClcA;
import lesson_8_abstract_interface.cls.MyClcB;
import lesson_8_abstract_interface.cls.MyClcC;
 */


import lesson_8_abstract_interface.hospital.Doctors;
import lesson_8_abstract_interface.hospital.IT;
import lesson_8_abstract_interface.hospital.StaffMembers;
import lesson_8_abstract_interface.hospital.Surgeon;
import lesson_8_abstract_interface.pc.*;

public class MyMain {
    public static void main(String[] args) {
        // Create PC
        createStaffMembers();
    }

    public static void inheritanceStructure(){
        StaffMembers staffMembers = new Doctors("A", "B", "1890", 0,
                "U", "U");

        Doctors doctors = new Doctors("A", "B", "1890", 0,"U", "U");

        Doctors surgeon = new Surgeon("A", "B", "1890", 0,"U", "U");

        Surgeon surgeonOnly = new Surgeon("A", "B", "1890", 0,"U", "U");
    }

    public static void createStaffMembers(){
        StaffMembers[] staffMembers = new StaffMembers[]{
                new Doctors("Stanisvlav", "Golovnev", "2000", 25,
                        "Surgeon", "N/A"),
                new IT("Maksim", "Alekseichik", "1995", 30,
                        "QA Automatization", "N/A"),
                new Surgeon("Katya", "Vasilisovna", "1985", 40,
                        "Surgeon", "N/A")
        };

        for (StaffMembers person : staffMembers){
            person.comeToOffice();
        }
    }

    public static void callMyCLS(){
        MyClcA myClcA = new MyClcA();
        MyClcB myClcB = new MyClcB();
        MyClcC myClcC = new MyClcC();
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