/* Program: write a program for Addition, Subtraction, Multiplication, Divsion of two matrix
 * 			NAME:-PRATHMESH
 * 			Date : 18-10-2022
 */
package javaversion;
import java.util.Scanner; 
public class Addition_div_multi_sub {

	public static void main(String[] args) {
		int x, y, i, j;
		Scanner sc = new Scanner(System.in);
		
		// first matrix row
		System.out.print("Enter first matrix row: ");
		x = sc.nextInt();
		
		//first matrix column
		System.out.print("Enter first matrix column: ");
		y = sc.nextInt();
		
		int array1[][]=new int[x][y];
		
		System.out.println();
		System.out.println("Enter the number of first matrix: ");
		
		//using for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				array1[i][j]=sc.nextInt();
			}
		}
		
		
		//Print element of first matrix
		System.out.println("Element of first matrix is : ");
		
		//Using forloop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				System.out.print(array1[i][j]+" ");
			} System.out.println();
			
			
		}
	
		int array2[][]=new int[x][y];
		
		System.out.println();
		System.out.println("Enter the number of Second matrix : ");
		
		//using forloop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				array2[i][j]=sc.nextInt();
			}
		}
		
		//Printing element of second matrix
		System.out.println("Element of second matrix is : ");
		
		//using forloop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				System.out.print(array2[i][j]+" ");
			} System.out.println();
			
			
		}
		//System.out.println();
		
		
		int array3[][]=new int[x][y];
		
			//Add of two num
			System.out.println();
			System.out.println("Addition of two matrix is : ");
			
			//Using for loop
			for(i=0;i<x;i++)	
			{
				
				for(j=0;j<y;j++)	
				{
					array3[i][j]=array1[i][j]+array2[i][j];  
					System.out.print(array3[i][j]+" "); 
				}
				 System.out.println();
			}
			
			
		//For Division
			int array4[][]=new int[x][y];
				
				//Addition of two numbers
				System.out.println();
				System.out.println("Division of two matrix is : ");
				
				
				//Using for loop
				for(i=0;i<x;i++)	
				{
					
					for(j=0;j<y;j++)	
					{
						array3[i][j]=array1[i][j]/array2[i][j];  
						System.out.print(array3[i][j]+" "); 
					}
					 System.out.println();
				}	
	
			//For Multiplication
				int array5[][]=new int[x][y];
					System.out.println();
					System.out.println("Multiplication of two matrix is : ");
					
					//Using for loop
					for(i=0;i<x;i++)	
					{
						
						for(j=0;j<y;j++)	
						{
							array3[i][j]=array1[i][j]*array2[i][j];  
							System.out.print(array3[i][j]+" "); 
						}
						 System.out.println();
					}	
		
				//For Subtraction
					int array6[][]=new int[x][y];
						System.out.println();
						System.out.println("Subtraction of two matrix is : ");
						
						//Using for loop
						for(i=0;i<x;i++)	
						{
							
							for(j=0;j<y;j++)	
							{
								array3[i][j]=array1[i][j]-array2[i][j];  
								System.out.print(array3[i][j]+" "); 
							}
							 System.out.println();
						}	
	}
	
	
	}

	


