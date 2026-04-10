package exam20_컬렉션API;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		// Set 계열 : 순서없고 중복불가
		HashSet<String> set1 = new HashSet<String>();
	
		// 데이터 저장
		set1.add("홍길동1");
		set1.add("홍길동2");
		set1.add("홍길동2");
		set1.add("홍길동3");
		set1.add("홍길동3");
		
		// 데이터 출력방법1 : toString()이용
		System.out.println(set1);				//	set1, set1.toString 동일하게 저장됨.
		System.out.println(set1.toString());
		
		System.out.println("================================");

		// 데이터 출력방법2 : 향상된 반복문
		for(String s : set1) {
			System.out.println(s);
		}
		
		System.out.println("================================");
		
		// 데이터 출력방법3 : Iterator<E> iterator()
		Iterator<String> ite = set1.iterator();
		
		while(ite.hasNext()) {
			String s = ite.next();
			System.out.println(s);
		}
		
		// 추가 메서드
		System.out.println("크기 : " + set1.size());
		System.out.println("포함여부 : " + set1.contains("홍길동2"));
		System.out.println("포함여부 : " + set1.contains("유관순"));
		System.out.println("값 삭제 : " + set1.remove("홍길동2"));
		
		// Object 배열로 변환
		Object [] obj = set1.toArray();
		
		set1.clear();
		System.out.println(set1);
		
	}

}
