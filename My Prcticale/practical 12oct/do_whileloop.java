/* Question - Program to Demonstrate do-while and print reverse counting.
 NAME - PRATHMESH
 DATE - 12/10/2022. 
 */
package javacore;
import java.util.Scanner;

public class do_whileloop {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num =sc.nextInt();
		sc.close();
		 
		for(int i = num; i>=1; i--)
		{
		do
		{
			System.out.println(i);
			break;
}
			while(num >= 0);
   
}
		
}
	
}

