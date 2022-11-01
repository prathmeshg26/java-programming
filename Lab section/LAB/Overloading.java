class Overloading
{
	static void display(int a)
	{
		System.out.println("pincode: "+ a);
	}
		static void display(int a , int b)
	{
		System.out.println("pincode: " + a + " kolashewadi police station: " + b);
	}
		static void display(int a , int b , int c)
	{
		System.out.println("pincode: " + a + " kolashewadi police station: " + b  + "assembly:" +c );
	}
public static void main(String[] args)
{
display(421301);
display(421301, 421302);
display(421301, 421302,421303);
}
}