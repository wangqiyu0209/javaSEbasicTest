/**
��дһ�����򣬼����ʾֻ��Ļ�ѡ���������С��100Ԫ��
���ΪһԪ����������100Ԫ��5000Ԫ֮�䣬��1%��ȡ��ѣ�
���������5000Ԫ�����Ϊ50Ԫ�������������������
*/

import java.util.Scanner;

public class TestWork{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���������Ļ�");
		int sum = sc.nextInt();
		if(sum<100){
			System.out.println("�����ѵĻ��Ϊ��"+(sum-1));
		}else if(sum>100&&sum<5000){
			System.out.println("�����ѵĻ��Ϊ��"+(sum-sum*0.01));
		}else{
			System.out.println("�����ѵĻ��Ϊ��"+(sum-50));
		}
	}
}