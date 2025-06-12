package lesson_6_methods_objects.myobject;

public class ATM {
    String bankName;
    long bankAccountNumber;
    double bankAccountDebit;

    // Constructor это метод, который автоматически используется при создании экземпляра класса
    // Название конструктора соответствует названию КЛАССА
    public ATM(String name, long accountNumber, double debit){
        bankName = name;
        bankAccountNumber = accountNumber;
        bankAccountDebit = debit;
    }

    public void getATMData(){
        System.out.println("Your ATM data is: ");
        System.out.println("ATM name: " + bankName);
        System.out.println("Bank account number is: " + bankAccountNumber);
        System.out.println("How much money do you have on your bank account: " + bankAccountDebit);
    }
}
