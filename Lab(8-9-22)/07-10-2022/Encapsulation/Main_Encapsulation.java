/*  
    Question Encapsulation program
 
    name - Prathmesh Rajesh Gondhali
    Date- 7/10/2022
 
 */
package Encapsulation;

public class Main_Encapsulation {

	public static void main(String[] args) {
		 
		Encapsulation n=new Encapsulation();
		
	
		//calling setters method
		n.setName("prathmesh");
		n.setAge(20);
		n.setLocation("Mumbai");
		
		//calling getters method
		System.out.println("Name : " + n.getName());
		System.out.println("Age : " + n.getAge());
		System.out.println("Loction : " + n.getLocation());		

	}

}
