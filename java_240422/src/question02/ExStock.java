package question02;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("코스피 지수를 입력하세요(1800~2500)");
		int kos = scanner.nextInt();
		System.out.print("환율을 입력하세요(1100~1200)");
		int ch = scanner.nextInt();
		scanner.close();
		
		if(ch >=1150) {
			if(kos>=2200) {
				System.out.println("상승장");
				}else if(kos<2200&&kos>=2000) {
				System.out.println("횡보장");
				}else  {System.out.println("하락장");
				}
		} else if(ch<1150){
			if(kos>=2300) {
				System.out.println("상승장");
				}else if(kos<=3000&&kos>=2000) {
					System.out.println("횡보장");/*}이게 문제였음*/
			}else {System.out.println("하락장");}
		
	}
	}}//중괄호 위치문제

// 지피티 풀이
//public class ExStock {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("코스피 지수를 입력하세요(1800~2500): ");
//        int kos = scanner.nextInt();
//        System.out.print("환율을 입력하세요(1100~1200): ");
//        int ch = scanner.nextInt();
//        scanner.close();
//
//        if (ch >= 1150) {
//            if (kos >= 2200) {
//                System.out.println("상승장");
//            } else if (kos < 2200 && kos >= 2000) {
//                System.out.println("횡보장");
//            } else {
//                System.out.println("하락장");
//            }
//        } else if (ch < 1150) {
//            if (kos >= 2300) {
//                System.out.println("상승장");
//            } else if (kos <= 2299 && kos >= 2000) {
//                System.out.println("횡보장");
//            } else {
//                System.out.println("하락장");
//            }
//        }
//    }
//}
//

