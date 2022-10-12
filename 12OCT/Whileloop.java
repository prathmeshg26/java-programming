/* QES:- program to demonstarte while loop contiues until entered number is positive
 NAME: PRATHMESH 
 DATE:12/10/22
 * 
 */
package javacore;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num =sc.nextInt();
		sc.close();
		 
		while (num>=0)
		{
			System.out.println("POSITIVE NUMBER:-" +num);
			num++;
			break;
		}
		
		}
		
		
	}


