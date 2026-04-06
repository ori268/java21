package pack01;

public class Test01 {

	public static void main(String[] args) {

		Student s1 = new Student("Kim", 100, 90, 95, 89);
		Student s2 = new Student("Lee", 60, 70, 99, 98);
		Student s3 = new Student("Park", 68, 86, 60, 40);

		Student[] s = new Student[3];
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;

		System.out.println(s1.getName() + " 평균: " + s1.getAvg() + " 학점: " + s1.getGrade());

		System.out.println(s2.getName() + " 평균: " + s2.getAvg() + " 학점: " + s2.getGrade());
		
		System.out.println(s3.getName() + " 평균: " + s3.getAvg() + " 학점: " + s3.getGrade());
	}

}
