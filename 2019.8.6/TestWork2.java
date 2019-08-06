import java.util.*;

// 由命令行输入一个4位整数，求将该数反转
// 以后的数，如原数为1234，反转后的数位4321
public class TestWork2{
	public static void main(String[] args){
		int num = 1234;
		String changedNum = String.valueOf(num);
		StringBuffer stringBuffer = new StringBuffer(changedNum);
		StringBuffer stringBuffer1 = stringBuffer.reverse();
		String str = stringBuffer1.toString();
		int finalNum = Integer.parseInt(str);
		System.out.println(finalNum);

	}	
}