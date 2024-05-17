package chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{
	
}
public class HashSetExample {
	public static void main(String[] args) {
		//Set 인터페이스 컬렉션 타입을 HashSet 클래스 객체 생성
		Set<String> set = new HashSet<>(); //upcasting
//		Set<Object> set = new HashSet<>(); //upcasting
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
//		set.add("Java"); //set컬렉션 중복 객체 추가불가
//		AA a = new AA();
//		set.add(a); // <Object> 타입으로 사용가능
		set.add("iBatis");
		int size = set.size();
		System.out.println("총 객체수: "+size);
		//set 컬렉션은 iterator 메소드 호출해서 Iterator 인터페이스 타입으로 값을 받음
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC"); // 객체 삭제
		 size = set.size();
		System.out.println("총 객체수: "+set.size());
		
//		Iterator<String> iterator2 = set.iterator();
//		while (iterator2.hasNext()) {
//			String element = (String) iterator2.next();
//			System.out.println("\t"+element);
//		}
		for (String element : set) {
			System.out.println("\t"+element);
			
		}
		if (set.isEmpty()) /* 객체가 하나라도 존재한다면 참)*/ {
			System.out.println("비어 있음");
			
		} else {
			System.out.println("객체 있음");
		}
		set.clear();//객체 모두삭제
		if (set.isEmpty()) /* 객체가 모두 비어있다면 참)*/ {
			System.out.println("비어 있음");
			
		} else {
			System.out.println("객체 있음");
		}
	}
}
