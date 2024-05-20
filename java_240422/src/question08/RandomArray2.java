package question08;

import java.util.Scanner;

public class RandomArray2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n= scanner.nextInt(); //ex>24
		int[] array = new int[n]; // 배열크기가 24
				
		for (int i = 0; i < array.length; i++) {
			int r= (int)(Math.random()*100+1);//1~100까지의 난수를 발생
			array[i]= r;
			if(i == 0) {// 첫번째는 엔터 안친다
				System.out.print(array[i]+" ");}
			else {
				if(i%10 ==0) {//10번째마다 엔터친다
					System.out.println();
				}
			System.out.print(array[i]+" ");
			for(int j =0; j<array.length; j++) {
				if(array[i]!=array[0]&&array[i-1]==r) {
				i--;
				return;				//이건 하나만 중복이 안되는거지 전체로 보면 중복이 될 수있음 전체를 기준으로 삼으려면?
				}
				for(int k =0; k<array.length; k++) {
					if(array[i]!=array[0]&&array[i-1]==r) {
						i--;
						return;
						}				//이건 하나만 중복이 안되는거지 전체로 보면 중복이 될 수있음 전체를 기준으로 삼으려면?
}
			}
	
		}
		scanner.close();
	}
}
}
//중복을 없애야한다. 같은수가 있을 때 i의 값이 줄면서 그 값을 담지않고 리턴해야함

//gpt 버전

// package question08;
//
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class RandomArray2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("정수 몇개?");
//        int n = scanner.nextInt(); // ex>24
//
//        if (n > 100) {
//            System.out.println("최대 100개의 고유한 난수를 생성할 수 있습니다.");
//            scanner.close();
//            return;
//        }
//
//        int[] array = new int[n]; // 배열 크기가 n
//        Set<Integer> uniqueNumbers = new HashSet<>(); // 중복 방지를 위한 Set
//
//        for (int i = 0; i < n; i++) {
//            int r;
//            do {
//                r = (int) (Math.random() * 100 + 1); // 1~100까지의 난수 발생
//            } while (uniqueNumbers.contains(r)); // 중복된 경우 다시 난수 발생
//
//            uniqueNumbers.add(r); // Set에 난수 추가
//            array[i] = r;
//
//            if (i == 0) { // 첫번째는 엔터 안친다
//                System.out.print(array[i] + " ");
//            } else {
//                if (i % 10 == 0) { // 10번째마다 엔터 친다
//                    System.out.println();
//                }
//                System.out.print(array[i] + " ");
//            }
//        }
//        scanner.close();
//    }
//}
