import java.util.Scanner;

public class Demo4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请您输入一个整数");
		int num = sc.nextInt();
		if(num%2==0){
			System.out.println("您输入的是偶数"+num);
		}else{
			System.out.println("您输入的是奇数："+num);
		}
	}
}