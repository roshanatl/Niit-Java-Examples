package com.niit.comparableInterface;

import java.util.Set;
import java.util.TreeSet;

public class ComparableMain {

	public static void main(String[] args) {
		  Set<Student> studentSet = new TreeSet<>();
	        studentSet.add(new Student("Atul",101,129945));
	        studentSet.add(new Student("Vtul",031,126545));
	        studentSet.add(new Student("Mtul",401,12845));
	        studentSet.add(new Student("Rtul",501,12745));
	        studentSet.add(new Student("Utul",701,12645));
	        System.out.println(studentSet);
	       
	}

}
