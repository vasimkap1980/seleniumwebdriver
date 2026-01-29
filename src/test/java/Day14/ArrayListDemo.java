package Day14;

import java.util.ArrayList;
import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		ArrayList myList=new ArrayList();
		
		myList.add(100);
		myList.add(10.5);
		myList.add("welcome");
		myList.add(null);
		myList.add(100);
		myList.add("vasim");
		
		System.out.println("size of the arraylist:"+ myList.size());
		
		System.out.println(myList);
		
		myList.remove(5);
		
		System.out.println(myList);
		
		myList.add(2,"vasim");
		
		System.out.println(myList);
		myList.set(2, "salu");
		System.out.println(myList);
		System.out.println(myList.get(4));
		
//		for(int i=0;i<myList.size();i++)
//		{
//			System.out.println(myList.get(i));
//		}
		
		
		for(Object x:myList)
		{
			System.out.println(x);
		}
		
		
		Iterator <Object>it=myList.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
				
		}
		
		ArrayList myList2=new ArrayList();
		myList2.add(10.5);
		myList2.add("welcome");
		
		myList.removeAll(myList2);
		
		System.out.println("after removing "+  myList);
	}

}
