import java.util.*;

// ������������һ��4λ�������󽫸�����ת
// �Ժ��������ԭ��Ϊ1234����ת�����λ4321
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