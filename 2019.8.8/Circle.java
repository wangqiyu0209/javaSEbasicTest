package com.neuedu.test;
import java.awt.Point;
/**
 * @author wqy
 * @since 2019/8/7
 * 
 * */
public class Circle {

	//��Ա����
	Point centerPoint;
    int r;
	
	// ���췽��
	public Circle(Point p ,int r) {
		this.r = r;
		this.centerPoint = p;
	}
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(new Point(0,0),10);
		System.out.println(Math.PI*circle.r*circle.r);
		
		Point p1 = new Point(5,0);
		
		if(circle.islnSide(p1)) {
			System.out.println("p1��Բ���ڲ�");
		}else {
			System.out.println("p1����Բ���ڲ�");
		}
		
		Point p2 = new Point(15,0);
		
		if(circle.islnSide(p2)) {
			System.out.println("p2��Բ���ڲ�");
		}else {
			System.out.println("p2����Բ���ڲ�");
		}
		
	}
	
	// ����
	public int getR() {
		return this.r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public Point getCenterPoint() {
		return this.centerPoint;
	}
	public void setCenterPoint(Point p) {
		this.centerPoint = p;
	}
	public boolean islnSide(Point point) {
		double distance = Math.sqrt((point.x-centerPoint.x)*(point.x-centerPoint.x)+(point.y-centerPoint.y)*(point.y-centerPoint.y));
		if(distance>this.r) {
			return false;
		}else {
			return true;
		}
		
	}

}




