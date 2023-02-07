package com.example.demo;

public class Minseok extends Sonata{
	Minseok() {
		color = "9999";
		size = "8888";
		engineState = true;
		
		System.out.println("Minseok Class");
		
		showOption();
		
		testFn();
	}
	
	public void testFn() {
		super.testFn();
		System.out.println("Minseok class testFn~");
	}
	
	public void test1() {
		
	}
}
