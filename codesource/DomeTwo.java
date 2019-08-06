import java.util.*;

public class DomeTwo{
	public static void main(String[] args){
		int age1 = 22;
		int age2 = 22;
		int age3 = age1+age2;
		System.out.print(age3);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("----请输入");
		int r = scanner.nextInt();
		System.out.print("他的十六进制数："+Integer.toHexString(19));
		int t = scanner.nextInt();
		System.out.print("他的八进制数："+Integer.toOctalString(19));
		
		
		}
}