public class TestWork1{
	// 求1到100之间所有能被3整除的整数的和
	public static void main(String[] args){
		int sum = 3;
		for(int i=1;i<100;i++){
			if(i%3==0){
				sum += i;
			}	
		}
		System.out.println(sum);
		
		
		// 输出0-9之间的数，但是不包括5。
		for(int j =1;j<10;j++){
			if(j==5){
				continue;
			}
			System.out.print(j);
		}
		
	}
}