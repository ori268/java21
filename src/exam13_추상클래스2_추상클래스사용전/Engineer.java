package exam13_추상클래스2_추상클래스사용전;

public class Engineer extends Employee {

	String skill;

	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}

//	public Engineer() {
//		super();
//	}  -> Employee에서 기본 생성자가 없어서 error 남

//	// name과 salary, skill를 리턴하는 메서드가 필요하다고 order가 옴
//	public String getInfo() {
//		return skill + "\t" + name + "\t" + salary;
//
//	}

	@Override
	public String getEmployee() {
		return skill + "\t" + name + "\t" + salary;

	}

}
