/* Qes 1:-Print any multiplication table using for loop
 * 
 * 
 * 		NAME:-PRATHMESH RAJESH GONDHALI
 * 		DATE:-11/10/2022
 */
package javacore;

public class multiplication {

	public static void main(String[] args) {
		
java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int x = sc.nextInt();
			
		for(int i=1;i<=10;i++)	{
		System.out.println(x*i);
			
		}
		
	}

}
