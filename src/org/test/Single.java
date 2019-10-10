package org.test;

public class Single {
	private static Single sl = null;
	private Single() {
	
	}

	public static Single getObject() {
		if(sl==null) {
		 sl = new Single();
		}
		return sl;
		
	}
	
	public void getId() {
		System.out.println("Test");
	}
	
	public void getName() {
		System.out.println("vel");

	}
	
	public static void main(String[] args) {
		Single sib = Single.getObject();
		sib.getId();
		sib.getName();
	}
}
