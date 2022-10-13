/* QES1:- Student percentage
 * NAME:-PRATHMESH
 * DATE:-13/10/2022
 */
package javacore;
import java.util.Scanner;
class Student_mark {

	static Scanner sc=new Scanner (System.in);

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("ENTER PERCENTAGE:-");
		int marks = sc.nextInt();
		
		switch(marks/10)
		
		{
		case 10:case 9:
		
			System.out.println("YOUR GRADE IS O");
		
		case 8:
		
			System.out.println("YOUR GRADE IS A");
			break;
		
			case 7:
			System.out.println("YOUR GRADE IS B");
			break;
		
			case 6:
			System.out.println("YOUR GRADE IS C");
			break;
		
			default:
			System.out.println("FAILELD.");
			break;
		}
	
}

}


