public class HolidayHomeWork{
	public static void main(String[] args){
		
	/**
		//外层循环控制行数
	for(int i = 0; i < 5;i++){
		 //内层循环控制列数
		for(int j = 0;j < 5;j++){
			System.out.print("* ");
		}
			System.out.println();
	  }
	  
	*/
	
	
	/*
	//打印九九乘法表
    
	for(int i=1;i<=9 ;i++){
		for(int j=1; j<=i;j++){
			
			System.out.print(i+"*"+j+"="+i*j+"\t");// \t空格
		}
		
		System.out.println();
	}
	
	*/
	
    for (int x = 0;x<11 ;x++ )  //先确定是十一行十一列的正方形
        {
            if (x>0 && x<10)  //打印出中间空的情况
            {
                for (int z=0;z<11 ;z++ )  //打印竖的列
                {
                    if (z==0 |z==10) //第一和最后一列
                    {
                        System.out.print("* ");  //输出“* ”
                    }else if(z>=1 && z<=9){  //中间九列
                        System.out.print("  ");//输出“  ”
                    }
                    
                }

            }
            else if(x==0 | x==10){  //第一行和最后一行
                for (int y=0;y<11 ;y++ )
                {
                    System.out.print("* ");//全部都输出“*”
                }
            }
            System.out.println();
        }	
		
  }
}