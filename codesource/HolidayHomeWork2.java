public class HolidayHomeWork2{
	public static void main(String[] args){
		// 水仙花数
		//打印出100-999中的"水仙花数",153是一个"水仙花数",
		//因为152=1的三次方+5的三次方+3的三次方
		for(int i=100 ;i<999;i++){
			int a =i/100; // 百位数的求解方法为数字除以100取整
			int b = (i/10)%10; // 十分位为数字除以10取整后再对10取余
			int c = i%10; // 个位数为数字除以10取余
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.print(i+" ");
			}
		}
		
  }

}