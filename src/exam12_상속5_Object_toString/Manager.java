package exam12_상속5_Object_toString;

// 관리자
// Manager is a Employee ( 상속관계 )
public class Manager extends Employee {

	String depart; // 관리부서

	// 생성자 작성을 generate으로 ....

	public Manager() {
		super();
	}

	public Manager(String name, int salary) {
		super(name, salary);
	}

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	// 오버라이딩 - generate 방법 이용
	@Override
	public String getEmployee() {
		return super.getEmployee() + "\t" + depart; // super를 지우면 this가 생략된걸로 판단되서 무한루프가 걸림.
//		return name + '\t' + salary + "\t" + depart;
	}

	// Object의 toString 재정의
	@Override
	public String toString() {
		return name + '\t' + salary + "\t" + depart;
	}

}