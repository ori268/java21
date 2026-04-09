package exam16_람다표현식;

// 인터페이스
@FunctionalInterface
interface Flyer3 {
	public abstract void fly(int n, int n2);
}

public class TestMain3 {

	public static void main(String[] args) {

		// 익명클래스
		Flyer3 f = new Flyer3() {

			@Override
			public void fly(int n, int n2) {
				System.out.println("fly()"+n + "\t" + n2);
			}
		};
		f.fly(10, 20);

		// 람다 표현식 ( => ( 자바스크립트 ), -> ( 자바 ) )
		Flyer3 f2 = (int n, int n2) -> {System.out.println("람다.fly()"+n+ "\t" + n2);};
		f2.fly(10, 20);
		
		Flyer3 f3 = (n, n2) -> {System.out.println("람다.fly()"+n+ "\t" + n2);};
		f3.fly(10, 20);
		
//		Flyer3 f4 = n, n2 -> {System.out.println("람다.fly()"+ n + "\t" + n2);};
//		f4.fly(10, 20);
// 		파라미터가 2개 이상이라면 () 생략 불가능
		
		Flyer3 f5 = (n, n2) -> System.out.println("람다.fly()"+n+ "\t" + n2);
		f5.fly(10, 20);
// 		실행문 하나라 실행문은 {} 생략 가능		
	} // end main

}
