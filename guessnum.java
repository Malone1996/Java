package guess;
import java.util.Random;//此处采用util的Random产生随机数，另外还有Math.random产生随机数的方式
import java.util.Scanner;

public class guessnum {
	public static void main(String []arg){
		Scanner input =new Scanner(System.in);
		Random random=new Random();
		int s=random.nextInt(100)+1;
		System.out.println("请输入你猜的数(1-100):");
		int a=1;
		for (int i = 0; i < 100; i++){//加入for循环实现多次输入直至输入结果正确
		
		int num1=input.nextInt();
		
		if (num1>s){
			System.out.println("你猜的大了！");
			System.out.println("请再次输入你猜的数(1-100):");
		}
		else if (num1<s){
			System.out.println("你猜的小了！");
			System.out.println("请再次输入你猜的数(1-100):");
			
		}
		
		else{
			System.out.println("你猜对了！");
			System.out.println("game over！");
			break;
		}
			a=a+1;
		}
		
	}System.out.println("你猜了"+a+"次");
	
}
