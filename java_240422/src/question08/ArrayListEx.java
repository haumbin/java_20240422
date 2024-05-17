package question08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); /*입력할 스캐너 생성*/
		List<String> list = new ArrayList<>(); /*ArrayList 생성해서 List로 업캐스팅*/
		for(int i=0; i<4; i++) {System.out.print("이름을 입력하세요>>"); /* 이름을 입력받는 구간*/
		String name =scanner.next(); /*스캐너 입력값을 담는 변수*/
		list.add(name);} /*입력받은 변수를 Arraylist인 list에 추가*/
		for (int i = 0; i < list.size(); i++) { /*리스트에 입력받은 것을 리스트의 사이즈만큼 반복해서 하나씩 출력*/
			String str = list.get(i);
			System.out.print(str+" ");
		}
		String maxname =""; //제일 긴 이름을 담을 스트링 타입 생성
		int max=0; // 이름의 길이를 비교할 변수 생성
		for (int i = 0; i < list.size(); i++) { //list의 사이즈만큼 이름의 길이를 비교해서 크면 max에 담음
			if(max<(list.get(i)).length()) {
				maxname=list.get(i); //담을 때 해당 이름을 긴 이름을 담는 maxname에 담음
				max= list.get(i).length();}
			
		}
		System.out.println(); //띄워쓰기
		System.out.println("가장 긴 이름은 : "+maxname);
		scanner.close();
	}
}
