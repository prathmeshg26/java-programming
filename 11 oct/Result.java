/* Qes2:- Demonstrate if-else statement of 5
 * subject.the person who get above 60% will be
 * passed otherwise faild.output should be like:
 * Enter you name, Enter marks for the 5 subject
  
  		NAME:- PRATHMESH RAJESH GONDHALI
  		DATE:- 11/10/2022
  
 */
package javacore;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name");
		String Name= sc.nextLine();
		
		System.out.println("Enter your total Marks for all sub");
		double Mark = sc.nextInt();
		
		sc.close();
		double TotalMark=600;
		
		double Percentage = Mark/TotalMark*100;
		
		if(Mark<400)
		{
			System.out.println("SORRY YOU FAILED");
		}
		else
		{
			System.out.println("CONGRATULATION YOU PASSEED");
			
		}
	}

	
}
