class HW5_1{
	public static void main(String [] args){
		int cnt = 0; //5�� ��� �� �����ϱ� ���� �������� ��µ� ���� ���� ī��Ʈ
		for(int i=1; i<=100; i++){
			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
				cnt++;
				System.out.print(i+"\t");
				if(cnt%5==0)	System.out.println(); //5�� ����� ����� ����
			}
		}
	}
}