/**
@auther:wangqiyu
@date:2019/8/1
*/
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
	    int number = getSum(2,6);
		System.out.print(number);
		int numberMinus = getMinus(14,2);
		System.out.println(numberMinus);
		int numMul = getMul(5,6);
		System.out.println(numMul);
		int numDivsion = getDivision(8,2);
		System.out.println(numDivsion);
		// ����̨�ӷ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int num = sc.nextInt();
		System.out.println("��������һ������");
		int nums = sc.nextInt();
		System.out.println("�����������Ϊ��"+(num+nums));
		// ����̨����
		Scanner scMinus = new Scanner(System.in);
		System.out.println("������һ��������");
		int numDemo = scMinus.nextInt();
		System.out.println("��������һ��������");
		int numDemos = scMinus.nextInt();
		System.out.println("�����������Ϊ��"+(numDemo-numDemos));
	}
	// ����һ���ӷ��ķ���
	public static int getSum(int n1,int n2){
             int result = n1+n2;
             return result ;			 
	}
	// ����һ�������ķ���
	public static int getMinus(int n3,int n4){
		int resultMinus = n3-n4;
		return resultMinus;
    }
     // ����һ���˷��ķ���
    public static int getMul(int n5,int n6){
		int resultMul = n5*n6;
		return resultMul;
	}	 
	// ����һ�������ķ���
	public static int getDivision(int n7 ,int n8){
		int resultDivision = n7/n8;
		return resultDivision;
	}
}