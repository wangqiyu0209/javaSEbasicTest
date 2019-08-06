import java.util.*;
// ц╟ещеепР
public class SortDemo2{
	public static void main(String[] args){
		int[] arr = {2,4,5,12,31,9};
		arr = bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] bubbleSort(int[] arr){
		for(int i=0;i<arr.length;i++ ){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
				
			}
			
		}
		return arr;
	}
}