/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mybank;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import static mybank.MyBank.input;

/**
 *
 * @author Romeo
 */
public class Account {

    private static final AtomicInteger count = new AtomicInteger(145396); // to increament the value 
    private int accountNumber; // accountNumber to auto generated to the user
    
    //variables to store large units useful for balance and deposit amounts
    public static long depositAmount, withdrawAmount, balance;

    //method for menu display
    public void menu() {

        //try and catch for error handling
        try {

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
                    //application exit
                    System.exit(0);
                    break;

                default:
                    System.out.print("Invalid Input\n");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage() + "\n");
        }
    }//end

    //method to open an account
    public void openAccount(Scanner input, String firstName, String lastName, String typeAccount) {

        //try catch statement for error handling 
        try {

            //prompts user for first name
            System.out.println("Enter first name: ");
            firstName = input.next();

            //prompts user for last name
            System.out.println("Enter last name: ");
            lastName = input.next();

            int option = 0;

            //do while to keep looping the prompt if selects an invalid input
//            do {
//
//                //prompts user for type of account
//                System.out.println("Select an option :\n1. Savigs\n2. Cheque");
//                option = input.nextInt();
//
//                //if statement to assign a value to variable typeAccount
//                if (option == 1) {
//
//                    typeAccount = "Savings";
//
//                } else if (option == 2) {
//
//                    typeAccount = "Cheque";
//
//                } else {
//
//                    System.out.println("Invalid Option");
//                }
//
//            } while (option != 1 && option != 2);
            //while to loop the prompt if a user selects an invalid
            while (option != 1 && option != 2) {

                //prompts user for type of account
                System.out.println("Select an option :\n1. Savigs\n2. Cheque");
                option = input.nextInt();

                //if statement to assign a value to variable typeAccount
                if (option == 1) {

                    typeAccount = "Savings";

                } else if (option == 2) {

                    typeAccount = "Cheque";

                } else {

                    System.out.println("Invalid Option");
                }
            }

            accountNumber = count.incrementAndGet();// to increment the variable accountNumber using count AtomicInteger
            System.out.println("\n*************************************************\n"
                    + "Account Succesfully Created\n"
                    + "First Name : " + firstName + "\n"
                    + "Last Name  : " + lastName + "\n"
                    + "Type of Account : " + typeAccount + "\n"
                    + "Account Number  : " + accountNumber + "\n");

            System.out.println("\n");
            
            System.out.println("*************************************************\n"
                    + "Make your first deposit\n");
            
            //prompt for user to input balance
            System.out.println("Enter amount for : Deposit");
            balance = input.nextLong();
            
            System.out.println("\n");
            
            //calling the menu for user
            menu();

        } catch (Exception e) {

            System.out.println(e + "\n");

        }

    }//end
    
    //method to make a deposit
    public long deposit (Scanner input){
        
        //try catch for error handling 
        try{
            
            //Prompt for user to input deposit
            System.out.println("Enter the amount to : Deposit");
            depositAmount = input.nextLong();//store input to scanner
            
            //adding deposit to balance
            balance = balance + depositAmount;
        
        }catch (Exception e){
            
         System.out.println(e + "\n");
          
        }
              
        return depositAmount;// return statement
    }
    
    //method to withdraw 
    public long withdraw(Scanner input){
        
        //try catch 
        try{
        
            //prompt for user to enter amount to withdraw
            System.out.println("Enter amount to : Withdraw ");
            withdrawAmount = input.nextLong();
            
            //if statement for checking negative
            if(balance >= withdrawAmount){
                
                //To calculate available amount
                long availableBalance = balance - withdrawAmount;
                
                //Shows user amount available
                System.out.println("Available balance : " + withdrawAmount);
                
                
            }else{
                
              System.out.print("Transaction failed... Insuffient Amount\t Transaction Failed...!!!");

            }
        
        }catch(Exception e){
            
            System.out.println(e + "\n");

        }
        
        return withdrawAmount;
        
    }

}
