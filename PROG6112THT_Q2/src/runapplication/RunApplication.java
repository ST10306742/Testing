/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runapplication;

import java.util.Scanner;

/**
 *
 * @author shail
 */
public class RunApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PROG6112 TAKE HOME TEST 2023
        //ST10306742
        
        Scanner kb = new Scanner(System.in);
        //Prompting the user for the the agent name 
        System.out.println("Enter the current estate agent name: "); 
        String name;
        name=kb.nextLine();
        //Prompting the user for the the property price
        System.out.println("Enter the property price: ");
        double propPrice;
        propPrice=kb.nextDouble();
        
        //instantiating object
        EstateAgentSales eas = new EstateAgentSales(name, propPrice);
        
        //calling print method
       eas.printPropertyReport();
        
    }
    
}
