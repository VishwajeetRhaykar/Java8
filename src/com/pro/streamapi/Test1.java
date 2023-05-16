package com.pro.streamapi;

 abstract class Test2 {

	
	public static void main(String[] args) {
        System.out.println("Hellow");
//        m1(10,20);
	}

	 void m1(int a,int b)
	{
		int c= a+b;
		System.out.println(c);
	}
}

 
 public class Test1 extends Test2
 {
	 public static void main(String [] args)
	 {
		 int b=10;
		 if(b==10)
		 {
			 System.out.println(b);
		
		 }
		 
		 
	 }
 }