import java.util.Scanner;

public class Demo4{
	public static void main(String[] args){
		
		/**
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while(num != -1){
			System.out.println("输入一个数：");
			num = scanner.nextInt();
			System.out.print("您输入的数："+num);
		*/
		
		 /** 计算两点之间的距离 （x1-x2）^2+（y1-y2）^2
		int x1 = 1;
		int y1 = 1;
		int x2 = 0;
		int y2 = 1;
		double distance = Math.sqrt(Math.pow(x1-x2),2)+Math.sqrt(Math.pow(y1-y2),2)
		System.out.print(distance); */
		
		// 工资
		System.out.print("请输入您的税前的工资：");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		// 不扣税的工资
		double minStandard = 5000;
		// 扣税
		double finalSalary = salary - minStandard;
		// 五险一金
		double oneMoney = 1000;
		// 补助
		double subSidy = 500;
		// 到手的工资
		double realSalary = 0;
		// 如果小于1500 扣税3%
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