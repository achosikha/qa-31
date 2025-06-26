package lesson_9_interfaces_exceptions.inher;

public class ControllerUniversal extends ControllerP {
    public ControllerUniversal(String controllerModel, int productionYear) {
        super(controllerModel, productionYear);
    }

    // TV CONTROLLER
    @Override
    public void turnOnTV() {
        System.out.println("You have TURNED ON TV!");
    }

    @Override
    public void turnOffTV() {
        System.out.println("You have TURNED OFF TV!");
    }

    @Override
    public void increaseVolumeTV() {
        System.out.println("You have increased volume by ONE!");
    }

    @Override
    public void decreaseVolumeTV() {
        System.out.println("You have decreased volume by ONE!");
    }

    @Override
    public void channelUpTV() {
        System.out.println("You have channeled UP!");
    }

    @Override
    public void channelDownTV() {
        System.out.println("You have channeled DOWN!");
    }

    @Override
    public String toString() {
        return "Controller: \n\t" +
                "Model: " + super.getControllerModel() + "\n\t" +
                "Production year: " + super.getProductionYear();
    }

    // INTERNET CONTROLLER
    @Override
    public void turnOnYouTube() {
        System.out.println("YouTube has been initiated.");
    }

    @Override
    public void turnOnNetflix() {
        System.out.println("Would you like to choose a Netflix movie?");
    }

    @Override
    public void goToMenu() {
        System.out.println("You have chosen to go to MENU.");
    }
}
