/* QES3:- Program to print  sum of 10 Natural Numbers using while loop.
 * 		NAME:-PRATHMESH
 * 		DATE:-13/10/2022
 */
package javacore;

class Natural_Numbers {

	public static void main(String[] args) {
		
		int num = 10;int sum=0,P=1;
		
		while(P<=num)
			{
			sum=sum+P;
			P++;
			
			}
		System.out.println("sum of 1-10 natural numbers:-" +sum);

	}

}
