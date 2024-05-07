package question04;

public class CoronaSum풀이 {
	public static void main(String[] args) {
	int sum=0;
	int corona[][] = new int[12][3]; /*또는 일일히 나열하기*/
		
	// 행기준 1~12월, corona.length:12
	for (int month = 0; month < corona.length; month++) {
		//열 기준 3개읠 도시, corona[month]. length:3	
		for (int city = 0 ; city < corona[month].length; city++) {
				corona[month][city] =10*(month+1)+(city+1);
				System.out.println(corona[month][city]+" ");
				sum += corona[month][city];
			}
	}
		
		System.out.println("1년 전체 코로나 환자수는 "+ sum);
	}
}
