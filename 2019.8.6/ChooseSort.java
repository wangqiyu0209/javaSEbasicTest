import java.util.*;

public class ChooseSort{
	
	// ѡ������
	public static void main(String[] args){
		int[]arr = {2,5,12,22,4};
		for(int i=0;i<arr.length-1;i++){ // ��������
			for(int j=i+1;j<arr.length;j++){ // ����ÿһ�˵Ĵ���
				if(arr[i]>arr[j]){ // �Ƚ�
					int temp = arr[i]; // ���õ�������������������
					arr[i] = arr[j];
					arr[j] = temp;
				}			
			}			
		}
		System.out.println(Arrays.toString(arr));
	}
}