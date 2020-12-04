package com.example.ImpotIS.model.service.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateUtil {

	public static int diffMois(LocalDate date1,LocalDate date2) {
		return date1.getMonthValue()-date2.getMonthValue();
	}
	//un délai de 3mois pour effecter la déclaration
	public static LocalDate constructDateDeclaration(int year) {
		LocalDate localDate= LocalDate.of(year+1, 03, 31);
		return   localDate;
				
	}
}
