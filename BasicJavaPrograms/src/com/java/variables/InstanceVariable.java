package com.java.variables;

public class InstanceVariable {
	int a;
	void a(){
		a=20;
		System.out.println("Instace variable "+a);
	}
	void b() {
		a=90;
		System.out.println("Instance variable "+a);
	}
	public static void main(String[] args) {
		InstanceVariable iVariable=new InstanceVariable();
		iVariable.a();
		iVariable.b();
	}

}
