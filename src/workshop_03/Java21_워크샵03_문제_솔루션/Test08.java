package workshop_03.Java21_워크샵03_문제_솔루션;

public class Test08 {
	public static void main(String[] args) {
		
		for(int i=1;i<=100; i++) {
		
			System.out.print(i);
			if(i%3==0)System.out.print(" foo");
			if(i%5==0)System.out.print(" bar");
			if(i%7==0)System.out.print(" baz");
			System.out.println("");
		}
	}
}
