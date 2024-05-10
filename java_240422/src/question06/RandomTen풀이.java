package question06;




public class RandomTen풀이 {
	public static void main(String[] args) {
		int [] n = new int[10];
		int sum =0;
			
		for (int i = 0; i < n.length; i++) {
			int r =(int)(Math.random()*10)+1;//1~10
			n[i] = r;//난수를 배열에 저장
			sum+=n[i];// 배열 원소의 누적합계			
		}
		System.out.print("램덤한 정수들 : ");
		for(int i=0; i< n.length; i++) {
			System.out.print(n[i]+" ");
		}
		
		System.out.println("\n평균은 "+(double)sum/n.length);
		
	}

}

//math 를 사용  띄우기를 할 때 \n을 사용  for each 대신 기본 for문
