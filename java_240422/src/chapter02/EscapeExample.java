package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("번호이름직업");
		System.out.println("번호\t이름\t직업");
//		\t: 탭만큼 띄움
		System.out.print("번호\t이름\t직업");
		System.out.print("번호\t이름\t직업\n");
		System.out.println("번호\t이름\t직업");
//		println: 엔터적용 / print: 엔터 적용안됨
//		\n : 엔터(다음행) 줄바꿈
		System.out.print("번호\t이름\t직업\n");
		System.out.print("번호\t이름\t직업");
		System.out.println();//엔터랑 같음
		System.out.println("우리는 개발자입니다.");
		System.out.println("우리는 \"개발자\"입니다.");
		System.out.println("봄여름가을겨울");
		System.out.println("봄\\여름\\가을\\겨\n울");
	}
}
