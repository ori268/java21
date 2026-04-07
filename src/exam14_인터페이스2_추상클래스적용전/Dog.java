package exam14_인터페이스2_추상클래스적용전;

public class Dog extends Pet {

	String gender; // 색상

	public Dog() {
	}

	public Dog(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	//
	public void dogEat() {
	}

	public void dogSleep() {
	}

}
