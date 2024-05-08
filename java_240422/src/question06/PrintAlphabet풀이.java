package question06;

//import java.util.Scanner;
//
//public class PrintAlphabet {
////	public static void main(String[] args) {
////	String[] alpah = new String[23];
////	char[] small = new char[23];
////	for (int i = 0; i < small.length; i++) {
////	small[i]= (char)(97+i*1);
////	} 
////	for (int i = 0; i< alpah.length; i++) {
////		alpah[i] = (String)small[i];
////	}
//////	97~110 소문자 a부터 z까지의 유니코드
//////	char 배열로 다시 형변환 그 전의 숫자로 무언가 반복시키기 for문
////// 받은 i 보다 작게 출력하면 되지않을까?
//////나는 숫자가 아니면 아무것도 할 줄 모르나보다
////}
//}
//// GPT 힌트보고 난 뒤 charAt() 메서드는 문자열에서 특정 인덱스에 위치한 문자를 반환하는 메서드
//public static void main(String[] args) {
//	String alpah= "abcdefghijklmlopqrstuvwxyz";
//	
//	System.out.println("소문자 알파벳 하나를 입력하시오 >> ");
//	Scanner scanner = new Scanner(System.in);
//	String in = scanner.next();
//
////	for (in.equals(alpah.charAt()) {}
//	
//	
//	
//	
//	scanner.close();
//}	
//
//
//}
 // GPT가 만든 답 
import java.util.Scanner;

public class PrintAlphabet풀이 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>> ");
      /*문자로 받는 법은 없기에 문자열로 받아서 변환*/
        String s =scanner.next();
        char c = s.charAt(0);
        /*문자열 받은 것의 첫번째 입력 값을 문자타입으로 저장*/
        
//       for(char i ='a'; i<=c; i++) {//'c'를 입력시 abc를 계속 반복함
    	   for(char i =c; i>='a'; i--) {//-1씩 감소하면서 이전 알파벳 출력
//    		   입력받은 알파멧부터 하나씩 이전 알파벳으로 반복 출력
//    	   for(char j ='a'; j <=c; j++) {//c까지만 반복
    		   for(char j ='a'; j <=i; j++) {
    		   System.out.print(j);
    	   }System.out.println();
       }
        
        scanner.close();
    }
}
