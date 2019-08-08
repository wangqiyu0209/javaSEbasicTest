package com.neuedu.test;
import java.util.Arrays;
import java.util.Random;
/**
 * @author wqy
 * @since 2019/8/6
 * @version 1.0
 * */

public class Test2 {
	public static void main(String[] args) {
		// ��������д�������ϵͳ����
		int[] arr = new int[31000];
		Random r = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt();
		}
		int[] a = Arrays.copyOf(arr,arr.length);
		int[] b = Arrays.copyOf(arr,arr.length);
		
		long start = System.currentTimeMillis(); // �õ���ǰϵͳ�ĺ���ֵ
		Arrays.sort(a);
		long end = System.currentTimeMillis();
		System.out.println("ϵͳAPI������ʱ��"+(end-start));
		
		long start2 = System.currentTimeMillis(); // �õ���ǰϵͳ�ĺ���ֵ
		chooseSort(b);
		long end2 = System.currentTimeMillis();
		System.out.println("ѡ������������ʱ��"+(end2-start2));
		
	}
	
	//ѡ������ķ���
	public static int[] chooseSort(int[] b) {
		// ��������
		for(int i=0 ; i<b.length-1 ; i++) {
			// ����ÿһ�˵Ĵ���
			for(int j=i+1 ; j<b.length; j++) {
				// �Ƚ�
				if(b[i]>b[j]) {
					// ����������
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		return b;
	}
}
