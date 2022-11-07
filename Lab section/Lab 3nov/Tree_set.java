/* Q4).Write a java program to get the element in a tree set which is strictly greater than or equal to the given element
 *  NAME:-PRATHMESH RAJESH GONDHALI
	DATE:-3-11-2022
 */
package Labsession;
import java.util.*;
public class Tree_set {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		// Creating an object of TreeSets class
		TreeSet<Integer> obj = new TreeSet<>();
	      
		   // Add numbers in the Queue
		   obj.add(54);
		   obj.add(65);
		   obj.add(59);
		   obj.add(12);
		   obj.add(63);
		   obj.add(64);
		   obj.add(87);
		   obj.add(98);
		   obj.add(12);
		   System.out.println("Original TreeSet: "+obj);
		   System.out.print("Enter a number: ");
		   int num = sc.nextInt();
		   sc.close();
		   if(num<=90) {
			   System.out.print("Value of TreeSet: " + obj.ceiling(num));
		   }
		   else
		   {
			   System.out.println("There is no number greater than in this TreeSet: " + num);
		   }
	}

}
