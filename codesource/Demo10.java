import java.util.Scanner;

public class Demo10{
	public static void main(String[] args){
		
		// ����һ����ݣ��ж��������Ƿ�������
		Scanner sc = new Scanner (System.in);
		System.out.println("��������һ����ݣ�");
		int year = sc.nextInt();
		if(year%4==0&&year%100==0||year%100==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}	
		
		
		//������������x,y,z���������������С�������
		Scanner num = new Scanner(System.in);
		System.out.println("������������������");
		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();
		
	}
 
}