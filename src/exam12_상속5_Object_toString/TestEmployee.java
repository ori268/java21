package exam12_상속5_Object_toString;

public class TestEmployee {

	public static void main(String[] args) {

		Manager m = new Manager("홍길동", 2000, "인사");
		Engineer eng = new Engineer("유관순", 1800, "자바");

		System.out.println(m.getEmployee());
		System.out.println(eng.getEmployee());
		
		// 참조변수 출력
		System.out.println(m);
		System.out.println(m.toString());  // Object의 toString()
//		exam12_상속5_Object_toString.Manager@6d311334
//		홍길동	2000	인사  --> toString 재정의한 값
	}
}