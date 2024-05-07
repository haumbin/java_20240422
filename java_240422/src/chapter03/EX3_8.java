package chapter03;
/*
 * 문자열에서 r 알파벳 갯수 구하기
 * 알바벳 대/소문자 상관없이
 * toCharArray() 메소드 이용 하기
 * */
public class EX3_8 {
	public static void main(String[] args) {
		int count=0;
		String str="Programming is Fun! Right?";
//		toCharArray(): 문자열에서 문자 하나씩 가지고 오는 메소드 (P~?)
		char[] charArr = str. toCharArray();
	
//		Programming is Fun! Right? > 문자열 크기만큼 반복
		for (int i = 0; i < charArr.length; i++) {
			if(charArr[i]/*배열원소, 배열값*/== 'R'||charArr[i]== 'r') { 
			count++;}
		}
		System.out.println("=> R(r)의 갯수: "+count);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

