/*creating linkedHashset from arrayList
 * NAME:-PRATHMESH RAJESH GONDHALI
 */
package javaversion;
//import ArrayList
import java.util.ArrayList;
//import LinkHashSet
import java.util.LinkedHashSet;
public class LinkedHashSet_Example2 {

	public static void main(String[] args) {
		ArrayList<Integer> obj1 = new ArrayList<>();
		
		//Using add() method
		obj1.add(5);
		obj1.add(10);
		obj1.add(15);
		
		System.out.println("Array list is: "+obj1);
		
		//creating hashset from an arrayList
		
		LinkedHashSet<Integer> obj2 = new LinkedHashSet<>(obj1);
		
		System.out.println("Linkedhashset is: "+obj2);

	}

}
