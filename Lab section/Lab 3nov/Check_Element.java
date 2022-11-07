/*
 Q2) Write a Java program to check if a particular element exists in a linked list.
	NAME:-PRATHMESH RAJESH GONDHALI
	DATE:-3-11-2022
 */
package Labsession;
import java.util.*;
public class Check_Element {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		LinkedList <String>type_of_dance= new LinkedList <String> ();
		 
		  type_of_dance.add("Hip Hop");
	      type_of_dance.add("jazz");
	      type_of_dance.add("Folk Dance");
	      type_of_dance.add("Lavani");
	      type_of_dance.add("Garba");
	      type_of_dance.add("kathk");

		
		//System.out.println();
        System.out.print("Enter a dance name :");
        String name = sc.nextLine();
        sc.close();
      		// Checks whether the Name  exists or not.
      	if (type_of_dance.contains(name.toUpperCase()))
      	{
    	  System.out.println(name.toUpperCase()+" is present in the linked list.");
      } 
      	else
      	{
    	  System.out.println(name.toUpperCase()+" is not present in the linked list.");
      }
	}

}