import java.util.Scanner;

public class Demo9{
	public static void main(String[] args){
		
		/**���ӵ�һ��ժ�����ɸ�����,��������һ��,����񫣬
		�ֶ����һ��,�ڶ��������ֽ�ʣ�µ����ӳԵ�һ��,�ֶ����һ��.
		�Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��..
		����10���������ٳ�ʱ,��ֻʣ��һ��������.���һ�칲ժ�˶���.
		*/
		int num = 1;
		for(int i =1;i<10;i++){
			num = (num +i)*2+1/2;
		}
		System.out.println(num);
		
		// ��һ�����֣��ж���һ����������ż��
		Scanner sc = new Scanner(System.in);
		System.out.println("��������һ������");
		int a = sc.nextInt();
		if(a%2==0){
			System.out.println("�������"+a+"Ϊż��");
		}else{
			System.out.println("�������"+a+"Ϊ����");
		}
		
		// ��д���� �ж�һ������x��ֵ�������1�����x=1�������5�����x=5��
		// ����� 10�����x=10,�������ϼ���ֵ�������x=none
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������һ������");
		int x = scanner.nextInt();
		if(x==1){
			System.out.println("x="+x);
		}else if(x==5){
			System.out.println("x="+x);
		}else{
			System.out.println("x=none");
		}
		
		// �ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6������
		// ��ֻ�ܱ�5��������ӡ�ܱ�5����������ֻ�ܱ�6����������ӡ�ܱ�6������
		// ���ܱ�5��6����������ӡ���ܱ�5��6������
		Scanner sca = new Scanner(System.in);
		System.out.println("������һ������");
		int m = sca.nextInt();
		if(m%5==0&&m%6==0){
			System.out.println(m+"�ܱ�5��6ͬʱ����");
		}else if(m%5==0){
			System.out.println(m+"�ܱ�5����");
		}else if(m%6==0){
			System.out.println(m+"�ܱ�6����");
		}else{
			System.out.println(m+"���ܱ�5��6����");
		}
		
		// ������һ��0��100�ķ������������0��100֮�䣬��ӡ������Ч��
		//���ݷ����ȼ���ӡA,B,C,D,E��֪ʶ�㣺�������if elseif��
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
			System.out.println("��ӡ������Ч");
		}
		
		
	}
}