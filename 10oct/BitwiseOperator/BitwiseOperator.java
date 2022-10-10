package javacore;
import java.util.Scanner;
public class BitwiseOperator {

	public static void main(String[] args) {
		
		
			//Creating Scanner class object to take the input from the user
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter first number: ");
					int num1=sc.nextInt();
				
					System.out.println("Enter second number: ");
					int num2=sc.nextInt();
					sc.close();
					
					 // Bitwise AND operator
							System.out.println("num1&num2="+(num1 & num2));
							// 1 0 0 1 = 5
					        // 1 0 0 0 = 6
							//--------
							// 1 0 0 0 = 6
							
					//Bitwise OR operator
							System.out.println("num1|num2="+(num1 | num2));
							// 1 0 0 1 = 5
					        // 1 0 0 0 = 6
							//--------
							// 1 0 0 1 = 6
							
					//Bitwise XOR operator
							System.out.println("num1^num2="+(num1 ^ num2));
							// 1 0 0 1 = 5
					        // 1 0 0 0 = 6
							//--------
							// 0 0 0 1 = 1 
		
	}

}
