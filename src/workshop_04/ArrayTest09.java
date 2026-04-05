package workshop_04;

import java.util.Random;

public class ArrayTest09 {

	public static void main(String[] args) {

		Random ran = new Random();

		int[] arr3 = new int[5];
		int sum = 0;

		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = 1 + ran.nextInt(9);
			sum += arr3[i];
			System.out.print(arr3[i] + " ");
		}

		System.out.println("\nsum=" + sum);
		System.out.println("avg=" + ((double)sum/arr3.length));

	}

}

/* 강사님 답 ( 중복 허용인데 이 답은 중복을 허용하지 않는 답임 )
 * public class ArrayTest09 {
	public static void main(String[] args) {

        int[] arr3 = new int[5];
        int randNum = 0; 
        int sum = 0; 		// 총합계산을 위한 변수

        // continue를 이용한 방법
        top :
        for(int i =0 ; i < 5; ) { 
            randNum  = (int)(Math.random()*10 +1);

            //같은 값이 들어있는지 비교하기 위한 for
            for (int j = 0; j <= i; j++) {        
                
                //같은 값이 있으면 다시 난수 발생시킨다.
                if(randNum == arr3[j]) {
                    continue top;
                }
            }

            //같은 값 없으면 배열에 값 넣어줌
            //넣어주고 다음 배열 위치로 넘어감
            arr3[i] = randNum; 
            i++;
        }



        // 결과의 출력
        for(int k : arr3) {
            System.out.print(k + " ");
            sum += k;
}
        System.out.println();
        System.out.println("sum = " + sum);        
        System.out.println("avg = " + ( (double)sum/ arr3.length ) );        
    }
}

*/
