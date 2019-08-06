import java.util.*;

public class Demo{
	public static void main(String[] args){
		int num = 7654321;
		String changedNum = String.valueOf(num);
		StringBuffer stringBuffer = new StringBuffer(changedNum);
		StringBuffer stringBuffer1 = stringBuffer.reverse();
		String str = stringBuffer1.toString();
		int fianlNum = Integer.parseInt(str);
		System.out.print(fianlNum);
		
	}
}