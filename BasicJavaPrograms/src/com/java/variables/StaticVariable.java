package com.java.variables;

public class StaticVariable {
	static int age;
	public static void main(String[] args) {
		StaticVariable sv=new StaticVariable();
		StaticVariable sv1=new StaticVariable();
		sv.age=90;
		sv1.age=92;
		StaticVariable.age=900;
		System.out.println(sv.age);
		System.out.println(sv1.age);
		
	}

}
