package exam17_유틸리티;

class Calendar {

	private static Calendar cal;

	private Calendar() {
	}

	public static Calendar getInstance() {
		if (cal == null)
			cal = new Calendar();
		return cal;
	}
}

public class SingleToneDesignTest {

	public static void main(String[] args) {

		// 싱글톤 디자인 패턴 : 단 하나의 인스턴스만 만들 때 사용 ex) 지구, 대한민국, ...
		// 1. 생성자를 private로 만든다. ( 외부에서 여러 개를 생성할 수 없도록 )
		// 2. 내부에서 메소드를 만들면 됨.

		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal == cal2);// true
	}

}
