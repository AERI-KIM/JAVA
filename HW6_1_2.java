class HW6_1_2{
	public static void main(String [] args){
		if(args.length != 1){
			System.out.println("[사용법]java HW6_1_2 문자열");
			return;
		}
		
		System.out.println("역순 문자열: ");
		
		for(int i=args[0].length()-1; i>=0; i--){
			System.out.print(args[0].charAt(i));
		}
		
		System.out.println();
	}
}