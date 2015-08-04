package com.niit.JavaIO;

import java.io.Serializable;

public class Student implements Comparable<Student> , Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7644059550098690219L;
	String Name;
	transient int Id;
	static int student_count =12;
	double Gpa;

	@Override
	public int compareTo(Student o) {
		int result = 0;
		result = this.Name.compareTo(o.Name);		
		return result;
	}

	Student(String Name, int Id, double Gpa) {
		this.Name = Name;
		this.Id = Id;
		this.Gpa = Gpa;
		++student_count ;
	}

	public String toString() {
		return ( '\n' +" Name : " + Name + " Id = " + Id + " Gpa = " + Gpa + "student_count =" + student_count);
	}
}
