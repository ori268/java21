package exam14_인터페이스3_인터페이스적용후;

public class Dog extends Pet {

	String gender; // 색상

	public Dog() {
	}

	public Dog(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	//
	@Override
	public void eat() {
	}

	@Override
	public void sleep() {
	}

}
