package exam10_method2;

public class Cat {

	// 은닉화 ( 캡슐화 )
	private String name;
	private int age;
	private String gender;

	// 생성자
	public Cat() {
	}

	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// 메서드

	// name에 해당되는 setter와 getter 메서드 추가
	// setter : set+변수명 ( 관례 ), camel 표기법
	public void setName(String name) {
		this.name = name;
	}

	// getter : get+변수명 ( 관례 ), camel 표기법
	public String getName() {
		return name; // this.name
	}

	// age에 해당되는 setter와 getter 메서드 추가
	// setter : set+변수명 ( 관례 ), camel 표기법
	public void setAge(int age) {
		this.age = age;
	}

	// getter : get+변수명 ( 관례 ), camel 표기법
	public int getAge() {
		return age; // this.name
	}

	// gender에 해당되는 setter와 getter 메서드 추가
	// setter : set+변수명 ( 관례 ), camel 표기법
	public void setGender(String gender) {
		this.gender = gender;
	}

	// getter : get+변수명 ( 관례 ), camel 표기법
	public String getGender() {
		return gender; // this.name
	}
}
