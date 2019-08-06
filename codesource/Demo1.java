import java.util.Scanner;

public class Demo1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的身高");
        int height = scanner.nextInt();
		System.out.println("请输入的您的体重");
		int weight = scanner.nextInt();
	    if(height>=178 && weight <= 75){
				System.out.println("恭喜被录取");
		}else{
			System.out.println("很遗憾，您未被录取");
		}
	}

}