public class WorkDemo{
	public static void main(String[] args){
		String str = "123456789012";
		int c1 = 0;
		int c2 = 0;
		
		for(int i=0 ; i<str.length();i++){
			// 取奇数位 用charAt()方法求和
			if(i%2 == 0){
				c1 += str.charAt(i)-'0';
			}
			// 取偶数位 用charAt()方法求和
			if(i%2 == 1){
				c2 += str.charAt(i)-'0';
			}
			
		}
		System.out.print("字符串的奇数位数字相加为"+c1);
		System.out.println("字符串的偶数位数字相加为"+c2);
	}
		
}