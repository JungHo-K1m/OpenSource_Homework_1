package ���¼ҽ�����1;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// if-else��
		
				System.out.print("����>>");
				Scanner s=new Scanner(System.in); 
				int n1=s.nextInt(); 
				String oper=s.next(); 
				int n2=s.nextInt(); 
				int ans=0; 
				
				if(oper.equals("+")) 
					ans=n1+n2; 
				else if(oper.equals("-")) 
					ans=n1-n2; 
				else if(oper.equals("*")) 
					ans=n1*n2; 
				else if(oper.equals("/")) {
					if(n2==0) { 
						System.out.print("0���� ���� �� �����ϴ�!"); 
						s.close(); 
						return; 
						} 
					else 
						ans=n1/n2; 
					} 
				else { 
					System.out.print("��Ģ������ �ƴմϴ�."); 
					s.close(); 
					return; 
					} 
				System.out.println(n1+oper+n2+"�� �������"+ans); 
				
				s.close();				
				// switch��
				/*
				Scanner s=new Scanner(System.in); 
				System.out.print("����>>"); 
				int n1=s.nextInt(); 
				String oper=s.next(); 
				int n2=s.nextInt(); 
				int ans=0; 
				switch(oper) { 
					case "+": 
						ans=n1+n2; 
						break; 
					case "-": 
						ans=n1-n2; 
						break;
					case "*": 
						ans=n1*n2;
						break;
					case "/": 
						if(n2==0) { 
							System.out.print("0���� ����������"); 
							s.close(); 
							} 
						ans=n1/n2; 
						break; 
					default: 
						System.out.print("��Ģ�����̾ƴմϴ�."); 
						s.close(); 
						break; 
						} 
				
				System.out.print(n1 + oper + n2 + "�� �������" + ans); 
				
				s.close();
				*/

	}

}
