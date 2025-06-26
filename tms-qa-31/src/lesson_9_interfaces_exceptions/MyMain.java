package lesson_9_interfaces_exceptions;

import lesson_9_interfaces_exceptions.cloneable.Car;
import lesson_9_interfaces_exceptions.inher.ControllerP;
import lesson_9_interfaces_exceptions.inher.ControllerUniversal;
import lesson_9_interfaces_exceptions.interf.Controller;

// Standard Interface - это интерфейс, где есть более одного метода
// Functional Interface
// Marker Interface
public class MyMain {
    public static void main(String[] args) {
        //
        cloneCar();
    }

    public static void cloneCar(){
        Car bmw = new Car("BMW", "Sedan");
        Car mercedes = new Car("Mercedes", "GLC");
        Car opel = bmw.clone();

        System.out.println(opel);
    }

    public static void createControllerUniversal(){
        ControllerP lg = new ControllerUniversal("LG", 2018);

        System.out.println(lg.getControllerModel());
        System.out.println(lg.getProductionYear());
        System.out.println(lg.getInternetInfo());
    }

    public static void createController(){
        Controller samsungSmartTV = new Controller("Samsung", 2022);
        samsungSmartTV.turnOnTV();
        samsungSmartTV.channelUpTV();
        samsungSmartTV.decreaseVolumeTV();
        samsungSmartTV.turnOffTV();

        System.out.println("************************************");
        System.out.println(samsungSmartTV.getInternetInfo());
        samsungSmartTV.turnOnNetflix();
        samsungSmartTV.turnOnYouTube();
        samsungSmartTV.goToMenu();

        System.out.println("****************************************");
        System.out.println("Let's get data from Non-classical interface.");
        System.out.println(samsungSmartTV.getInterfaceFields());
        samsungSmartTV.getStaticVariablesInterface();
    }
}
