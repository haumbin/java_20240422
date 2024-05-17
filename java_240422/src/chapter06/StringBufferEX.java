package chapter06;

public class StringBufferEX {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil"); //append(): 문자열을 연결(추가되면서 수정됨 새로생성한게 아닌 수정)  단순하게 붙여넣기 더하기
		System.out.println(sb); // This is pencil
		
		//insert(): 문자열 삽입
		sb.insert(7, " my");// is 다음에 my 삽입 원하는 위치에 해당 값을 삽입
		System.out.println(sb); // This is pencil
		
		//replace(): 문자열 대체 특정 부분을 다른것으로 대체
		sb.replace(8, 10, "your"); //This is my pencil -> my가 your
		System.out.println(sb); // This is your pencil

		//delete(): 문자열 삭제
		sb.delete(8, 13); // This is your pencil -> your 삭제
		System.out.println(sb); // This is pencil
		//setLength() : 문자열의 길이 수정
		sb.setLength(4); // This is pencil > this 자리가 4자리가 한계이므로 나머지가 사라짐 공간이 늘어날 시에는 공백으로 채운다
		System.out.println(sb); // This
	}
}
