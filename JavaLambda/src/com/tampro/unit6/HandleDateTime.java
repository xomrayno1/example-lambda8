package com.tampro.unit6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class HandleDateTime {
	/*
	 * 	LocalDate: Tạo ra 1 instance của date theo tiêu chuẩn ISO 8601, không time, không timezone.
	 *	LocalTime: Tạo ra 1 instance của time theo tiêu chuẩn ISO 8601, không date, không timezone.
	 *	LocalDateTime: Nó bao gồm cả 2 API trên, tạo ra instance chứa cả date, time và không có timezone.
	 *	ZonedDateTime: Gồm API LocalDateTime có timezone
	 */
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime  = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(localDateTime);
		System.out.println(zonedDateTime);
		
		//Localdate
		System.out.println(localDate.plusDays(3)); // tăng
		System.out.println(localDate.minusDays(3)); // giảm
		LocalDate specDate = LocalDate.of(2021, 1, 25);
		System.out.println(specDate);// tạo local ngày chỉ rõ
		long days = ChronoUnit.DAYS.between( localDate, specDate);
		// khoảng cách giữa cách date
		System.out.println(days);
	}
}
