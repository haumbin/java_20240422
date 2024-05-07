package question04;

public class CoronaSum {
	public static void main(String[] args) {
	int sum=0;
	int corona[][] = new int[12][3];
		
	for (int i = 0; i < corona.length; i++) {
			for (int j = 0 ; j < corona[j/*정방형 2차행렬이라 가능이지 원래는 열마다 다르니 i를 해야함*/].length; j++) {
				corona[i][j] =10*(i+1)+(j+1);
				sum += corona[i][j];
			}
	}
		
		System.out.println("1년 전체 코로나 환자수는 "+ sum);
	}
}
