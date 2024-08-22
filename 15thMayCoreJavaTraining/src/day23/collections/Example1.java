package day23.collections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
		//ArrayList ref=new ArrayList();
			//or
		List ref=new ArrayList();
		ref.add("Pune");//Object obj="Pune"; //auto up casting
		// Integer ob=new Integer(123);-->Object obj=ob;//auto upcasting
		ref.add(123);//1st Boxing --> Upcasting ---> Object
		ref.add(null);
		ref.add("Pune");
		System.out.println("List elements are: "+ref);
		System.out.println("Total number of elements in List: "+ref.size());
		
		ref.add(1, "Apple");
		System.out.println("List elements are: "+ref);
		System.out.println("Total number of elements in List: "+ref.size());
		
		//System.out.println("Get the element present in index 2: "+ref.get(2));
		System.out.println("*************Printing one by one List elements using for loop******************");
		for(int i=0;i<ref.size();i++) {
			System.out.println("Get the element present in index "+i+": "+ref.get(i));
		}
		System.out.println("*************Printing one by one List elements using for-each loop******************");
		for(Object obj:ref) {
			System.out.println(obj);
		}
		System.out.println("*****************Update existing element of List*************************");
		ref.set(3, "Gold");
		System.out.println("List elements are: "+ref);
		System.out.println("Total number of elements in List: "+ref.size());
		System.out.println("**********************Add one list elements into another list************************");
		List l2=new ArrayList();
		l2.add("Java");
		l2.add("Selenium");
		System.out.println("L2 List elements are: "+l2);
		System.out.println("L2 Total number of elements in List: "+l2.size());
		
//		l2.addAll(ref);
//		System.out.println("After adding ref, L2 List elements are: "+l2);
//		System.out.println("After adding ref, L2 Total number of elements in List: "+l2.size());
		
		l2.addAll(1,ref);
		System.out.println("After adding ref, L2 List elements are: "+l2);
		System.out.println("After adding ref, L2 Total number of elements in List: "+l2.size());
		
		l2.removeAll(ref);
		System.out.println("After removing ref, L2 List elements are: "+l2);
		System.out.println("After removing ref, L2 Total number of elements in List: "+l2.size());
		
		System.out.println("Index 0 element removed: "+l2.remove(0));
		System.out.println("L2 List elements are: "+l2);
		System.out.println("L2 Total number of elements in List: "+l2.size());
		l2.remove("Selenium");
		System.out.println("L2 List elements are: "+l2);
		System.out.println("L2 Total number of elements in List: "+l2.size());
		
	}
}
/*
List:
 auto indexing
 duplicate allowed
 null allowed
 
 toString() overrided, hence it will print elements present inside the List Object

*/