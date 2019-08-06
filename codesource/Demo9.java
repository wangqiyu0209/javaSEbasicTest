import java.util.Scanner;

public class Demo9{
	public static void main(String[] args){
		
		/**猴子第一天摘下若干个桃子,当即吃了一半,还不瘾，
		又多吃了一个,第二天早上又将剩下的桃子吃掉一半,又多吃了一个.
		以后每天早上都吃了前一天剩下的一半零一个..
		到第10天早上想再吃时,见只剩下一个桃子了.求第一天共摘了多少.
		*/
		int num = 1;
		for(int i =1;i<10;i++){
			num = (num +i)*2+1/2;
		}
		System.out.println(num);
		
		// 入一个数字，判断是一个奇数还是偶数
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入一个整数");
		int a = sc.nextInt();
		if(a%2==0){
			System.out.println("您输入的"+a+"为偶数");
		}else{
			System.out.println("您输入的"+a+"为奇数");
		}
		
		// 编写程序， 判断一个变量x的值，如果是1，输出x=1，如果是5，输出x=5，
		// 如果是 10，输出x=10,除了以上几个值，都输出x=none
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入一个整数");
		int x = scanner.nextInt();
		if(x==1){
			System.out.println("x="+x);
		}else if(x==5){
			System.out.println("x="+x);
		}else{
			System.out.println("x=none");
		}
		
		// 判断一个数字是否能被5和6同时整除（打印能被5和6整除）
		// 或只能被5整除（打印能被5整除），或只能被6整除，（打印能被6整除）
		// 不能被5或6整除，（打印不能被5或6整除）
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int m = sca.nextInt();
		if(m%5==0&&m%6==0){
			System.out.println(m+"能被5和6同时整除");
		}else if(m%5==0){
			System.out.println(m+"能被5整除");
		}else if(m%6==0){
			System.out.println(m+"能被6整除");
		}else{
			System.out.println(m+"不能被5和6整除");
		}
		
		// 、输入一个0～100的分数，如果不是0～100之间，打印分数无效，
		//根据分数等级打印A,B,C,D,E（知识点：条件语句if elseif）
		int z = 80;
		if(z<=100){
			System.out.println("A");
		}else if(z<90){
			System.out.println("B");
		}else if(z<80){
			System.out.println("C");
		}else if(z<70){
			System.out.println("D");
		}else if(z<60){
			System.out.println("E");
		}else{
			System.out.println("打印分数无效");
		}
		
		
	}
}