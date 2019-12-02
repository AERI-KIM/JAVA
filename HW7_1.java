import java.util.Scanner;

class HW7_1{
	public static void main(String [] args){
		String s1, s2;
		Scanner s = new Scanner(System.in);
		StringManipulate sm = new StringManipulate();
		
		System.out.print("문장 1: ");
		s1 = s.nextLine();		
		System.out.print("문장 2: ");
		s2 = s.nextLine();

		System.out.println("문장 1과 문장 2 연결 결과: "+sm.concat(s1,s2));
		System.out.print("문장 1 대문자 변환 결과: ");
		System.out.println(sm.toUpper(s1));
		System.out.println("문장 1과 문장 2의 일치 여부: "+sm.equals(s1,s2));
		System.out.println("문장 1과 문장 2의 비교: "+sm.compareTo(s1,s2));
	}
}

class StringManipulate{
	String concat(String s1, String s2){
		return s1+s2;
	}

	String toUpper(String s){
		String rslt="";
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)>='a' && s.charAt(i)<='z')	
				rslt += (char)(s.charAt(i)-('a'-'A'));
			else rslt += s.charAt(i);
		}
		return rslt;
	}	

	boolean equals(String s1, String s2){
		int l1 = s1.length(), l2 = s2.length();
		if(l1 != l2) return false;
		else{
			for(int i=0; i<l1; i++){
				if(s1.charAt(i)!=s2.charAt(i)) return false;
			}
			return true;
		}
	}

	int compareTo(String s1, String s2){
		int l1 = s1.length(), l2 = s2.length();
		int min = l1>l2?l2:l1;
		
		for(int i=0; i<min; i++){
			if(s1.charAt(i)!=s2.charAt(i)) 
				return s1.charAt(i)-s2.charAt(i);
		}
		return l1-l2;
	}		
}