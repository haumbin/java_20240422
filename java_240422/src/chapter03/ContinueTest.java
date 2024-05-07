package chapter03;
/*
 *문자열에서 특정 문자를 찾는다.
 *찾은 갯수를 출력
 *ex>life is cool. (l은 2개 있다.) 
 */
public class ContinueTest {
	public static void main(String[] args) {
		int count=0;
//		알파벳 n의 갯수 구하기
		String s = "no news is good news";
//	 스페이스 포함해서 20자
//		length() : 문자열의 크기를 구하는 메소드
//		System.out.println(s.length());
		
//		문자열 크기인 20번 만큼 반복 반복
		for (int i = 0; i < s.length(); i++) {
//		charAt(0) : 첫번째문자 배열의 첫번째 값?
//		charAt(0) : 문자를 가져오는 메소드
//			System.out.println(s.charAt(i));
			
//			만약 그 문자가 n이 아니면 for문의 반복 동작인 i++로 돌아간다. 스킵
			if (s.charAt(i) !='n') {
				continue;
			} 
//			알파벳 n 이면 카운트 증가
			count++;
		}
			System.out.println("문장에서 발견된 n의 갯수 : "+ count);
			
		}
	}

