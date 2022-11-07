/* If the class implements the Runnable interface
 * the thread can be run by passing an instance 
 * of the class to a Thread object's constructor
 * and then calling the thread's start() method.
 */
package Thread;

public class Main_1implementsRunnable {

	public static void main(String[] args) {
		
		Main m=new Main();
		Thread t=new Thread(m);
		t.start();
		System.out.println("This code is outside the thread");
	}
	public void run()
	{
		System.out.println("This code is running in the thread");

	}


}
