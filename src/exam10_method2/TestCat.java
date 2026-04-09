package exam10_method2;

public class TestCat {

	public static void main(String[] args) {

		// 야옹이 2 암컷
		Cat c = new Cat("야옹이", 2, "암컷");

		// c.name="망치"; // 접근 불가

		// 수정 역할
		c.setName("망치");
		c.setAge(3);
		c.setGender("수컷");

		// c.age = 3; // 직접 접근 불가. 메서드를 이용해서 접근

		// 조회 역할
		String name = c.getName();
		int age = c.getAge();
		String gender = c.getGender();
		System.out.printf("이름:%s 나이:%d 성별:%s", name, age, gender);
	}

}
