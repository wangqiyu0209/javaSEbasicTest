public class HolidayHomeWork6{
	public static void main(String[] args){
		// һ��ԪǮ��ټ�,����ÿֻ��Ԫ����ÿֻĸ������Ԫ��
		// С����С��Ǯ�ͣ���ֻС����һԪ������ĸ����С��������������Ǽ�
		for(int a=0;a<=100;a++){
			for(int b=0;b<=100;b++){
				for(int c=0;c<=100;c++){
					if(((a*5+b*3+c/3)==100)&&((a+b+c)==100)){
						System.out.println("������"+a+"ֻ");
						System.out.println("ĸ����"+b+"ֻ");
						System.out.println("С����"+c+"ֻ");
					}
					
				}
				
			}
		}
	}
}