public class HolidayHomeWork2{
	public static void main(String[] args){
		// ˮ�ɻ���
		//��ӡ��100-999�е�"ˮ�ɻ���",153��һ��"ˮ�ɻ���",
		//��Ϊ152=1�����η�+5�����η�+3�����η�
		for(int i=100 ;i<999;i++){
			int a =i/100; // ��λ������ⷽ��Ϊ���ֳ���100ȡ��
			int b = (i/10)%10; // ʮ��λΪ���ֳ���10ȡ�����ٶ�10ȡ��
			int c = i%10; // ��λ��Ϊ���ֳ���10ȡ��
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.print(i+" ");
			}
		}
		
  }

}