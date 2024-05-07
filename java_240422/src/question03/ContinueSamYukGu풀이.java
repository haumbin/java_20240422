package question03;
// 둘다 맞음
//public class ContinueSamYukGu풀이 {
//	public static void main(String[] args) {
//	
//		for (int i = 1; i <= 10; i++) {
//			if(i%3 ==0) {
//				System.out.print("짝 ");
//			}else{System.out.print(i+" ");
//										}
//			}
//			
//		}
//}
public class ContinueSamYukGu풀이 {
	public static void main(String[] args) {
	
		for (int i = 1; i <= 10; i++) {
			if(i%3 ==0) {
				System.out.print("짝 ");
				continue;
			}
			System.out.print(i+" ");
										
			}
			
	}
}
