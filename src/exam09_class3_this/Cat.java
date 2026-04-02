package exam09_class3_this;

// 재사용 클래스
public class Cat {  // 고양이 객체
	
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
	// 초기화하는 진짜 생성자
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Cat(String name, int age) {
		this(name, age, null);
//		this.name = name;
//		this.age = age;
	}
	
	
	
}
