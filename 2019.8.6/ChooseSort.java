import java.util.*;

public class ChooseSort{
	
	// 选择排序法
	public static void main(String[] args){
		int[]arr = {2,5,12,22,4};
		for(int i=0;i<arr.length-1;i++){ // 控制趟数
			for(int j=i+1;j<arr.length;j++){ // 控制每一趟的次数
				if(arr[i]>arr[j]){ // 比较
					int temp = arr[i]; // 利用第三方变量交换两个数
					arr[i] = arr[j];
					arr[j] = temp;
				}			
			}			
		}
		System.out.println(Arrays.toString(arr));
	}
}