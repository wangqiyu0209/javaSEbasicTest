public class HolidayHomeWork3{
	public static void main(String[] args){
		
		// 求整数1~100的累加值，但要求跳过所有个位为3的数。（使用for循环实现）
	    int sum = 0;
		for(int i = 1;i<=100;i++){	
		

			
			if(i%10==3){
				continue;// 跳出当前循环，执行下一次循环
			}
			sum = sum + i;
		}
		System.out.println(sum);
  }
	
}