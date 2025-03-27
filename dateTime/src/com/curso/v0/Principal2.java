package com.curso.v0;

import java.time.*;

public class Principal2 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, Month.JANUARY, 20); 
		System.out.println(date); 
		date = date.plusDays(2); 
		System.out.println(date); 
		date = date.plusWeeks(1); 
		System.out.println(date); 
		date = date.plusMonths(1); 
		System.out.println(date); 
		date = date.plusYears(5); 
		System.out.println(date); // 2027–02–28
	}

}
