import java.util.Arrays;

public class BubbleSort{
	
	// 冒泡排序 
	public static void main(String[] args){
		int[] arr = {18,5,2,6,11,9};
		int[] newArr = bubbleSort(arr);
		System.out.println(Arrays.toString(newArr));
	}
	// 把排序的行为抽象为一个方法 
	// 修饰词  返回值类型 方法名（参数列表）{方法体}
	public static int[] bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}	
		}
		return arr;
	}
}