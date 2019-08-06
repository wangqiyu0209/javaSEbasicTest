/**
@auther:wangqiyu
@date:2019/8/1
*/
import java.util.Scanner;

public class Demo{
	public static void main(String[] args){
		
		/** 数据类型转换
		char a = (char)48;
		char b = '中';
		int c = b;
		System.out.println(c);
		*/
		
		// y=x^2-2x+4
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入x");
		int input = scanner.nextInt();
		int x = input;
		int y = x*x-2*x+4;
		System.out.println("y:"+y);
	}

	
}