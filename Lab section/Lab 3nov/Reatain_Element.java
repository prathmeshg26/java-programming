/*
 Q3)Write a Java program to compare two sets and retain elements which are same on both sets. (use retainAll method)
	NAME:-PRATHMESH RAJESH GONDHALI
	DATE:-3-11-2022
 */
package Labsession;
import java.util.*;
public class Reatain_Element {

	public static void main(String[] args) {
		HashSet<String> type_of_dance_1 = new HashSet<String>();
	     // use add() method to add values in the hash set
		type_of_dance_1.add("Lavani");
		type_of_dance_1.add("jazz");
		type_of_dance_1.add("kathk");
		
	    System.out.println("Frist Name Set content: "+type_of_dance_1);
	          
	          HashSet<String>type_of_dance_2= new HashSet<String>();
	          type_of_dance_2.add("Lavani");
	          type_of_dance_2.add("Garba");
	          type_of_dance_2.add("kathk");
		      
	          System.out.println("Second Name Set content: "+type_of_dance_2);
	          type_of_dance_1.retainAll(type_of_dance_2);
	          System.out.print("Common Elements : ");
	          System.out.println(type_of_dance_1);

	}


	}


