package 오픈소스과제1;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// if-else문
		
				System.out.print("연산>>");
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
						System.out.print("0으로 나눌 수 없습니다!"); 
						s.close(); 
						return; 
						} 
					else 
						ans=n1/n2; 
					} 
				else { 
					System.out.print("사칙연산이 아닙니다."); 
					s.close(); 
					return; 
					} 
				System.out.println(n1+oper+n2+"의 계산결과는"+ans); 
				
				s.close();				
				// switch문
				/*
				Scanner s=new Scanner(System.in); 
				System.out.print("연산>>"); 
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
							System.out.print("0으로 나눌수없다"); 
							s.close(); 
							} 
						ans=n1/n2; 
						break; 
					default: 
						System.out.print("사칙연산이아닙니다."); 
						s.close(); 
						break; 
						} 
				
				System.out.print(n1 + oper + n2 + "의 계산결과는" + ans); 
				
				s.close();
				*/

	}

}
