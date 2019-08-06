/**
@auther:wangqiyu
@date:2019/8/1
*/
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
	    int number = getSum(2,6);
		System.out.print(number);
		int numberMinus = getMinus(14,2);
		System.out.println(numberMinus);
		int numMul = getMul(5,6);
		System.out.println(numMul);
		int numDivsion = getDivision(8,2);
		System.out.println(numDivsion);
		// 控制台加法
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = sc.nextInt();
		System.out.println("请再输入一个整数");
		int nums = sc.nextInt();
		System.out.println("这两个数相加为："+(num+nums));
		// 控制台减法
		Scanner scMinus = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int numDemo = scMinus.nextInt();
		System.out.println("请再输入一个整数：");
		int numDemos = scMinus.nextInt();
		System.out.println("这俩个数相减为："+(numDemo-numDemos));
	}
	// 定义一个加法的方法
	public static int getSum(int n1,int n2){
             int result = n1+n2;
             return result ;			 
	}
	// 定义一个减法的方法
	public static int getMinus(int n3,int n4){
		int resultMinus = n3-n4;
		return resultMinus;
    }
     // 定义一个乘法的方法
    public static int getMul(int n5,int n6){
		int resultMul = n5*n6;
		return resultMul;
	}	 
	// 定义一个除法的方法
	public static int getDivision(int n7 ,int n8){
		int resultDivision = n7/n8;
		return resultDivision;
	}
}