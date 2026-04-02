package workshop_03.Java21_워크샵03_문제_솔루션;

public class Test21 {
	public static void main(String[] args) {
		
		
		
		for (int i = 1 ; i <= 100 ; i++ ){
			if( i < 10 ) System.out.print( " " );

			System.out.print( i + " " );

			if( i % 10 == 0 )
			{
				System.out.println();
			}
		}
	}
}
