/**
����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12
@auther:wangqiyu
@date:2019/8/5
*/

import java.util.Scanner;

public class Demo3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ��������");
		int sum = sc.nextInt();
		int a = sum%10;
		int b = (sum/10)%10;
		int c = sum/100;
		 System.out.print((sum%10)+(sum/10)%10+(sum/100));
		}
}