package 오픈소스과제1;
import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		System.out.println("첫번째 원의 중심과 반지름 입력 : ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		double r1 = s.nextDouble();
		
		System.out.println("두번째 원의 중심과 반지름 입력 : ");
		int a = s.nextInt();
		int b = s.nextInt();
		double r2 = s.nextDouble();
		
		double dist = 0;
		dist = Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
		
		if(dist <= r1+r2)
			System.out.println("두 원은 겹칩니다.");
		else
			System.out.println("두 원은 서로 겹치지 않습니다.");
		
		s.close();

	}

}
