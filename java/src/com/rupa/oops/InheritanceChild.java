package com.rupa.oops;

public class InheritanceChild extends InheritanceParent{

	public static void main(String[] args) {
    
		System.out.println("My name is Sriharsha");
		fatherName("Lakshmi narayana murthy","Seshagirirao");
		InheritanceParent ip = new InheritanceParent();
		System.out.println(ip.motherName("Padmini devi", "Sathyavathi"));
		System.out.println("My name is Rupadevi");
		fatherName("Sreenivasulu","veeraiah");
		System.out.println(ip.motherName("Someswari", "Narayanamma"));
	}

}
