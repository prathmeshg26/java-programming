/* Hashset class implements the set interface,it uses hash table to store the element 
 * and contain only  unique element.
 * NAME:-PRATHMESH RAJESH GONDHALI
 */
package javaversion;
//import HashSet
import java.util.HashSet;
//import Iterator
import java.util.Iterator;
public class Hashset_Example {

	public static void main(String[] args) {
		HashSet<Integer> obj1 = new HashSet<>();
		
		//Using add() method
		obj1.add(5);
		obj1.add(10);
		obj1.add(15);
		
		System.out.println("Hashset is: "+obj1);
		
		//Calling iterator() method
		Iterator<Integer> obj2 = obj1.iterator();
		
		System.out.println("Hashsrt using Iterator: ");
		while(obj2.hasNext())
		//Hashset is method to check next value in the array
		{
			System.out.print(obj2.next());
			System.out.print(",");
	    }
		
	}
}
