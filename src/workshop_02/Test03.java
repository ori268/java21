package workshop_02;

public class Test03 {

	public static void main(String[] args) {

		// ch는 'z' 문자만 가지고 있는데 'a'를 쓰는 이유를 모르겠음
		char ch = 'z';
		boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z');
		System.out.println(b);
	}

}
