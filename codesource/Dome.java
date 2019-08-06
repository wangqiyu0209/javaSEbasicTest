import java.util.*;

public class Dome{
	public static void main(String[] args){
	//接受控制台输入的信息
	Scanner scanner = new Scanner(System.in);
	System.out.print("请输入一个整数：");
	int n = scanner.nextInt();
	int m = (int)Math.pow(n,2);
	System.out.print("这个数的平方："+m);
	
	}
	
}