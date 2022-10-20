
/* Qes:-2 Write a program to enter even number in array and print in ascending order
 * Name:-Prathmesh Gondhali
 * Date:-19oct/2022
 */
package javaversion;
//improting Arrays
import java.util.Arrays;
//import Scanner
import java.util.Scanner;

public class EvenAscending_order {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int a=sc.nextInt();
		int array[]=new int[a];

		System.out.println("Enter elements:");
		//using for loop
		for(int i=0;i<a;i++)
		{
			array[i]=sc.nextInt();
		}
		//sorting even number in ascending order
		Arrays.sort(array);
		//print even numbers in ascending order
		System.out.print("Ascending Even numbers are:[");
		//using for loop
		for(int j=0;j<a;j++)
		{
			if(array[j] % 2==0 )//condition for even number
			{
				System.out.print(array[j]+" ");
			}
			//out.println();
		}
		System.out.print("]");


	}

}
