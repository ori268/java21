package p4;

import p3.Parent2;

public class Child2 {

	public void method() {
		// 다른 패키지 다른 클래스에서 접근
		Parent2 p = new Parent2();

		System.out.println(p.n1);
//		System.out.println(p.n2);
//		System.out.println(p.n3);
//		System.out.println(p.n4);   // private 접근불가

	}
}

// 다른 패키지 상속 관계
class child2 extends Parent2 {

	public void method() {
		System.out.println(n1);
		System.out.println(n2);
//		System.out.println(n3);
//		System.out.println(n4);  // private 접근불가

	}
}