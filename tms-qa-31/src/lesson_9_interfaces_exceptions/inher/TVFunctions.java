package lesson_9_interfaces_exceptions.inher;

public interface TVFunctions {
    // 1. Интервейс это полная АБСТРАКЦИЯ
    // 2. В классическом варианте - ОН НИЧЕГО НЕ ХРАНИТ
    // 3. У него нет ПОЛЕЙ
    // 4. У него следовательно нет КОНСТРУКТОРА
    // 5. У него нет ТЕЛА МЕТОДА
    // 6. ИНТЕРФЕЙС ПРОСТО УКАЗЫВАЕТ НА АБСТРАКТНЫЕ МЕТОДЫ, КОТОРЫЕ КЛАСС ДОЛЖЕН У СЕБЯ РЕАЛИЗОВАТЬ
    // 7. ЭТО ПРОСТО ПЕРЕЧЕНО ФУНКЦИОНА
    // 8. А ВЫПОЛНЕНИЕ ЛЕЖИТ на плечах КЛАССА
    void turnOnTV();
    void turnOffTV();
    void increaseVolumeTV();
    void decreaseVolumeTV();
    void channelUpTV();
    void channelDownTV();
}