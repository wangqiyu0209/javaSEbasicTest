public class Demo6{
	public static void main(String[] args){
		
		// ����1+2+3+��+100�ĺ�
		int i = 1;
		int sum =0;
		while(i<=100){
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		
		// �����1��100�������������
		int a = 1;
		int b = 0;
		while(a<=100){
			if(a%2==1){
				b += a;
			}
			a++;
		}
		System.out.println(b);
		
		
		// ��do while ѭ������д1�ӵ�100
		int c = 1;
		int d = 0;
		do{
			d += c;
			c++;
		}while(c<=100);
		System.out.println(d);
		
		// ��forѭ������д1�ӵ�100
		int k=0;
		for(int j=1;j<=100;j++){
			k += j;
		}
		System.out.println(k); 
		
		// ��forѭ����д��1��100������������ӵĺ� 
		int m = 0;
		for(int n=1;n<=100;n++){
			if(n%2==1){
				m += n;
			}
		}
		System.out.println(m);
		
	}

}