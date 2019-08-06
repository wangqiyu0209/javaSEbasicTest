import java.util.*;

public class BubbleSort2{
	public static void main(String[] args){
		int[] arr = {1,6,2,3,9,4,5,7,8};
		int[] newArr = bubbleSort(arr);
		System.out.println(Arrays.toString(newArr));
	}
	public static int[] bubbleSort(int[] arr){
		for(int i =0 ; i<arr.length-1;i++){
			for(int j=0; j<arr.length-1-i;j++){
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