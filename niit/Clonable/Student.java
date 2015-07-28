package com.niit.Clonable;

public class Student implements Comparable<Student> , Cloneable {
	String Name;
	int Id;
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
	}
	
	public Object clone() { 
		try { 
		// call clone in Object. 
		return super.clone(); 
		} catch(CloneNotSupportedException e) { 
		System.out.println(" Student Cloning not allowed."); 
		return this; 
		} 
		} 

	public String toString() {
		return ( '\n' +" Name : " + Name + " Id = " + Id + " Gpa = " + Gpa );
	}
}
