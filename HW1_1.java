import java.util.Scanner;

class HW1_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String name;
		int age;
		double weight;
		
		
		System.out.print("�̸�: ");
		name = s.nextLine();
		
		System.out.print("����: ");
		age = s.nextInt();
		
		System.out.print("������: ");
		weight = s.nextDouble();
		
		//ū ����ǥ ��ü�� ����Ϸ��� \" �ؾ� ��. 
		//�Ǹ�ŭ �鿩���� �Ϸ��� \t
		
		
		System.out.printf("\"���� �̸��� '%s', \n", name);
		System.out.printf("\t���̴� %#x, \n", age);
		System.out.printf("\t\t�����Դ� %10.3f�Դϴ�\" \n", weight);
	}
}