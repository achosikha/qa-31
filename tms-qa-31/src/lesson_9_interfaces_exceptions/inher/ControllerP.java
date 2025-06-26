package lesson_9_interfaces_exceptions.inher;

// implements - интегрировать, внедрить, но не унаследовать, наследуемся только от КЛАССОВ
public abstract class ControllerP implements TVFunctions, InternetFunctions, NonClassicalInt {
    // Нам нужен объект, у которого буде два функционала - ТВ и Интернет
    // У ТВ полностью свои кнопки и методы
    // У Интернета свои
    // Они по идее друг с другом не пересекаются

    // Controller -> взять функционал из ОБОИХ КЛАССОВ, при этом эти два класса не находятся в связи БАЗА-ДОЧЬ
    private final String controllerModel;
    private final int productionYear;

    public ControllerP(String controllerModel, int productionYear) {
        this.controllerModel = controllerModel;
        this.productionYear = productionYear;
    }

    public void getStaticVariablesInterface(){
        System.out.println(NonClassicalInt.name);
    }

    public String getControllerModel() {
        return controllerModel;
    }

    public int getProductionYear() {
        return productionYear;
    }

    // THE CLASS METHODS
    @Override
    public String getInternetInfo() {
        return "Internet provider: MAGTI\n\t" +
                "Internet speed: 5GB,\n\t" +
                "Paid till: 09.09.2025";
    }
}