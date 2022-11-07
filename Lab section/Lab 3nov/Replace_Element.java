/*
 Q1) Write a Java program to replace the second element of a ArrayList with the specified element.
 	NAME:-PRATHMESH RAJESH GONDHALI
	DATE:-3-11-2022
 */

package Labsession;
import java.util.*;
public class Replace_Element {

	public static void main(String[] args) {
		
	    

	      // Creating an object of ArrayList class
	      ArrayList<String> type_of_dance= new ArrayList<>();



	      // using add() method
	      type_of_dance.add("Hip Hop");
	      type_of_dance.add("jazz");
	      type_of_dance.add("Folk Dance");
	      type_of_dance.add("Lavani");
	      type_of_dance.add("Garba");


	      // Print all the elements
	      System.out.println("Original array list: " +  type_of_dance);


	      String obj1 = "Kathak";
	      
	      type_of_dance.set(1,obj1);
	      System.out.println("New Replace array list: " + type_of_dance);	  

	    
	    }
}

  
  

