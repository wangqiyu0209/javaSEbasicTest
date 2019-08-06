
public class Demo5{
	//692116851128 求这些数字里的奇数位的和
	public static void main(String[] args){
		String str = "692116851128";
		int num = 0;
		// 方法charAt();
		for(int i = 0;i<str.length();i++){
			//取奇数位
			if(i%2 == 0){
				num += str.charAt(i) - '0'; // 减字符0之后，输出的num才是对应的字符的数之和，而不会是字符转换为十进制之和
			}
		}
		System.out.println("奇数和："+num);
	}
}