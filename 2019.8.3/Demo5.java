import java.util.Scanner;

public class Demo5{
	public static void main(String[] args){
		
		// ���������ͱ���x��y�����ڿ���̨�����x��y��ֵ�ϴ���Ǹ�����
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ��������");
		int x = sc.nextInt();
		System.out.print("������һ��������");
		int y = sc.nextInt();
		if(x>y){
			System.out.print("�ϴ����Ϊ��"+x);
		}
	}
}