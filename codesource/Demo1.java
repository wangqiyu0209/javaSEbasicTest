import java.util.Scanner;

public class Demo1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������������");
        int height = scanner.nextInt();
		System.out.println("���������������");
		int weight = scanner.nextInt();
	    if(height>=178 && weight <= 75){
				System.out.println("��ϲ��¼ȡ");
		}else{
			System.out.println("���ź�����δ��¼ȡ");
		}
	}

}