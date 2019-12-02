class HW5_1{
	public static void main(String [] args){
		int cnt = 0; //5개 출력 후 개행하기 위해 이제까지 출력된 숫자 개수 카운트
		for(int i=1; i<=100; i++){
			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
				cnt++;
				System.out.print(i+"\t");
				if(cnt%5==0)	System.out.println(); //5의 배수개 출력후 개행
			}
		}
	}
}