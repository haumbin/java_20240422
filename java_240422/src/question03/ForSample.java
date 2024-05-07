package question03;

public class ForSample {
public static void main(String[] args) {
	String sum = ""; //문자열을 받을 공간 초기값을 설정해야함 중요
	int res = 0; // 총합 값을 받을 공간 초기값을 설정해야 다음 값들을 받을 수 있다
	int i = 0;
	for ( i = 1; i <10 ; i++) {
		res=res+i; // 총합이 담김
		
		sum= sum+i + "+";
	}
		System.out.println(sum+(i)+"="+(res+i));
}
}
