import java.util.Arrays;

public class SortDemo{
	// —°‘Ò≈≈–Ú∑®
	public static void main(String[] args){
		int[] arr = {8,2,3,7,1};
		arr = selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] selectionSort(int[] arr){
		for(int i=0;i<arr.length;i++){
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