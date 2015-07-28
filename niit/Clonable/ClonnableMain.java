package com.niit.Clonable;

public class ClonnableMain {

	public static void main(String[] args) {
		Student ram = new Student("Ram",114,55.0);
		Student ravi = ram;;
		System.out.println(ram);
		ravi.Name="Ravi";
		System.out.println(ram);
		System.out.println(ravi);
		ram.Name = "Ram";
		
		System.out.println(ram);
		
			
		
		LeaderOfClass ramLeader = new LeaderOfClass(ram);
		ramLeader.leaderID=1;
		ramLeader.teacher = "Gopal";
		
		System.out.println("ramLeader="+ramLeader);
		
		LeaderOfClass shankarLeader = (LeaderOfClass)ramLeader.clone();
		
		Student shankar = new Student("Shankar",333,25.6);
		shankarLeader.student = shankar;
		shankarLeader.leaderID =222;
		shankarLeader.teacher="john";
		
		
		ramLeader.leaderID = 99;
		System.out.println("ramLeader =" +ramLeader);
		System.out.println("shankarLeader =" +shankarLeader);
		
				
	}

}
