package com.rupa.oops;

public class InheritanceParent extends InheritanceSuper{
	
	protected static void fatherName(String fname, String gfname) {
		System.out.println("My father's name is:" + fname);
		//System.out.println("My grandfather's name is:" + super.grandFather(gfname));
	}
	
	public String motherName(String mname, String gname) {
		mname = "My mother's name is:" + mname;
		System.out.println("My grandmother's name is:" + super.grandMother(gname));
		return mname;
	}
}
