package com.niit.comparableInterface;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student  arg0, Student arg1) {
		
		int result = 0;
		result = ((Student)arg0).Name.compareTo(((Student)arg1).Name);		
		return result;
		
	}

}
