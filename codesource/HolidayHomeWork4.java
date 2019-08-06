import java.util.Scanner;

public class HolidayHomeWork4{
	public static void main(String[] args){
		// 输入一个正整数，将该数的各位左右反转输出
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int a = scanner.nextInt();
		int b = 0;
		while(a>0){
			b=b*10+a%10;
			a/=10;
		} 
		System.out.println(b);
	}
}