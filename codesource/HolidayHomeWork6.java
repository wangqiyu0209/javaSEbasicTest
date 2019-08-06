public class HolidayHomeWork6{
	public static void main(String[] args){
		// 一百元钱买百鸡,公鸡每只五元整，每只母鸡是三元；
		// 小鸡因小价钱低，三只小鸡是一元；公鸡母鸡和小鸡，请你算出各是几
		for(int a=0;a<=100;a++){
			for(int b=0;b<=100;b++){
				for(int c=0;c<=100;c++){
					if(((a*5+b*3+c/3)==100)&&((a+b+c)==100)){
						System.out.println("公鸡："+a+"只");
						System.out.println("母鸡："+b+"只");
						System.out.println("小鸡："+c+"只");
					}
					
				}
				
			}
		}
	}
}