package guess;
import java.util.Random;
import java.util.Scanner;

public class guessnum {
	public static void main(String []arg){
		Scanner input =new Scanner(System.in);
		Random random=new Random();
		int s=random.nextInt(100)+1;
		System.out.println("��������µ���(1-100):");
		
		for (int i = 0; i < 100; i++){
		
		int num1=input.nextInt();
		
		if (num1>s){
			System.out.println("��µĴ��ˣ�");
			System.out.println("���ٴ�������µ���(1-100):");
		}
		else if (num1<s){
			System.out.println("��µ�С�ˣ�");
			System.out.println("���ٴ�������µ���(1-100):");
			
		}
		
		else{
			System.out.println("��¶��ˣ�");
			System.out.println("game over��");
		}
		}
	}
	
}
