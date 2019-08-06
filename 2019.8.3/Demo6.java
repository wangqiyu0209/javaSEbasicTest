public class Demo6{
	public static void main(String[] args){
		
		// 计算1+2+3+…+100的和
		int i = 1;
		int sum =0;
		while(i<=100){
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		
		// 计算从1到100的所有奇数相加
		int a = 1;
		int b = 0;
		while(a<=100){
			if(a%2==1){
				b += a;
			}
			a++;
		}
		System.out.println(b);
		
		
		// 用do while 循环来改写1加到100
		int c = 1;
		int d = 0;
		do{
			d += c;
			c++;
		}while(c<=100);
		System.out.println(d);
		
		// 用for循环来改写1加到100
		int k=0;
		for(int j=1;j<=100;j++){
			k += j;
		}
		System.out.println(k); 
		
		// 用for循环改写从1到100的所有奇数相加的和 
		int m = 0;
		for(int n=1;n<=100;n++){
			if(n%2==1){
				m += n;
			}
		}
		System.out.println(m);
		
	}

}