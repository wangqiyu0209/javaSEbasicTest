package com.neuedu.test1;
/**
 * @author wqy
 * @version 1.0
 * @since 2019/8/8
 * 测试类
 * */
public class TestCircle {

	public static void main(String[] args) {
		Point p = new Point(1,1);
		Circle circle = new Circle(p,1);
		
		// 测试点是否在圆内还是圆外
		Point point = new Point(1,2);
		boolean contains = circle.contains(point);
		System.out.println(contains);
	}
}
