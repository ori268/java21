package exam12_상속2_상속후;

// 관리자
// Manager is a Employee ( 상속관계 )
public class Manager extends Employee {

	String depart; // 관리부서

	public Manager() {
		// super(); 자동으로 부모의 기본 생성자를 호출함.
	}

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		System.out.println("Manager 생성자");
//		this.name = name;
//		this.salary = salary;
		this.depart = depart;
	}

	// getter
	// setter

	public String getManager() {
		return name + '\t' + salary + "\t" + depart;
	}

}