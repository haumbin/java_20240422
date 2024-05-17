package chapter06;

public class StringEx {
	public static void main(String[] args) {
		String a= new String(" C#"); //객체는 heap 메모리에 저장 
		String b= new String(",C++ "); //객체는 heap 메모리에 저장
		
//		length(): 문자열의 길이
		System.out.println(a.length()); //C#의 길이는 3(스페이스 공백포함)
//		contains(): 문자열 포함 여부
		System.out.println(a.contains("#")); // 객체 a는 #을 포함하고 있으므로 true
		System.out.println(a.contains("*")); // 객체 a는 *을 포함하고 있으므로 false
		
		a = a.concat(b); // concat(): 문자열 연결
		System.out.println(a); // C#,C++ (새로운 문자열을 a가 가르킴)
		
		a = a.trim(); // trim(): 앞, 뒤 공백 제거
		System.out.println(a);//C#,C++
		
		a= a.replace("C#", "Java"); // replace("a","b"): a를 b로 문자열 수정, 대체
		System.out.println(a);//Java,C++
		
		String[] s = a.split(","); // split() 문자열을 분리 , 를 기준으로
		for (int i = 0; i < s.length; i++) {
			/*분리된 문자열0:Java
			  분리된 문자열1:C++*/
			System.out.println("분리된 문자열"+i+":"+s[i]);
		}
		a = a.substring(5); // substring(): 인덱스 값으로 시작하는 문자열 (5)면 다섯번째 다음 문자부터 출력 즉 6번째부터?
		System.out.println(a); //Java,C++ ==> C++
		
		char c = a.charAt(2); //charAt(): 인덱스에 해당하는 (2)면 두번째에 해당하는 문자
		System.out.println(c); // C++ => +
	}
}
