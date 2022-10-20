/*Qes:-1 Write a program to AscendingDescending_order
 * Name:prathmesh
 * date:20/10/22
 */
package javaversion;
//import Arrays
import java.util.Arrays;
//import Collection
import java.util.Collections;
//import Scannere
import java.util.Scanner;
public class AscendingDescending_order {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array"); 
		int a=sc.nextInt();
		//use Integer
		Integer array[]=new Integer[a];
		
		
		System.out.println("Enter elements:");
		//using for loop
		for(int i=0;i<a;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//print original array
		System.out.println("original array "+Arrays.toString(array));
		
		//sort the array in ascending order 
	   	 Arrays.sort(array);
		System.out.println("Array in Ascending oder:"+Arrays.toString(array));
			
		//sort the array in descending order
		Arrays.sort(array,Collections.reverseOrder());
		System.out.print("Arrays in Descending order:"+Arrays.toString(array));
		
	}

	}


