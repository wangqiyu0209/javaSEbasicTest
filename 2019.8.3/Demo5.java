import java.util.Scanner;

public class Demo5{
	public static void main(String[] args){
		
		// 有两个整型变量x，y，请在控制台上输出x与y中值较大的那个数。
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int x = sc.nextInt();
		System.out.print("请输入一个整数：");
		int y = sc.nextInt();
		if(x>y){
			System.out.print("较大的数为："+x);
		}
	}
}