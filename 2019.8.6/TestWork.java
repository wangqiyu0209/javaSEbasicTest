/**
编写一个程序，计算邮局汇款的汇费。如果汇款金额小于100元，
汇费为一元，如果金额在100元与5000元之间，按1%收取汇费，
如果金额大于5000元，汇费为50元。汇款金额由命令行输入
*/

import java.util.Scanner;

public class TestWork{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的汇款：");
		int sum = sc.nextInt();
		if(sum<100){
			System.out.println("扣完汇费的汇款为："+(sum-1));
		}else if(sum>100&&sum<5000){
			System.out.println("扣完汇费的汇款为："+(sum-sum*0.01));
		}else{
			System.out.println("扣完汇费的汇款为："+(sum-50));
		}
	}
}