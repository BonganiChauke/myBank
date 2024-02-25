/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mybank;
import java.util.*;

/**
 *
 * @author Romeo
 */
public class Account {
    
    //method to open an account
    public void openAccount(Scanner input, String firstName, String lastName, String typeAccount){
        
        //prompts user for first name
        System.out.println("Enter first name: " + firstName);
        input.next(firstName);
        
        //prompts user for last name
        System.out.println("Enter last name: " + lastName);
        input.next(lastName);
        
        //prompts user for type of account
        System.out.println("Savigs or Cheque: " + typeAccount);
        input.next(typeAccount);
        
    }
    
}
