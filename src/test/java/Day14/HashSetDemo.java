package Day14;

import static org.testng.Assert.assertListContainsObject;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		HashSet mySet=new HashSet();
		
		mySet.add(100);
		mySet.add(10.25);
		mySet.add("welcome");
		mySet.add(null);
		mySet.add(100);
		
		System.out.println(mySet.size());
		
		mySet.remove(100);
		System.out.println("after removed: "+ mySet);
		
		//inseration not possible 
		
		//Access specific element not possible 
		
		ArrayList al=new ArrayList(mySet);
		System.out.println(al.get(2));
	
		//enhance for loop
		
		for(Object x:mySet)
		{
			System.out.println(x);
		}

	}

}
