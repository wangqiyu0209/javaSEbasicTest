import java.util.Arrays;

public class BubbleSort{
	
	// ð������ 
	public static void main(String[] args){
		int[] arr = {18,5,2,6,11,9};
		int[] newArr = bubbleSort(arr);
		System.out.println(Arrays.toString(newArr));
	}
	// ���������Ϊ����Ϊһ������ 
	// ���δ�  ����ֵ���� �������������б�{������}
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