import java.util.Scanner;

class HW3_1{
	public static void main(String [] args){
		double a, b, result = 0;
		String operator;
		Scanner s = new Scanner(System.in);
		
		System.out.print("식을 입력하세요(ex. 7 + 4): ");
		a = s.nextDouble();
		operator = s.next();
		b = s.nextDouble();
		
		
		if(operator.equals("+")){
			result = a+b;
		}
		else if(operator.equals("-")){
			result = a-b;
		}
		else if(operator.equals("*")){
			result = a*b;
		}
		else if(operator.equals("/")){
			if(b==0){
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(1);//System.exit(임의의 정수) 메소드를 호출하면 프로그램이 종료됨.
			}
			result = a/b;
		}
		else if(operator.equals("%")){
			if(b==0){
				System.out.println("0으로 나눈 나머지는 구할 수 없습니다.");
				System.exit(2);
			}
			result = a%b;
		}
		else{
			System.out.println("[입력오류] +, -, *, /, % 연산만 지원합니다. ");
			System.exit(3);
		}
		
		if(result%1==0) System.out.println((int)result);
		else System.out.printf("%.2f\n", result);
			
		
	}
}