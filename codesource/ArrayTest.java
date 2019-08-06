import java.util.*;

public class ArrayTest{
	public static void main(String[] args){
		
		/**
		
		// 第一种创建数组的方式
		byte[] nums = {1,2,6,7,9};
		// 第二种创建数组的方式
		byte[] nums2 = new byte[5];
		//第三种创建数组的方式
		byte[] nums3 = new byte[]{
			1,4,5,6,7
		}
		
		for(int i = 0; i<nums.length;i++){
			System.out.print(nums[i]);
		}
		
		*/
		
		
		/**
		// 数组为引用数据类型   其初始值为null
		byte[] byte1 = {1,5,7,9,11};
		byte[] byte2 = new byte[byte1.length];
		for(int i = 0;i<byte1.length;i++){
			byte2[i] = byte1[i];
		}
		System.out.println("byte1的第一位："+byte1[0]);
		System.out.println("byte2的第一位："+byte2[0]);
		byte1[0] = 100;
		System.out.println("byte1的第一位："+byte1[0]);//byte1的第一位换成100
		System.out.println("byte2的第一位："+byte2[0]);
		
		// 方法 Arrays.toString(); 输出一个数组
		System.out.print(Arrays.toString(byte1));
		
		*/
		
		/**
		
		//源数组...手动扩容(for循环扩展数组)
		byte[] sourceArray = {1,4,2,5,6};
		byte[] newArray = new byte[sourceArray.length+1];
		for(int i = 0;i<sourceArray.length;i++){
			newArray[i] = sourceArray[i];
		}
		newArray[newArray.length-1]=100;
		System.out.println(Arrays.toString(newArray));
		
		*/
		
		
		/**
		
		//jdk提供了数组扩容的API，java api提供的方法比for（）循环实现数组拷贝的效率要高。
		//System.arraycopy(src,srcPos,dest,destPos,length);
		byte[] sourceArray = {1,4,2,5,6};
		byte[] newArray = new byte[sourceArray.length];
		System.arraycopy(sourceArray,0,newArray,0,5);
		System.out.println(Arrays.toString(newArray));
		
		*/
		
		/**
		
		// Arrays.copy(src , length);是jdk1.6提供的方法
		byte[]sourceArray = {1,2,3,4,6,8,10};
		byte[]newArray = Arrays.copy(sourceArray,3)
		System.out.print(Arrays.toString(newArray));
		
		*/
		
		// 数组的扩容 
		// 源数组
		byte[] sourceArray = {1,2,3,6,7,9};
		byte[] newArray = Arrays.copyOf(sourceArray,sourceArray.length+1);
		newArray[newArray.length-1] = 100;
		System.out.print(Arrays.toString(newArray));
		
	}
}