package com.pro.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Foo {
	public Foo() {
		m1();
	}

	void m1() {
		System.out.println("Foo class method ");
	}
}

class Bar extends Foo {
	 int x = 5;

	void m1() {
		System.out.println("x value " + x);
	}

}



public class Test {

	public static void main(String[] args) {
		Foo f = new Bar();	
		f.m1();

	}
}
