public class TestWork1{
	// ��1��100֮�������ܱ�3�����������ĺ�
	public static void main(String[] args){
		int sum = 3;
		for(int i=1;i<100;i++){
			if(i%3==0){
				sum += i;
			}	
		}
		System.out.println(sum);
		
		
		// ���0-9֮����������ǲ�����5��
		for(int j =1;j<10;j++){
			if(j==5){
				continue;
			}
			System.out.print(j);
		}
		
	}
}