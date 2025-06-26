package lesson_9_interfaces_exceptions.interf;

// implements - интегрировать, внедрить, но не унаследовать, наследуемся только от КЛАССОВ
public class Controller implements TVFunctions, InternetFunctions, NonClassicalInt{
    // Нам нужен объект, у которого буде два функционала - ТВ и Интернет
    // У ТВ полностью свои кнопки и методы
    // У Интернета свои
    // Они по идее друг с другом не пересекаются

    // Controller -> взять функционал из ОБОИХ КЛАССОВ, при этом эти два класса не находятся в связи БАЗА-ДОЧЬ
    private final String controllerModel;
    private final int productionYear;

    public Controller(String controllerModel, int productionYear) {
        this.controllerModel = controllerModel;
        this.productionYear = productionYear;
    }

    // TV CONTROLLER
    @Override
    public void turnOnTV() {
        System.out.println(this.controllerModel + ": you have TURNED ON TV!");
    }

    @Override
    public void turnOffTV() {
        System.out.println(this.controllerModel + ": you have TURNED OFF TV!");
    }

    @Override
    public void increaseVolumeTV() {
        System.out.println(this.controllerModel + ": you have increased volume by ONE!");
    }

    @Override
    public void decreaseVolumeTV() {
        System.out.println(this.controllerModel + ": you have decreased volume by ONE!");
    }

    @Override
    public void channelUpTV() {
        System.out.println(this.controllerModel + ": you have channeled UP!");
    }

    @Override
    public void channelDownTV() {
        System.out.println(this.controllerModel + ": you have channeled DOWN!");
    }

    @Override
    public String toString() {
        return "Controller: \n\t" +
                "Model: " + this.controllerModel + "\n\t" +
                "Production year: " + this.productionYear;
    }

    // INTERNET CONTROLLER
    @Override
    public void turnOnYouTube() {
        System.out.println(this.controllerModel + ": YouTube has been initiated.");
    }

    @Override
    public void turnOnNetflix() {
        System.out.println(this.controllerModel + ": Would you like to choose a Netflix movie?");
    }

    @Override
    public void goToMenu() {
        System.out.println(this.controllerModel + ": you have chosen to go to MENU.");
    }

    public void getStaticVariablesInterface(){
        System.out.println(NonClassicalInt.name);
    }

    // THE CLASS METHODS
    @Override
    public String getInternetInfo() {
        return "Internet provider: MAGTI\n\t" +
                "Internet speed: 5GB,\n\t" +
                "Paid till: 09.09.2025";
    }
}