package workshop_03;

public class Test06 {

	public static void main(String[] args) {

		for (int i=1; i <= 6; i++) {
			for (int j=1; j <= 6; j++) {
				for (int n=1; n <= 6; n++) {
					if((i*j*n) % 3 == 0) {
						int n2 = i * j * n;
						System.out.printf("%d*%d*%d=%d\n", i, j, n, n2);
					}
				}
			}
		}
		
		
		
	}

}
