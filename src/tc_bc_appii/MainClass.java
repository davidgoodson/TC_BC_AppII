/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tc_bc_appii;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class MainClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> names = new ArrayList();
        
        names.add("Sihle");
        names.add("Victor");
        names.add("Thamo");
        names.add("Leader");
        
        //System.out.println("First student name is : " + names.get(0));
        //System.out.println("Third student name is : " + names.get(2));
        
        //names.set(0, "Faith");
        
        //System.out.println("First student name is : " + names.get(0));
        
        
        for(int i = 0; i < names.size(); i++)
            System.out.println("The Student at position " + (i+1) + " is " + names.get(i));
   
        
    }
    
}
