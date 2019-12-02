import java.util.Scanner;

class HW4_3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n, sum = 0;
		
		while(true){
			System.out.print("1보다 큰 정수: ");
			n = s.nextInt();
			
			if(n>1) break;
			System.out.println("[입력오류]1보다 큰 정수를 입력해주세요. ");
		}
		
		for(int i=1; i<=n; i++){
			if(i%2==0){
				sum -= Math.pow(i,2);
				System.out.print(i+"²+"); //² 표시는 한글 초성 ㅊ 누르고 한자 키 누르면 여러개의 첨자들이 뜨는데 그 중에서 선택하면 됨. 
			}
			else{
				sum += Math.pow(i,2);
				System.out.print(i+"²-");
			}
		}
		
		System.out.println("\b= "+sum); //\b는 마지막에 입력된 연산자(+ 또는 -) 제거 
		
	}
}