/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mybank;

import java.util.*;

/**
 *
 * @author Romeo
 */
public class MyBank {

    /**
     * @param args the command line arguments
     */
    //creating an instance of the scanner class
    static Scanner input = new Scanner(System.in);

    //creating an instance of account class
    static Account objAccount = new Account();

    //variable for the application
    static String firstName, lastName, typeAccount;

    public static void main(String[] args) {
        // TODO code application logic here

        //try catch statement to handle exceptions
        try {

            //while loop to keep the running 
            while (true) {

                //menu to prompt the user
                System.out.println("********************************************\n"
                        + "Welcome To myBank Application\n"
                        + "1. Create Account\n"
                        + "2. Exit Application\n");

                int option = input.nextInt();

                switch (option) {

                    case 1:
                        //calling the open account method
                        objAccount.openAccount(input, firstName, lastName, typeAccount);
                        break;

                    case 2:
                        //application exit
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid Input!!! Try Again");

                }

            }

        } catch (Exception e) {

            System.out.println(e.getMessage() + "\n");

        }

    }

}
