public class HolidayHomeWork7{
	public static void main(String[] args){
		
		// һ��С���100�߶���������,ÿ����غ�����ԭ�߶ȵ�һ��,�����£�
		//�����ڵ�ʮ�����ʱ,������������?��10�η������?
		  double sum = 100;
		  double height = 100;
		  
	   for(int i =1;i<10;i++){
			height = height/2;
			sum = sum + height*2;
	    }
		System.out.print("��ʮ�����ʱ,������������:"+sum+"��10�η������:"+height);
	}
}