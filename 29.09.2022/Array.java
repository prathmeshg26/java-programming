package Array;

public class Array {

	public static void main(String[] args) {
		AndroidPhone[] obj = new  AndroidPhone[3] ;  

		obj[0] = new AndroidPhone(8,"Black");  
		obj[1] = new AndroidPhone(6,"Red");  
		obj[2] = new AndroidPhone(4,"Yellow");  

		System.out.println("oppo:");  
		obj[0].display();  
		System.out.println("Samsung:");  
		obj[1].display();  
		System.out.println("lava:");  
		obj[2].display();  
		}  
		}  

		class AndroidPhone
		{  
		int RAM;  
		String color;  

		AndroidPhone(int ram, String c)  
		{  
		RAM = ram;  
		color = c;  
		}  
		public void display()  
		{  
		System.out.print("RAM Size = "+RAM + "  " + " Color of AndroidPhone = "+color);  
		System.out.println();  
		}  
	}
	


