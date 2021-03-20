/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tc_bc_appii;

import java.util.ArrayList;
import java.util.Date;

import worker_classes.Student;
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

        ArrayList<Student> students = new ArrayList();
        
        //First Student
        Student std1 = new Student();
        std1.setName("Victor Manakana");
        std1.setAddress("Johansburg, South Africa");
        std1.setGender("Male");
        std1.setDob(new Date("02/03/1997"));
        
        //Second Student
        Student std2 = new Student("Khanyisile Faith", "Cape Town, South Africa", new Date("03/04/1998"), "Female");
        
        //Third Student
        Student std3 = new Student("Mulamuleli Mphaphuli", "Cape Town, South Africa", new Date("09/11/1998"), "Female");
        
        students.add(std1);
        students.add(std2);
        students.add(std3);
        
        for(int i = 0; i < students.size(); i++){
            System.out.println("Student " + (i+1) + "\n__________________________________\n");
            System.out.println("\tName : " + students.get(i).getName());
            System.out.println("\tAddress : " + students.get(i).getAddress());
            System.out.println("\tGender : " + students.get(i).getGender());
            System.out.println("\tDate of Birth : " + students.get(i).getDob());
            System.out.println();
        }
            
    }
    
}
