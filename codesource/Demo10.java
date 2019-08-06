import java.util.Scanner;

public class Demo10{
	public static void main(String[] args){
		
		// 输入一个年份，判断这个年份是否是闰年
		Scanner sc = new Scanner (System.in);
		System.out.println("请您输入一个年份：");
		int year = sc.nextInt();
		if(year%4==0&&year%100==0||year%100==0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}	
		
		
		//输入三个整数x,y,z，请把这三个数由小到大输出
		Scanner num = new Scanner(System.in);
		System.out.println("请您输入三个整数：");
		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();
		
	}
 
}