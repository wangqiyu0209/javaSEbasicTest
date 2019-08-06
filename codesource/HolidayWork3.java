import java.util.*;

public class HolidayWork3{
	public static void main(String[] args){
		int a = 12345678;
		String b = String.valueOf(a);
		StringBuffer stringBuffer = new StringBuffer(b);
		StringBuffer stringBuffer2 = stringBuffer.reverse();
		String str = stringBuffer2.toString();
		int c = Integer.parseInt(str);
		System.out.print(c);
	}
}