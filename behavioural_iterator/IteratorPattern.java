package behavioural_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorPattern 
{
	public static void main(String args[])
	{
		System.out.println("Using ArrayList");
		ArrayList<String> countryList=new ArrayList<>();
		countryList.add("India");
		countryList.add("US");
		countryList.add("Japan");
		countryList.add("France");
		
		Iterator<String> iterator1=countryList.iterator();
		while(iterator1.hasNext())
		{
			String str=iterator1.next();
			System.out.println(str);
		}
		
		System.out.println();
		System.out.println("Using HashSet");
		Set<String> countrySet=new HashSet<>();
		countrySet.add("India");
		countrySet.add("US");
		countrySet.add("Japan");
		countrySet.add("France");
		
		Iterator<String> iterator2=countryList.iterator();
		while(iterator2.hasNext())
		{
			String str=iterator2.next();
			System.out.println(str);
		}
	}
}
