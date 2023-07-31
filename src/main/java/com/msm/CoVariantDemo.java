package com.msm;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {

	public Number test() throws IOException {

		System.out.println("This is Parent class method.");
		return 10;
	}
	
	public Number test2() throws IOException {

		System.out.println("This is Parent class method.");
		return 10;
	}
}

class Child extends Parent {

	@Override
	public Integer test() throws FileNotFoundException, NullPointerException, ClassCastException, ArrayIndexOutOfBoundsException {

		System.out.println("This is Child class method.");
		return 10;
	}
	
	public Integer test1() throws FileNotFoundException, NullPointerException, ClassCastException, ArrayIndexOutOfBoundsException {

		System.out.println("This is Child class method.");
		return 10;
	}
}

public class CoVariantDemo {

	public static void main(String[] args) throws IOException {

		Parent p = new Child();
		p.test();
		p.test2();
		
		// Below statment will give error. Because Parent don't have visibility of child class method.
		//p.test1();
		
		Child c = new Child();
		c.test2();
	}
}
