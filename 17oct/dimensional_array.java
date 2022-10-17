/* Program : Program for multi dimensional array
 *			NAME : PRATHMESH RAJESH GONDHALI
 * 			DATE: 17-10-22
 */

package javaversion;

import java.util.Scanner;

public class dimensional_array {

	public static void main(String[] args) {

		int i, j, x, y; 
		
		//imp scanner 
		Scanner sc = new Scanner(System.in);
		
		//Taking input for number of rows form user 
		System.out.print("Enter the no of rows :");
		x = sc.nextInt();
		
		//Taking input for number of column form user 
		System.out.print("Enter the no of column : ");
		y = sc.nextInt();
		
		int array[][] = new int[x][y];
		
		System.out.println("Enter the no of array :");
		
		//Used for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		
		
		System.out.println("Element of array is ");
		
		//used for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				//printing values of i j
				System.out.print(array[i][j]+" ");
			}
			
			System.out.println();
		}


	}

}

