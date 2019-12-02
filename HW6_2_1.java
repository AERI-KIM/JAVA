//커맨드 라인에서 몇 개의 정수를 입력받아 입력받은 정수들 중 짝수만 출력하는 프로그램을 작성하시오.
//단, 커맨드 라인에 입력이 존재하지 않는 경우 사용법을 알려주고 프로그램을 종료할 것. 

class HW6_2_1{
	public static void main(String [] args){
		if(args.length==0){
			System.out.println("[사용법]java HW6_2_1 정수1 정수2 ...");
			return;
		}
		int n;
		
		
		System.out.println("커맨드 라인 인자들 중 짝수: ");
		for(int i=0; i<args.length; i++){
			n = Integer.parseInt(args[i]);
			if(n%2==0) System.out.print(n+" ");
		}
		
		System.out.println();
		
	}
}

