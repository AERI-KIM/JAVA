import java.util.Scanner;

class HW3_1{
	public static void main(String [] args){
		double a, b, result = 0;
		String operator;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(ex. 7 + 4): ");
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
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(1);//System.exit(������ ����) �޼ҵ带 ȣ���ϸ� ���α׷��� �����.
			}
			result = a/b;
		}
		else if(operator.equals("%")){
			if(b==0){
				System.out.println("0���� ���� �������� ���� �� �����ϴ�.");
				System.exit(2);
			}
			result = a%b;
		}
		else{
			System.out.println("[�Է¿���] +, -, *, /, % ���길 �����մϴ�. ");
			System.exit(3);
		}
		
		if(result%1==0) System.out.println((int)result);
		else System.out.printf("%.2f\n", result);
			
		
	}
}