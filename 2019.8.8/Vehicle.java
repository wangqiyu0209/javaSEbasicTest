package com.neuedu.test1;

public class Vehicle {

	// 汽车品牌
	String brand;

	// 颜色
	String color;
	
	// 速度
	double speed;
	
	public static void main(String[] args) {
		 
		Vehicle vehicle = new Vehicle( "benz ",  "black ", 0);
		vehicle.run();
		
	}

	public Vehicle(String brand, String color, double speed) {
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	public void run() {
		System.out.println("汽车的品牌为："+brand+" "+"汽车的颜色为："+color);
	}
}
