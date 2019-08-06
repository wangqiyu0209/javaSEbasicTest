/**
给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12
@auther:wangqiyu
@date:2019/8/5
*/

import java.util.Scanner;

public class Demo3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int sum = sc.nextInt();
		int a = sum%10;
		int b = (sum/10)%10;
		int c = sum/100;
		 System.out.print((sum%10)+(sum/10)%10+(sum/100));
		}
}