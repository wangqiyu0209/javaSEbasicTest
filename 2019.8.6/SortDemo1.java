import java.util.Arrays;

public class SortDemo1{
	public static void main(String[] args){
		int[] arr = {1,2,34,5,67,9};
		arr = selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static int [] selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	
}