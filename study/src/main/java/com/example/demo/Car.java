package com.example.demo;

public class Car {
    String color; // 색상
	String size;  // 크기
	boolean engineState; // 시동 여부
	
	Car () {
		this.color = "";
		this.size = "";
		this.engineState = false;
		System.out.println("Car Class");
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isEngineState() {
		return engineState;
	}
	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}
	
	public void showOption () {
		System.out.println("size :: " + size +  ", color : " + color + ", enging :: " + engineState);
	}
	
	public void testFn() {
		System.out.println("Car class testFn~");
	}
	

	
}
