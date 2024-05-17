package question08;

import java.util.StringTokenizer;

public class StringTokenizerEx풀이 {
	public static void main(String[] args) {
		//st객체는 홍길동, 장화, 홍련, 콩쥐, 팥쥐 5개의 토큰을 가진다.
		StringTokenizer st= new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
		
		while(st.hasMoreTokens()) {//hasMoreTokent() : 토큰이 있으면 참
			System.out.println(st.nextToken()); // nextToken(): 토큰을 꺼내온다.
			}
	}				
}

