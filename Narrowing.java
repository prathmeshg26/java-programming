package javaversion;
import java.util.Scanner;
public class Narrowing {

	public static void main(String[] args) {
		double d=100.04;
		long l=(long) d;
		int i=(int)l;
		Scanner sc=new Scanner(System.in);
		System.out.println(" double value"+d);
		System.out.println(" long value"+l);
		System.out.println(" int value"+i);
		int a=sc.nextInt();
	}

}
