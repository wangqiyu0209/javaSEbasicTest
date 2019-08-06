
public class TestWork3{
	// 编写一个程序，求整数n的阶乘，例如5的阶乘是1x2x3x4x5 
	public static void main(String[] args){
		int sum = 1;
		for(int i= 1;i<6;i++){
			sum *= i;
		}
		System.out.println(sum);
	}
}