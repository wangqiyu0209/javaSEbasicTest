import java.util.*;

public class Demo1{
    public static void main(String[] args){
	
	String str = "ͳ��һ���ַ����ַ����е����е�λ��";
	Scanner sc = new Scanner(System.in);
	System.out.print("������Ҫ���ҵ��ַ���");
	String content = sc.next();
	char first = content.charAt(0);
	// �������� �������ƥ���ַ���λ��
	byte[] pos ={};
	//charAt()���� ͨ���±��õ�String�е�ÿһ���ַ�
	for(int i=0;i<str.length();i++){
		char c = str.charAt(i);
		// ��c��������ַ����Ƚ�
		if(c==first){
			// �������� 
			pos = Arrays.copyOf(pos,pos.length+1);
			pos[pos.length-1] = (byte)i;
		}
	}System.out.print(Arrays.toString(pos));
	
   }
}