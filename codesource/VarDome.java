import java.util.Random;

public class VarDome{
	public static void main(String[] args){

		Random random = new Random();
		int a = random.nextInt(91);	
		if(a>=65){
			char b = (char)a;
			System.out.print(b);
		}
		
	}
}