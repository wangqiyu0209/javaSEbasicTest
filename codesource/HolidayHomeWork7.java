public class HolidayHomeWork7{
	public static void main(String[] args){
		
		// 一个小球从100高度自由落下,每次落地后反跳回原高度的一半,再落下，
		//求它在第十次落地时,共经过多少米?第10次反弹多高?
		  double sum = 100;
		  double height = 100;
		  
	   for(int i =1;i<10;i++){
			height = height/2;
			sum = sum + height*2;
	    }
		System.out.print("第十次落地时,共经过多少米:"+sum+"第10次反弹多高:"+height);
	}
}