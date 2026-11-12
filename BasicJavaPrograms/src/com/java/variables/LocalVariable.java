package com.java.variables;

public class LocalVariable {
	void print() {
		int a=20;
		System.out.println("Local Variable "+a);
	}
	public static void main(String[] args) {
		LocalVariable lVariable=new LocalVariable();
		lVariable.print();
	}

}
