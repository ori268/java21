package workshop_03;

public class Test08 {

	public static void main(String[] args) {

// 내가 쓴 답을 보면 겹쳤을 때 문자가 모두 나오지 않는다.	
//		for(int num = 1; num <= 100; num++) {
//			
//			
//			if (num % 3 == 0) {
//				System.out.println("" + num + " foo");
//				continue;
//			} 
//			if (num % 5 == 0) {
//				System.out.println("" + num + " bar");				
//				continue;
//			} 
//			if (num % 7 == 0) {
//				System.out.println("" + num + " baz");
//				continue;
//			}
//			
//			System.out.println(num);
//			
//		}
		
		 for(int i=1;i<=100; i++) {
		
			System.out.print(i);
			if(i%3==0)System.out.print(" foo");
			if(i%5==0)System.out.print(" bar");
			if(i%7==0)System.out.print(" baz");
			System.out.println("");
		}
		
		
		
	}

}
