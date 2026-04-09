package exam09_class2_생성자;

// 재사용 클래스
public class Cat { // 고양이 객체

	// 구성 3가지

	// 1. 인스턴스 변수 ( 멤버 변수 ) // 고양이 객체 속성 : 이름, 나이, 성별
	String name;
	int age;
	String gender;

	// 2. 매서드 ( 멤버 매서드 ) // 고양이 객체 동작 : 먹기, 울기, ...
	public void eat() {
		System.out.println("쩝쩝");
	}

	public void cry() {
		System.out.println("야옹~");
	}

	// 3. 생성자
	public Cat() {
	}

	public Cat(String s) {
		name = s;
	}

	public Cat(String s, int n) {
		name = s;
		age = n;
	}

	public Cat(String s, int n, String s2) {
		name = s;
		// age 검증 가능
		if (n >= 20) {
			System.out.println("나이값 오류, 확인하세요");
		} else {
			age = n;
		}
		gender = s2;
	}

}
