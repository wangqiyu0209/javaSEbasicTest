import java.util.Scanner;

public class Demo4{
	public static void main(String[] args){
		
		/**
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while(num != -1){
			System.out.println("����һ������");
			num = scanner.nextInt();
			System.out.print("�����������"+num);
		*/
		
		 /** ��������֮��ľ��� ��x1-x2��^2+��y1-y2��^2
		int x1 = 1;
		int y1 = 1;
		int x2 = 0;
		int y2 = 1;
		double distance = Math.sqrt(Math.pow(x1-x2),2)+Math.sqrt(Math.pow(y1-y2),2)
		System.out.print(distance); */
		
		// ����
		System.out.print("����������˰ǰ�Ĺ��ʣ�");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		// ����˰�Ĺ���
		double minStandard = 5000;
		// ��˰
		double finalSalary = salary - minStandard;
		// ����һ��
		double oneMoney = 1000;
		// ����
		double subSidy = 500;
		// ���ֵĹ���
		double realSalary = 0;
		// ���С��1500 ��˰3%
		//1500-4500 10%
		//4500-9000 20%
		//9000-35000 25%
		//35000-55000 30%	
		if(finalSalary <= 1500 ){
			realSalary = finalSalary*0.97 + minStandard - oneMoney + subSidy;
		}else if(finalSalary > 1500 && finalSalary <=4500){
			realSalary = finalSalary*0.90 + minStandard - oneMoney + subSidy;
		}else if(finalSalary > 4500 && finalSalary <=9000){
			realSalary = finalSalary*0.80 + minStandard - oneMoney + subSidy;
		}else if(finalSalary > 9000 && finalSalary <=35000){
			realSalary = finalSalary*0.75 + minStandard - oneMoney + subSidy;
		}else if(finalSalary > 35000 && finalSalary <=55000){
			realSalary = finalSalary*0.7 + minStandard - oneMoney + subSidy;
		}else{
			realSalary = minStandard - oneMoney - subSidy;
		}
		System.out.println(realSalary);
				
	}
}