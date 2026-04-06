package exam12_상속2_상속후;

// 엔지니어
// Engineer is a Employee ( 상속관계 )
public class Engineer extends Employee {

	String skill; // 엔지니어의 기술

	public Engineer() {
	//	super(); 자동으로 부모의 기본 생성자를 호출함. 
	}

	public Engineer(String name, int salary, String skill) {
		super(name, salary); // 명시적 호출
		System.out.println("Engineer 생성자");
//		this.name = name;
//		this.salary = salary;
		this.skill = skill;
	}

	// getter
	// setter

	public String getEngineer() {
		return name + '\t' + salary + "\t" + skill;
	}

}