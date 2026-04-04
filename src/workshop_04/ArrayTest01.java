package workshop_04;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum=" + sum);
		System.out.println("avg=" + sum / arr.length);

		/*
		 * 내 답
		 * 
		 * int sum = 0; 
		 * int avg = 0; 
		 * for (int n : num) {
		 *  sum += n; avg = sum / 5; 
		 * }
		 * System.out.println("sum " + sum); 
		 * System.out.println("avg " + avg);
		 */
	}

}
