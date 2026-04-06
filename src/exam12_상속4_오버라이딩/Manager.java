package exam12_상속4_오버라이딩;

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

	// getter
	// setter

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

//	public String getManager() {
//		return name + '\t' + salary + "\t" + depart;
//	}

	// 오버라이딩 - generate 방법 이용
	@Override
	public String getEmployee() {
		return super.getEmployee() + "\t" + depart; // super를 지우면 this가 생략된걸로 판단되서 무한루프가 걸림.
//		return name + '\t' + salary + "\t" + depart;
	}

}