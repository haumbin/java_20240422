package chapter03;

/*
 * main 메소드 매개변수 이용
 * */
public class Calc {
	public static void main(String[] args) {
		
		double sum=0.0;
		
//		main 메소드에서 주는 매개변수 크기만큼 반복인데 아직 정해지지않고 입력해야 정해짐
		for (int i = 0; i < args.length; i++) {
//Double.parseDouble 스트링을 더블로 바꾼다.
//			Double : Wrappper 클래스
//			parseDouble(): 실수로 변환하는 메소드
			sum+=Double.parseDouble(args[i]);
		}
		System.out.println("합계 : "+sum); /*입력없이 하면 초기값인 0.0만 있음*/
		
	}
}
