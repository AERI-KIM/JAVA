class HW6_1_2{
	public static void main(String [] args){
		if(args.length != 1){
			System.out.println("[����]java HW6_1_2 ���ڿ�");
			return;
		}
		
		System.out.println("���� ���ڿ�: ");
		
		for(int i=args[0].length()-1; i>=0; i--){
			System.out.print(args[0].charAt(i));
		}
		
		System.out.println();
	}
}