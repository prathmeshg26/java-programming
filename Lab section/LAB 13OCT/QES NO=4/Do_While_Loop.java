/* QES4:- WAP to print sum of only positive numbers using do-while loop. Take the input from the user. 
			if the user enters any negative number then that number should not be added in sum.
			NAME:-PRATHMESH
			DATE:-13/10/2022
*/			
package javacore;
import java.util.Scanner;
public class Do_While_Loop {

	public static void main(String[] args) {
		
		int sum = 0;
	    int number = 0;

	    // create an object of Scanner class
	    Scanner sc = new Scanner(System.in);
	    
	    
	    do 
	    
	    
	    {
	      
	      sum += number;
	      System.out.print("Enter a number: ");
	      number = sc.nextInt();
	      
	    } 
	    
	    
	    while(number >= 0); 
	    
	    System.out.println("Sum = " + sum);
	    sc.close();
	  }

}
