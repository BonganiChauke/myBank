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

    public static void main(String[] args) {
        // TODO code application logic here

        //try catch statement to handle exceptions
        try {

            //while loop to keep the running 
            while (true) {

                //menu system for user to select options
                System.out.println("Welcome to myBank \n"
                        + "1. View Balance\n"
                        + "2. Deposit\n"
                        + "3. Withdraw\n"
                        + "4. Exit\n");

                //variable to capture user input
                int option = input.nextInt();

                //switch case for user options
                switch (option) {

                    case 1:
                        //method to view balance
                        break;

                    case 2:
                        //method to deposit
                        break;

                    case 3:
                        //method to withdraw
                        break;

                    case 4:
                        //method to exit
                        break;

                    default:
                        System.out.print("Invalid Input\n");
                }

            }

        } catch (Exception e) {

            System.out.println(e.getMessage() + "\n");

        }

    }

}
