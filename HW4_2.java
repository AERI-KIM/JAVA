import java.util.*;

class HW4_2{
	public static void main(String [] args){
		int usr, randomNbr, cnt = 0;
		//usr: ����ڰ� �Է��� ������
		//randomNbr: ���α׷����� ������ ���� 
		//cnt: ����� ���� �õ� Ƚ�� 
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		//���� ����
		randomNbr = r.nextInt(101)-50;
		/*
			//Math Ŭ���� ����ص� ����. 
			//randomNbr = (int)(Math.random()*101-50);
		*/
		//����ڷκ��� ������ �Է¹ޱ�: ��ġ�Ҷ�����
	
		while(true){
			System.out.print("������: ");
			usr = s.nextInt();
			cnt++;//����ڷΰ� �Է��Ѵٸ� �õ� Ƚ�� �ѹ� ����
			if(usr==randomNbr) break;
			else if(usr>randomNbr) System.out.println("���� �ѹ��� �� �� ���� ���Դϴ�. �ٽ� �õ����ּ���. ");
			else System.out.println("���� �ѹ��� �� �� ū ���Դϴ�. �ٽ� �õ����ּ���. ");
		}
		
		System.out.printf("�����Դϴ�. �� %dȸ���� ���߼̽��ϴ�.\n", cnt);
	}
}