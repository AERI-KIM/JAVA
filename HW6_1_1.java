class HW6_1_1{
	public static void main(String [] args){
		String word;
		int nbOfMoeum = 0, nbOfJaeum=0;//���� ���� ����
		
		if(args.length != 1){
			System.out.println("[����]java HW6_1_1 ���ڿ�");
			return;
		}
		
		
		word = args[0]; //Ŀ�ǵ���ο� �Է��� �ϳ��� �ܾ word�� ����
		
		for(int i=0; i<word.length(); i++){
			if(((word.charAt(i)>='A')&&(word.charAt(i)<='Z'))||((word.charAt(i)>='a')&&(word.charAt(i)<='z'))){//word�� i��° ���ڰ� ���ĺ��̶� ī����
				switch(word.charAt(i)){
				case 'A': case 'E': case 'I': case 'O': case 'U': 
				case 'a': case 'e': case 'i': case 'o': case 'u': 
					nbOfMoeum++;
					break;
				default: 
					nbOfJaeum++;
					break;
				}
			}
		}
		
		System.out.println("���� ����: "+nbOfJaeum);
		System.out.println("���� ����: "+nbOfMoeum);
		
		
	}
}

















