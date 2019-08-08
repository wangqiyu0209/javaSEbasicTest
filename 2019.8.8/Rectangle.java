package com.neuedu.test1;
/**
 * @author wqy
 * @since 2019/8/8
 * @version 1.0
 * 
 * */
public class Rectangle {

	// ��Ա����
	int length;
	int width;
	
	// ������
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3, 4);
		double area = rectangle.getArea();
		System.out.println(area);
		int per = rectangle.getPer();
		System.out.println(per);
		System.out.println("*********");
		rectangle.showAll();
	}
	// ���췽��
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	//��Ա����
	
	// ����һ��������ķ���
	public double getArea() {	
		return length*width;	
	}
	// ����һ�����ܳ��ķ���
	public int getPer() {
		return 2*(length+width);
	}
	// �ڿ���̨����������ߣ�������ܳ�
	public void showAll() {
		System.out.println("��Ϊ��"+length);
		System.out.println("��Ϊ��"+width);
		System.out.println("���Ϊ��"+length*width);
		System.out.println("�ܳ�Ϊ��"+2*(length+width));
	}
}
