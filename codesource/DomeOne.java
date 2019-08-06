import java.util.*;

public class DomeOne{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("输入牛郎织女之间的距离");
		double s = scanner.nextDouble();
		System.out.print("输入一只喜鹊的长度");
		double x = scanner.nextDouble();
		double y=s/x;
		System.out.print("一共多少只喜鹊："+y);
	}
}