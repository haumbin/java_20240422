package question06;

//import java.util.Scanner;

//public class PrintAlphabet {
//	public static void main(String[] args) {
//	String[] alpah = new String[23];
//	char[] small = new char[23];
//	for (int i = 0; i < small.length; i++) {
//	small[i]= (char)(97+i*1);
//	} 
//	for (int i = 0; i< alpah.length; i++) {
//		alpah[i] = (String)small[i];
//	}
////	97~110 소문자 a부터 z까지의 유니코드
////	char 배열로 다시 형변환 그 전의 숫자로 무언가 반복시키기 for문
//// 받은 i 보다 작게 출력하면 되지않을까?
////나는 숫자가 아니면 아무것도 할 줄 모르나보다
//}
//}
// GPT 힌트보고 난 뒤 charAt() 메서드는 문자열에서 특정 인덱스에 위치한 문자를 반환하는 메서드
//public static void main(String[] args) {
//	String alpah= "abcdefghijklmlopqrstuvwxyz";
//	
//	System.out.println("소문자 알파벳 하나를 입력하시오 >> ");
//	Scanner scanner = new Scanner(System.in);
//	String in = scanner.next();

//	for (in.equals(alpah.charAt()) {}
	
	
	
	
//	scanner.close();
//}	


//}
 // GPT가 만든 답 
//import java.util.Scanner;
//
//public class PrintAlphabet {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("소문자 알파벳 하나를 입력하시오>> ");
//        char ch = scanner.next().charAt(0);
//        
//        for(char c = 'a'; c <= ch; c++) {
//            for(char d = 'a'; d <= c; d++) {
//                System.out.print(d);
//            }
//            System.out.println();
//        }
//        
//        scanner.close();
//    }
//}


/*정수로 생각해보기
 * 97부터 110까지의 숫자가 있음
 * 그 사이값 중 하나를 입력할 시
 * 그 값부터 97까지 역순으로 내려가는 출력을 시행한다. 
 * 98이면
 * 97 98
 * 97
 * 100이면 
 * 97 98 99 100
 * 97 98 99
 * 97 98
 * 97
 * */


