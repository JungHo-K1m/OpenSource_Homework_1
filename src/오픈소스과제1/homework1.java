package ���¼ҽ�����1;
import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		System.out.println("ù��° ���� �߽ɰ� ������ �Է� : ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		double r1 = s.nextDouble();
		
		System.out.println("�ι�° ���� �߽ɰ� ������ �Է� : ");
		int a = s.nextInt();
		int b = s.nextInt();
		double r2 = s.nextDouble();
		
		double dist = 0;
		dist = Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
		
		if(dist <= r1+r2)
			System.out.println("�� ���� ��Ĩ�ϴ�.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʽ��ϴ�.");
		
		s.close();

	}

}
