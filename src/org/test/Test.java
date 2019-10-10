package org.test;

public class Test {


		
		int width;
		int height;
		int length;
		int volume;
		void volume(int height,int length,int width) {
			volume = length*height*width;
		}

		
	}

class para extends Test{
	
	public static void main(String[] args) {
		Test obj= new Test();
		obj.height=1;
		obj.width=5;
		obj.length=5;
		obj.volume(3,2, 1);
		System.out.println(obj.volume);
		System.out.println(obj.height);
		
		
		
		
		
	}

}
