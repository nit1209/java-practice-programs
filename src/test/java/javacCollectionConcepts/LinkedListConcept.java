package javacCollectionConcepts;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListConcept {

	public static void main(String[] args) {
				
				LinkedList<Object> list= new LinkedList<Object>();
				list.add("npm");
				list.add(100);
				list.add(934.456);
				list.add(null);
				list.add('P');
				System.out.println(list);

				//validating
				if(list.contains("npm"))
				{
					System.out.println("\n its present in list");
				}
				else
				{
					System.out.println("\n its not present in list");
				}


				list.addFirst(222);
				list.addLast(333);
				System.out.println(list.getFirst());
				System.out.println(list.getLast());
				System.out.println(list.removeLast());
				//fetch the element present in the index 2
				list.get(2);
				System.out.println("\n after adding of value in index-2:-"+list);

				//know the size of the list 
				System.out.println(list.size());

				//remove the object present in the index 4
				list.remove(4);
				System.out.println("\n after removel of value in index-4:-"+list);

				//print the index of npm
				System.out.println(list.indexOf("npm"));

				//to fetch the element 1 by 1 we using for each loop
				for (Object ob : list) {
					System.out.println(ob);
				}

				//to fetch the element 1 by 1 we using iteratormethod
				Iterator<Object> it=list.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}




			}

		}


