package com.neuedu.test1;

public class Vehicle {

	// ����Ʒ��
	String brand;

	// ��ɫ
	String color;
	
	// �ٶ�
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
		System.out.println("������Ʒ��Ϊ��"+brand+" "+"��������ɫΪ��"+color);
	}
}
