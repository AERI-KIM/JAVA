//Ŀ�ǵ� ���ο��� �� ���� ������ �Է¹޾� �Է¹��� ������ �� ¦���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//��, Ŀ�ǵ� ���ο� �Է��� �������� �ʴ� ��� ������ �˷��ְ� ���α׷��� ������ ��. 

class HW6_2_1{
	public static void main(String [] args){
		if(args.length==0){
			System.out.println("[����]java HW6_2_1 ����1 ����2 ...");
			return;
		}
		int n;
		
		
		System.out.println("Ŀ�ǵ� ���� ���ڵ� �� ¦��: ");
		for(int i=0; i<args.length; i++){
			n = Integer.parseInt(args[i]);
			if(n%2==0) System.out.print(n+" ");
		}
		
		System.out.println();
		
	}
}

