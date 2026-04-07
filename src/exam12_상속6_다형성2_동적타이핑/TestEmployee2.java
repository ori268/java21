package exam12_상속6_다형성2_동적타이핑;

public class TestEmployee2 {

	public static void main(String[] args) {
		
		Employee [] e = { new Engineer(),
           				  new Manager(),
						  new Engineer(),
						  new Engineer(),
						  new Manager()};
		
		// Engineer 만 추출해서 c() 호출하자.
		
		for(Employee emp : e) {
			if(emp instanceof Engineer) { // Engineer만 추출
				Engineer eng = (Engineer)emp;  // 형변환
				eng.c();

				// 한꺼번에 형변환하는 방법
				((Engineer) emp).c();
			}
		}
		
	}
}