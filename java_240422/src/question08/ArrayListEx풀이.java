package question08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx풀이 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		for(int i=0; i<4; i++) {System.out.print("이름을 입력하세요>>");
		String name =scanner.next();
		list.add(name);}
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.print(str+" ");
		}
		String maxname ="";
		for (int i = 0; i < list.size(); i++) {
			int max=0;
			if(max<(list.get(i)).length()) {
				maxname=list.get(i);
				max= list.get(i).length();}
			
		}
		System.out.println();
		System.out.println("가장 긴 이름은 : "+maxname);
		scanner.close();
	}
}
