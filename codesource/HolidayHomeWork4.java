import java.util.Scanner;

public class HolidayHomeWork4{
	public static void main(String[] args){
		// ����һ�����������������ĸ�λ���ҷ�ת���
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ������");
		int a = scanner.nextInt();
		int b = 0;
		while(a>0){
			b=b*10+a%10;
			a/=10;
		} 
		System.out.println(b);
	}
}