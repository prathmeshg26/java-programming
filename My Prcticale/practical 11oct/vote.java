/* Qes1.Test whether the person is eligible to give vote using (if-else)
 * 
 * 
 * 			NAME:-PRATHMESH RAJESH GONDHALI
 * 			DATE:-11/10/2022
 */
package javacore;

import java.util.Scanner;

class vote {

	public static void main(String[] args) {
		
		int age;
		System.out.print("Enter Your age");
		var r=new Scanner(System.in);
		age=r.nextInt();
		
		if(age>=18)
		{
			System.out.print("Eligible for Votes");
			
		}
		else
		{
			System.out.print("Not Eligible for Votes");
		}
	
	}

}
