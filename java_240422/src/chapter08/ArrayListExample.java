package chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//List 컬렉션에서 ArrayList 클래스로 객체 생성(제네릭 타입파라미터를  String)
		//upcasting
	List<String> list = new ArrayList<>(); // List에 커서 위치하고 ctrl +t
	list.add("Java");
	list.add("JDBC");
	list.add("Servlet/JSP");
	list.add(2, "Database"); //2번째 자리에 해당 내용을 삽입한다. 기존에 있던 2번 Servlet/JSP은 3번으로 밀려난다.
	list.add("Spring");
	
	int size = list.size();
	System.out.println("총 list 갯수: "+size);
	
	String skill = list.get(2); //해당 값을 가지고 온다.
	System.out.println("2번째 인덱스: "+skill);
	
	for (int i = 0; i < list.size(); i++) {
		String str = list.get(i);
		/*
		 * 0: Java
		   1: JDBC
		   2: Database
		   3: Servlet/JSP
		   4: Spring
		 */
		System.out.println(i+": "+str);
	}
	
	
	System.out.println(); 
	list.remove(2); // 인덱스로 객체를 삭제함 2번 데이터베이스가 날아가면서 다시 뒤에있던 것들 이 땡겨온다
	/*
	0: Java
	1: JDBC
	2: Servlet/JSP
	3: Spring
	*/
	for (int i = 0; i < list.size(); i++) {
		String str = list.get(i);
		System.out.println(i+": "+str);
	}
	
	
	System.out.println(); 
	list.remove("Spring"); // 객체 대상을 직접 삭제함 
	for (int i = 0; i < list.size(); i++) {
		String str = list.get(i);
		System.out.println(i+": "+str);
	}
	
	}
}
