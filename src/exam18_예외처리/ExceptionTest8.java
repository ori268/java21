package exam18_예외처리;

class Pet{
	public void a() {}
	public void b() throws RuntimeException {}
	public void c() throws RuntimeException {}
}

class Cat extends Pet{
//	public void a() throws Exception {}   // 부모보다 확대왼 형식으로 지정 불가. 부모가 throws 를 가지지 않아서 사용 불가
//	public void b() throws RuntimeException {}   // RuntimeException 및 하위클래스 가능. 부모랑 계층적으로 같거나
	public void b() throws ArithmeticException {}  // 하위클래스면 가능
//	public void c() throws IOException {}   // 같은 계열만 가능하기 때문에 지정 불가

}

public class ExceptionTest8 {

	public static void main(String[] args) {

	}

}
