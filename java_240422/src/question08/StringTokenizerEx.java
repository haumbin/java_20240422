package question08;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String s = "홍길동/장화/홍련/콩쥐/팥쥐";
		StringTokenizer st= new StringTokenizer(s,"/");
		
		while(st.hasMoreTokens()) {//hasMoreTokent() : 토큰이 있으면 참
			System.out.println(st.nextToken()); // nextToken(): 토큰을 꺼내온다.
			}
	}				
}