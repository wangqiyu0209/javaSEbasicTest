import java.util.*;

public class Demo11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//��λ 
		int first = num%10;
		// ʮλ
		int sec = num/10%10;
		//��λ
		int thrid = num/100%10;
		// ǧλ 
		int forth = num/1000;
		// ��λ��5
		first = (first+5)%10;
		sec = (sec+5)%10;
		thrid = (thrid+5)%10;
		forth = (forth+5)%10;
		int result = first*1000+thrid*10+sec*100+forth;
		System.out.println(result);
	}
}