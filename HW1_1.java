import java.util.Scanner;

class HW1_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String name;
		int age;
		double weight;
		
		
		System.out.print("이름: ");
		name = s.nextLine();
		
		System.out.print("나이: ");
		age = s.nextInt();
		
		System.out.print("몸무게: ");
		weight = s.nextDouble();
		
		//큰 따옴표 자체를 출력하려면 \" 해야 함. 
		//탭만큼 들여쓰기 하려면 \t
		
		
		System.out.printf("\"나의 이름은 '%s', \n", name);
		System.out.printf("\t나이는 %#x, \n", age);
		System.out.printf("\t\t몸무게는 %10.3f입니다\" \n", weight);
	}
}