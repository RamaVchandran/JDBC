package org.test;

public class Sample {
	
	public static void main(String[] args) {
		
		
		String s="welcome to java class";
		String[] name = s.split(" ");
		
		for (int i = name.length-1; i >= 0; i--) {
			
			System.out.print(name[i]);
			
		}
	//System.out.println(name[0]);
	}

}
