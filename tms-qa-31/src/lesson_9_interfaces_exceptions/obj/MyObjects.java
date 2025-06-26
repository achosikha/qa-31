package lesson_9_interfaces_exceptions.obj;

public class MyObjects {
    public static void main(String[] args) {
        // Object

        // DEPRECATED - означает, что будет выведено из употребления программистами,
        // поэтому яростно не рекомендуется использование
        getObjectAddress();
    }

    public static void getObjectAddress(){
        Human archil = new Human("Archil", "Sikharulidze", "16/10/1988", 36);
        Human maksim = new Human("Maksim", "Alekseichik", "09/09/1995", 30);

        System.out.println(archil);
        System.out.println(maksim);

        // Вы взяли и переписали адрес Максима в адрес Арчила и теперь Арчил это просто еще один указатье на Максима
        // А Максим указывает на определенное место в КУЧЕ
        archil = maksim; // Арчил это АЛИАС (alias) Максима

        System.out.println(archil);
        maksim.setAge(-1988);
        System.out.println(archil);

        Human archil2 = new Human("Archil-2", "Sikharulidze-2", "16/10/1988-2", 36);
        System.out.println(archil2);
        archil2.copyHuman(archil);
        System.out.println(archil2);
    }

    public static void createObject(){
        Object integer = 100;
        Object character = 'A';
        Object isAlive = true;
        Object name = "Archil";
        Object weight = 189.495;

        Object[] differentTypes = new Object[]{"Archil", "Sikharulidze", 36, 171, 85, "Java Developer"};

        for (Object el : differentTypes){
            System.out.println(el);
        }
    }
}
