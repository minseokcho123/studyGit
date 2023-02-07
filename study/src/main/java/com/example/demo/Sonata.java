package com.example.demo;

public class Sonata extends Car{
	
	Sonata () {
		color = "123";
		size = "456";
		engineState = true;
		
		System.out.println("Sonata Class");
		
		showOption();
		
		testFn();
	}
	
	public void testFn() {
		super.testFn();
		System.out.println("Sonata class testFn~");
	}
}
