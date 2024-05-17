package question07;
/*
 * String[] 배열을 전달받아 출력하는 printStringArray() 메소드와
배열 속의 “be” 문자열을 “eat”로 대치하는 replaceBe() 메소드
를 작성하라.*/
// 국어게임이네...

public class ArrayParameterEx {
	public String[] printStringArray() {
			String[] s= new String[1];
				s[0]="to be or not to be";
				
			return s;}
			
	public void replaceBe(String[] s) {
		s[0].replace("be","eat");
		System.out.println(s);
	} 

	public static void main(String[] args) {
	

}
}