package exam02_basic;

public class VariableTest03_변수선언3_인스턴스변수 {

	int size = 20; // 인스턴스 변수

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10; // 로컬 변수
		System.out.println(num);

		// 인스턴스 변수
		// System.out.println(size); // 객체 생성 전이기 때문에 사용불가

		VariableTest03_변수선언3_인스턴스변수 t = new VariableTest03_변수선언3_인스턴스변수(); // 이렇게 객체를 생성해야 오류가 안남.
		System.out.println(t.size);

	}

}