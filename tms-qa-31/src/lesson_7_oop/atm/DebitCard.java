package lesson_7_oop.atm;

public class DebitCard {
    public String debitCardHolder;
    public String debitCardBank;
    public long debitCardNumber;
    public long debitCardAccountNumber;
    public long debitCardBalance;

    // 1. !!! КОНСТРУКТОР ВСЕГДА ЕСТЬ
    // Если вы сами не написали ДЕФОЛЬНЫЙ КОНСТРУКТОР - это КОНСТРУКТОР ЛЮБОГО ТИПА
    // ТО САМ КОМПИЛЯТОР ВО ВРЕМЯ СБОРКИ ПРОГРАММИ ДОБАВИТ ПУСТОК КОНСТРУКТОР
    // Дефолтный конструктор, который добавил компилятор выглядит ТАК:
    public DebitCard(){
        this("Unknown", "Unknown",
                -1L, -1L, -1L);
    }

    public DebitCard(String debitCardHolder){
        this(debitCardHolder, "Unknown", -1L, -1L, -1L);
    }

    public DebitCard(String debitCardHolder, String debitCardBank){
        this(debitCardHolder, debitCardBank, -1L, -1L, -1L);
    }

    // 2. !!! ЕСЛИ вы добавили ЛЮБОЙ КОНСТРУКТОР - КОМПИЛЯОТР САМ УЖЕ НИЧЕГО НЕ ДОБАВИТ !!!
    public DebitCard(String debitCardHolder, String debitCardBank, long debitCardNumber,
                     long debitCardAccountNumber, long debitCardBalance){
        this.debitCardHolder = debitCardHolder;
        this.debitCardBank = debitCardBank;
        this.debitCardNumber = debitCardNumber;
        this.debitCardAccountNumber = debitCardAccountNumber;
        this.debitCardBalance = debitCardBalance;
    }

    // KEYWORD: this - он будет указывать на адрес определенного экземпляра класса

    public String getDebitCardInformation(){
        return "Card Bank is: " + debitCardBank + "\n" +
                "Debit Card Holder is: " + debitCardHolder + "\n" +
                "Debit Card Number is: " + debitCardNumber + "\n" +
                "Debit Card account number is: " + debitCardAccountNumber + "\n" +
                "Debit Card balance is: " + debitCardBalance + "\n" +
                "This object has an address: " + this;
    }

    public void addMoney(long money){
        this.debitCardBalance += money;
    }

    public void takeMoney(long money){
        this.debitCardBalance -= money;
    }

    public long getBalance(){
        return this.debitCardBalance;
    }
}

/*
    public DebitCard(String debitCardHolder){
        this.debitCardHolder = debitCardHolder;
    }

    public DebitCard(String debitCardHolder, String debitCardBank){
        this.debitCardHolder = debitCardHolder;
        this.debitCardBank = debitCardBank;
    }
 */