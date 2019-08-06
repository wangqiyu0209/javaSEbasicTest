import java.util.Arrays;

public class HolidayHomeWork1{
	public static void main(String[] args){
		int[] a = {1,7,9,11,13,15,17,19};
		int[] b = {2,4,6,8,10};
		int[] c =Arrays.copyOf(a,a.length+b.length); // c数组扩容 长度为a数组加b数组
		System.arraycopy(b,0,c,8,5);// c数组后五位复制b数组
		Arrays.sort(c); // 数组c,按升序排列
	    System.out.print(Arrays.toString(c));

	}
}