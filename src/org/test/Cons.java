package org.test;

public class Cons extends Contruct {

	public Cons() {
		super(20);
		System.out.println("Test will pass");
	}
	
	public Cons(int a) {
		System.out.println("ouput"+a);
	}

	public static void main(String[] args) {
		Cons c = new Cons();
		Cons c1 = new Cons(20);
		Single sib = Single.getObject();
		sib.getId();
		sib.getName();
		
	}
	
}
