import java.util.*;

public class HolidayWork1{
	public static void main(String[] args){
		int num = 12314;
		String changedNum = String.valueOf(num);
		// 将String类型转为 StringBuffer
		StringBuffer stringBuffer = new StringBuffer(changedNum);
		//翻转
		StringBuffer stringBuffer2 = stringBuffer.reverse();
		// 将StringBuffer转为int类型
		// 先将stringbuffer转为String
		String str = stringBuffer2.toString();
		// 再将String转为int类型
		int finalNum = Integer.parseInt(str);
		System.out.print(finalNum);
	}
}