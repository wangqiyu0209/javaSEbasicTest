import java.util.*;

public class HolidayWork1{
	public static void main(String[] args){
		int num = 12314;
		String changedNum = String.valueOf(num);
		// ��String����תΪ StringBuffer
		StringBuffer stringBuffer = new StringBuffer(changedNum);
		//��ת
		StringBuffer stringBuffer2 = stringBuffer.reverse();
		// ��StringBufferתΪint����
		// �Ƚ�stringbufferתΪString
		String str = stringBuffer2.toString();
		// �ٽ�StringתΪint����
		int finalNum = Integer.parseInt(str);
		System.out.print(finalNum);
	}
}