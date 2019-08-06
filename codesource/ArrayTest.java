import java.util.*;

public class ArrayTest{
	public static void main(String[] args){
		
		/**
		
		// ��һ�ִ�������ķ�ʽ
		byte[] nums = {1,2,6,7,9};
		// �ڶ��ִ�������ķ�ʽ
		byte[] nums2 = new byte[5];
		//�����ִ�������ķ�ʽ
		byte[] nums3 = new byte[]{
			1,4,5,6,7
		}
		
		for(int i = 0; i<nums.length;i++){
			System.out.print(nums[i]);
		}
		
		*/
		
		
		/**
		// ����Ϊ������������   ���ʼֵΪnull
		byte[] byte1 = {1,5,7,9,11};
		byte[] byte2 = new byte[byte1.length];
		for(int i = 0;i<byte1.length;i++){
			byte2[i] = byte1[i];
		}
		System.out.println("byte1�ĵ�һλ��"+byte1[0]);
		System.out.println("byte2�ĵ�һλ��"+byte2[0]);
		byte1[0] = 100;
		System.out.println("byte1�ĵ�һλ��"+byte1[0]);//byte1�ĵ�һλ����100
		System.out.println("byte2�ĵ�һλ��"+byte2[0]);
		
		// ���� Arrays.toString(); ���һ������
		System.out.print(Arrays.toString(byte1));
		
		*/
		
		/**
		
		//Դ����...�ֶ�����(forѭ����չ����)
		byte[] sourceArray = {1,4,2,5,6};
		byte[] newArray = new byte[sourceArray.length+1];
		for(int i = 0;i<sourceArray.length;i++){
			newArray[i] = sourceArray[i];
		}
		newArray[newArray.length-1]=100;
		System.out.println(Arrays.toString(newArray));
		
		*/
		
		
		/**
		
		//jdk�ṩ���������ݵ�API��java api�ṩ�ķ�����for����ѭ��ʵ�����鿽����Ч��Ҫ�ߡ�
		//System.arraycopy(src,srcPos,dest,destPos,length);
		byte[] sourceArray = {1,4,2,5,6};
		byte[] newArray = new byte[sourceArray.length];
		System.arraycopy(sourceArray,0,newArray,0,5);
		System.out.println(Arrays.toString(newArray));
		
		*/
		
		/**
		
		// Arrays.copy(src , length);��jdk1.6�ṩ�ķ���
		byte[]sourceArray = {1,2,3,4,6,8,10};
		byte[]newArray = Arrays.copy(sourceArray,3)
		System.out.print(Arrays.toString(newArray));
		
		*/
		
		// ��������� 
		// Դ����
		byte[] sourceArray = {1,2,3,6,7,9};
		byte[] newArray = Arrays.copyOf(sourceArray,sourceArray.length+1);
		newArray[newArray.length-1] = 100;
		System.out.print(Arrays.toString(newArray));
		
	}
}