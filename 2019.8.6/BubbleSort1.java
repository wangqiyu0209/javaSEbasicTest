import java.util.*;

public class BubbleSort1{
	public static void main(String[] args){
		int[] arr = {222,2,12,34,1};
		int[] newArr = bubbleSort(arr);
		System.out.println(Arrays.toString(newArr));
	}
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