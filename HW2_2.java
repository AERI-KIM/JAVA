import java.util.Scanner;

class HW2_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a, abs;
		
		System.out.print("정수: ");
		a = s.nextInt();
		
		//1. 부호 확인 및 절댓값 구하기 : 최상위 비트가 1이면 음수, 아니라면 양수(0 포함)
		abs = (a& 0x80000000)==0?a:-a; //절댓값 구하기 
		System.out.printf("\"%d는(은) %s입니다. 이 수의 절댓값은 %d이고,\n", a, (a>>31==0)?"양수":"음수", abs);
		
		
		//아래 방법 중 어느 걸 써도 무방. 
		/* 방법 1
		if((a & 0b1000_0000_0000_0000_0000_0000_0000_0000)==0b1000_0000_0000_0000_0000_0000_0000_0000)
			System.out.println("음수");//관계 연산(==)의 순위가 비트 AND(&)의 순위보다 높기때문에 비트 AND를 먼저 수행하도록 명시적으로 괄호 넣기.
		else
			System.out.println("양수");
		//접두사 0b는 이진수를 나타냄
		*/
		/* 방법 2: 방법 1이 너무 길기 때문에 아래와 같은 방법도 가능		
		if((a & 0b1000_0000_0000_0000_0000_0000_0000_0000)==0)
			System.out.println("양수");
		else
			System.out.println("음수");
		*/
		/* 방법 3: 방법 2도 이진수로 표현해서 너무 길기 때문에 16진수로 표현
		if((a & 0x80000000)==0)
			System.out.println("양수");
		else
			System.out.println("음수");
		*/
		/*방법 4: 시프트 연산 사용도 가능!
		
		if(a >> 31==0)
			System.out.println("양수");
		else //a가 만약 음수였다면 a>>31는 결과가 (모든 비트가 1이 되어)-1임.
			System.out.println("음수");
		*/
		
		
		System.out.printf("\t절댓값을 4로 나눈 몫은 %d이고,", abs>>2);
		
		System.out.printf("\n\t\t나머지는 %d입니다.\"\n", abs&3);//나머지는 마지막 두 비트: 마지막 두 비트만 알아내면 됨. 
		//abs&0b11도 무방
	}
}