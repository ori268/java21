package exam17_유틸리티;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

	public static void main(String[] args) {

		// 날짜 얻기
		LocalDate today = LocalDate.now();
		System.out.println(today);

		// 과거로
		LocalDate past = today.minusDays(2);
		LocalDate past2 = today.minusMonths(1);
		LocalDate past3 = today.minusYears(1);
		System.out.println(past);
		System.out.println(past2);
		System.out.println(past3);

		// 미래로
		LocalDate future = today.plusDays(3);
		LocalDate future2= today.plusMonths(3);
		LocalDate future3 = today.plusYears(3);
		System.out.println(future);
		System.out.println(future2);
		System.out.println(future3);

		// 특정 날짜 설정
		LocalDate myday = LocalDate.of(2036, 10, 10);
		System.out.println(myday);
		
		// str --------> LocalDate
		String str = "2026-12-24";  // "2026년12월24일", "2026/12/24"
		
		LocalDate myday2 = LocalDate.parse(str);
		System.out.println(myday2);
		
		String str2 = "2026년12월24일";
		LocalDate myday3 = LocalDate.parse(str2, DateTimeFormatter.ofPattern("yyyy년MM월dd일"));
		System.out.println(myday3);
		
		String str3 = "2026/12/24";
		LocalDate myday4 = LocalDate.parse(str3, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(myday4);
	
	
	}
}
