package com.stackroute.exetwo;

class Member {

	String name;
	int age;
	double salary;
	
	
}

public class MemberVariable { 
   
	 Member m = new Member(); 
	 
	 Member func ( String str, int n, double d)
	 {
		 m.name = str;
		 m.age = n;
		 m.salary = d;
		  
		 return m;
	 }
	
}
