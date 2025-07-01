package lesson_10_string;

import java.util.Scanner;

public class MyPassword {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter you password for verification: ");
            String password = input.nextLine();

            validatePassword(password);
        } catch (CheckMyPasswordException e){
            System.out.println(e.getMessage());
        }
    }

    public static void validatePassword(String password) throws CheckMyPasswordException {
        String passwordHidden = "eRt45_!";

        if (!passwordHidden.equals(password))
            throw new CheckMyPasswordException("WRONG PASSWORD! NO ACCESS GRANTED!");
        System.out.println("YOU HAVE BEEN GRANTED AN ACCESS!");
    }

    public static void setRegularDefinedException(String passwordHidden){
        try{
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter your password: ");
            String password = input.nextLine();

            if (passwordHidden.equals(password)){
                System.out.println("ACCESS GRANTED!");
            } else {
                throw new CheckMyPasswordException("WRONG PASSWORD! NO ACCESS GRANTED!");
            }
        } catch (CheckMyPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}