public class WorkDemo1{
	public static void main(String[] args){
		String str = "692116851128";
		int  c1 =0;
		int  c2 =0;
		int  cc =0 ;
		for(int i=0;i<str.length();i++){
			if(i%2 ==0){
				c1 += str.charAt(i)-'0';
			}
			if(i%2 ==1){
				c2 += str.charAt(i)-'0';
			}
		}
		System.out.println("该数奇数位和"+c1);
		System.out.println("该数偶数位和"+c2);
		System.out.println(c1+c2*3);
		System.out.println((c1+c2*3)%10);
		System.out.println(10-(c1+c2*3)%10);
		System.out.println((10-(c1+c2*3)%10)%10);
		
	}
}