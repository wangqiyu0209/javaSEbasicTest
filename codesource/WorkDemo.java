public class WorkDemo{
	public static void main(String[] args){
		String str = "123456789012";
		int c1 = 0;
		int c2 = 0;
		
		for(int i=0 ; i<str.length();i++){
			// ȡ����λ ��charAt()�������
			if(i%2 == 0){
				c1 += str.charAt(i)-'0';
			}
			// ȡż��λ ��charAt()�������
			if(i%2 == 1){
				c2 += str.charAt(i)-'0';
			}
			
		}
		System.out.print("�ַ���������λ�������Ϊ"+c1);
		System.out.println("�ַ�����ż��λ�������Ϊ"+c2);
	}
		
}