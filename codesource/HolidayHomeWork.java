public class HolidayHomeWork{
	public static void main(String[] args){
		
	/**
		//���ѭ����������
	for(int i = 0; i < 5;i++){
		 //�ڲ�ѭ����������
		for(int j = 0;j < 5;j++){
			System.out.print("* ");
		}
			System.out.println();
	  }
	  
	*/
	
	
	/*
	//��ӡ�žų˷���
    
	for(int i=1;i<=9 ;i++){
		for(int j=1; j<=i;j++){
			
			System.out.print(i+"*"+j+"="+i*j+"\t");// \t�ո�
		}
		
		System.out.println();
	}
	
	*/
	
    for (int x = 0;x<11 ;x++ )  //��ȷ����ʮһ��ʮһ�е�������
        {
            if (x>0 && x<10)  //��ӡ���м�յ����
            {
                for (int z=0;z<11 ;z++ )  //��ӡ������
                {
                    if (z==0 |z==10) //��һ�����һ��
                    {
                        System.out.print("* ");  //�����* ��
                    }else if(z>=1 && z<=9){  //�м����
                        System.out.print("  ");//�����  ��
                    }
                    
                }

            }
            else if(x==0 | x==10){  //��һ�к����һ��
                for (int y=0;y<11 ;y++ )
                {
                    System.out.print("* ");//ȫ���������*��
                }
            }
            System.out.println();
        }	
		
  }
}