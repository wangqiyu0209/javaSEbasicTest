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
		// 测试我们写的排序和系统排序
		int[] arr = new int[31000];
		Random r = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt();
		}
		int[] a = Arrays.copyOf(arr,arr.length);
		int[] b = Arrays.copyOf(arr,arr.length);
		
		long start = System.currentTimeMillis(); // 拿到当前系统的毫秒值
		Arrays.sort(a);
		long end = System.currentTimeMillis();
		System.out.println("系统API所花的时间"+(end-start));
		
		long start2 = System.currentTimeMillis(); // 拿到当前系统的毫秒值
		chooseSort(b);
		long end2 = System.currentTimeMillis();
		System.out.println("选择排序所花的时间"+(end2-start2));
		
	}
	
	//选择排序的方法
	public static int[] chooseSort(int[] b) {
		// 控制趟数
		for(int i=0 ; i<b.length-1 ; i++) {
			// 控制每一趟的次数
			for(int j=i+1 ; j<b.length; j++) {
				// 比较
				if(b[i]>b[j]) {
					// 交换俩个数
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		return b;
	}
}
