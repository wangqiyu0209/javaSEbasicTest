import java.util.Scanner;

public class Demo4{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		while(num != -1){
			System.out.print("输入一个数：");
			int num = scanner.nextInt();
			System.out.print("您输入的数："+num);
		}		
	}
}