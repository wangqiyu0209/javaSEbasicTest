import java.util.Arrays;

public class HolidayHomeWork1{
	public static void main(String[] args){
		int[] a = {1,7,9,11,13,15,17,19};
		int[] b = {2,4,6,8,10};
		int[] c =Arrays.copyOf(a,a.length+b.length); // c�������� ����Ϊa�����b����
		System.arraycopy(b,0,c,8,5);// c�������λ����b����
		Arrays.sort(c); // ����c,����������
	    System.out.print(Arrays.toString(c));

	}
}