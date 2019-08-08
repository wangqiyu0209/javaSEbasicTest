package com.neuedu.test1;
/**
 * @author wqy
 * @since 2019/8/8
 * @version 1.0
 * 
 * */
public class Rectangle {

	// 成员变量
	int length;
	int width;
	
	// 主方法
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3, 4);
		double area = rectangle.getArea();
		System.out.println(area);
		int per = rectangle.getPer();
		System.out.println(per);
		System.out.println("*********");
		rectangle.showAll();
	}
	// 构造方法
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	//成员方法
	
	// 定义一个求面积的方法
	public double getArea() {	
		return length*width;	
	}
	// 定义一个求周长的方法
	public int getPer() {
		return 2*(length+width);
	}
	// 在控制台输出长，宽，高，面积，周长
	public void showAll() {
		System.out.println("长为："+length);
		System.out.println("宽为："+width);
		System.out.println("面积为："+length*width);
		System.out.println("周长为："+2*(length+width));
	}
}
