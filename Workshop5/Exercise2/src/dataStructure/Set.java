/**
 * 
 */
package dataStructure;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author acb131
 *
 */
public class Set extends List {
	
	static ArrayList<Integer> j=new ArrayList<Integer>();
	
	/*
	 * converts the List into an ArrayList to make it easier to handle.
	 */
	static ArrayList<Integer> array(List c)
	{
		j.add(c.getHead());
		array(c.getTail());
		return j;
	}
	
	public static boolean equals(List a, List b)
	{
		//creates the ArrayList using above method
		ArrayList<Integer> aa=new ArrayList<Integer>(array(a));
		ArrayList<Integer> ba=new ArrayList<Integer>(array(b));
	
		//sorts the lists
		Collections.sort(aa);
		Collections.sort(ba);
				
		//Initialises ArrayLists for below methods
		ArrayList<Integer> aanoneduplicates=new ArrayList<Integer>();
		ArrayList<Integer> banoneduplicates=new ArrayList<Integer>();
		
		
		//creates new ArrayList for List A without duplicates
		int n=0;
		while(n<=aa.size()-1)
		{
			if(aa.get(n)==aa.get(n+1))
			{
				aanoneduplicates.add(aa.get(n));
			}
			n++;
		}
		aanoneduplicates.add(aa.get(aa.size())); //adds last integer of ArrayList, which will be skipped in above code
		
		
		//creates new ArrayList for List B without duplicates
		int m = 0;
		while(m<=ba.size()-1)
		{
			if(ba.get(m)==ba.get(m+1))
			{
				banoneduplicates.add(ba.get(m));
			}
			m++;
		}
		banoneduplicates.add(ba.get(ba.size())); //adds last integer of ArrayList, which will be skipped in above code
		
		int o=0;
		boolean thesame = true;
		while(thesame==true)
		{	
			while(o<=aanoneduplicates.size())
				{
					if(aanoneduplicates.get(o)==banoneduplicates.get(o))
					{
						thesame=true;
					}
					else
					{
						thesame=false;
					}
					o++;
				}						
		}
		
		if(thesame==true)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
