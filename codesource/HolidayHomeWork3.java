public class HolidayHomeWork3{
	public static void main(String[] args){
		
		// ������1~100���ۼ�ֵ����Ҫ���������и�λΪ3��������ʹ��forѭ��ʵ�֣�
	    int sum = 0;
		for(int i = 1;i<=100;i++){	
		

			
			if(i%10==3){
				continue;// ������ǰѭ����ִ����һ��ѭ��
			}
			sum = sum + i;
		}
		System.out.println(sum);
  }
	
}