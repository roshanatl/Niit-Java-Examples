package com.niit.comparableInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class ComparableMain {

	public static void main(String[] args) {
		  List<Student> studentSet = new LinkedList<>();
	        studentSet.add(new Student("Atul",101,129945));
	        studentSet.add(new Student("Vtul",031,126545));
	        studentSet.add(new Student("Mtul",401,12845));
	        studentSet.add(new Student("Rtul",501,12745));
	        studentSet.add(new Student("Utul",701,12645));
	        System.out.println(studentSet);
	        
	       /* Queue<String> queue=new  LinkedList<String>();  
	        queue.add("Amit");  
	        queue.add("Vijay");  
	        queue.add("Karan");  
	        queue.add("Jai");  
	        queue.add("Rahul");  
	          
	        System.out.println("head:"+queue.element());  
	        System.out.println("head:"+queue.peek());  
	          
	        System.out.println("iterating the queue elements:");  
	        Iterator<String> itr=queue.iterator();  
	        while(itr.hasNext()){  
	        System.out.println(itr.next());  
	        }  
	          
	        queue.remove();  
	        queue.poll();  
	          
	        System.out.println("after removing two elements:");  
	        Iterator<String> itr2=queue.iterator();  
	        while(itr2.hasNext()){  
	        System.out.println(itr2.next());  
	       
	}*/
	        
	        StudentComparator comp = new StudentComparator();
	        Collections.sort(studentSet, comp);
	        System.out.println("================================   ");
	        
	        System.out.println(studentSet);
	        
	        

}
}