package com.neuedu.test;
/**
 * @author wqy
 * @since 2019/8/7
 * @version 1.0
 * */
public class Point {
	
	int x;
	int y;
	
	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.x = 2;
		p1.y = 2;
		Point p2 = new Point();
		p2.x = 4;
		p2.y = 4;
		
		double result = p1.getDistance(p2);
		System.out.println(result);
	}
	
	//计算两点之间距离的方法
	public double getDistance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
    


}
