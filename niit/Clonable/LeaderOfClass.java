package com.niit.Clonable;

public class LeaderOfClass implements Cloneable {
	Student student;
	String teacher;
	int leaderID;
	
	LeaderOfClass(Student student)
	{
		this.student = student;
	}
	
	public LeaderOfClass clone() { 
		LeaderOfClass cloned=null;
		try { 
		 cloned = (LeaderOfClass)super.clone();		 
		 cloned.student=(Student)this.student.clone();  
		} catch(CloneNotSupportedException e) { 
		System.out.println("Cloning  leader not allowed."); 
		
		} 
		
		return cloned; 
		} 
	
	
	
	public String toString() {
		return ( '\n' +" Student  : " + this.student + " Leader ID = " + this.leaderID + " Teacher  = " + this.teacher );
	}

}
