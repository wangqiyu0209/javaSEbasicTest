import java.util.*;

public class Demo8{
	
	// ����һ���ɼ�a��ʹ��switch�ṹ���a�ĵȼ���
	// A��90-100��B��80-89��C��70-79��D��60-69��E��0~59
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�����������ĳɼ���");
		int a = sc.nextInt();
		String level;
		switch(a/10){
			case 10://level = "A";
			//break;
			case 9:level = "A";
			break;
			case 8:level = "B";
			break;
			case 7:level = "C";
			break;
			case 6:level = "D";
			break;
			default:level = "E";
			break;
		}
		System.out.println(level);
	}
}