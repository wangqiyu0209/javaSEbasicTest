
public class Demo5{
	//692116851128 ����Щ�����������λ�ĺ�
	public static void main(String[] args){
		String str = "692116851128";
		int num = 0;
		// ����charAt();
		for(int i = 0;i<str.length();i++){
			//ȡ����λ
			if(i%2 == 0){
				num += str.charAt(i) - '0'; // ���ַ�0֮�������num���Ƕ�Ӧ���ַ�����֮�ͣ����������ַ�ת��Ϊʮ����֮��
			}
		}
		System.out.println("�����ͣ�"+num);
	}
}