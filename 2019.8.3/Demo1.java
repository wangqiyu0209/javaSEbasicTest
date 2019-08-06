import java.util.*;

public class Demo1{
    public static void main(String[] args){
	
	String str = "统计一个字符在字符串中的所有的位置";
	Scanner sc = new Scanner(System.in);
	System.out.print("请输入要查找的字符：");
	String content = sc.next();
	char first = content.charAt(0);
	// 创建容器 用来存放匹配字符的位置
	byte[] pos ={};
	//charAt()方法 通过下标拿到String中的每一个字符
	for(int i=0;i<str.length();i++){
		char c = str.charAt(i);
		// 拿c与输入的字符作比较
		if(c==first){
			// 数组扩容 
			pos = Arrays.copyOf(pos,pos.length+1);
			pos[pos.length-1] = (byte)i;
		}
	}System.out.print(Arrays.toString(pos));
	
   }
}