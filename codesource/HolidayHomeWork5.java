public class HolidayHomeWork5{
	public static void main(String[] args){
		for(int i=2;i<1000;i++){
			int sum=1;
			for(int j=2;j<i/2;j++){
				if(i%j==0){
					sum+=j;
					if(i==sum){
						System.out.println("ÍêÊýÎª£º"+i);
					}
				}
			}
		}
	}
}