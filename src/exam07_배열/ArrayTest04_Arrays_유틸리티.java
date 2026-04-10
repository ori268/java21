package exam07_배열;

import java.util.Arrays;

public class ArrayTest04_Arrays_유틸리티 {

	public static void main(String[] args) {

		// 1. 배열을 문장열로 모두 출력
		// 문법 : Arrays.toString(배열);
		int[] num = { 10, 20, 30 };
		String s = Arrays.toString(num); // "[10,20,30]"

		System.out.println(Arrays.toString(num)); // "[10,20,30]"

		// 2. 배열을 오름차순 정렬
		// 문법 : Arrays.sort(배열);
		int[] num2 = { 8, 3, 10, 20, 30, 1 };
		Arrays.sort(num2);
		System.out.println(Arrays.toString(num2)); // "[1, 3, 8, 10, 20, 30]"

		// 3. 배열을 특정값으로 채우기
		// 문법 : Arrays.fill ( 배열, 변경할 값);
		String[] name = { "A", "B", "C", "D", "2", "E", "F" };
		Arrays.fill(name, "x");
		System.out.println(Arrays.toString(name));

		// 4. 배열을 일부분을 특정값으로 채우기
		// 문법 : Arrays.fill ( 배열, 시작위치, 끝위치-1, 변경할값);
		String[] name2 = { "A", "B", "C", "D", "2", "E", "F" };
		Arrays.fill(name2, 0, 3, "x");
		System.out.println(Arrays.toString(name2));

		// 5. 배열에서 특정요소의 위치값 ( index ) 값 찾기
		// Arrays.binarySearch(배열, 찾을값); 반드시 정렬이 선행되어야 됨
		int[] num3 = { 8, 3, 10, 20, 30, 1 };
		// 정렬 필수
		int idx = Arrays.binarySearch(num3, 20); // [1,3,8,10,20,30]
		System.out.println(idx);

		// 6. 배열 비교
		// 문법 : Arrays.equals(배열1,배열2);
		int[] x = { 8, 3, 10, 20, 30, 1 };
		int[] x2 = { 8, 3, 10, 20, 30, 1 };
		boolean result = Arrays.equals(x, x2);
		System.out.println(result);

		// 7. 배열크기 변경 ( 기존 배열크기변경은 불가, 새로운 배열을 만들어서 기존 배열 값을 복사함 ) ( 기존에 있던 배열의 주소값은
		// 시스템이 삭제함. )
		// 문법 : 새로운 배열 = Arrays.copyOf(기존배열,크기)
		int[] num4 = { 8, 3 };
		System.out.println(Arrays.toString(num4)); // [8, 3]

		int[] newArr = Arrays.copyOf(num4, 5);
		System.out.println(Arrays.toString(newArr));

		num4 = newArr;
		System.out.println(Arrays.toString(num4)); // [8, 3, 0, 0, 0]

	}

}