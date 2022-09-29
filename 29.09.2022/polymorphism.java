package polymorphism;

public class Shape {
	public void area(String Circle)
	{
		System.out.println("Circle");
	
	}
    public void area (String Circle, String Triangle)
    {
    	System.out.println("Circle and Triangle");
    	
    }
    public void area(String Circle, String Triangale,String Rectangle)
    {
    	System.out.println("Circle and Tringale and Rectangle");
    	
    }
    public static void main(String[]args)
    {
    	Shape s =new Shape();
    	s.area("circle");
    	s.area("cricle", "Triangle");
    	s.area("circle", "Trianagle", "Rectangale");
    }
}
