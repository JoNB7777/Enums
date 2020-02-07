package com.qa.enumeration;

public class Runner {

	public static void main(String[] args) {
		Day day1 = Day.MONDAY;
		Day day2 = Day.TUESDAY;
		Day day3 = Day.WEDNESDAY;
		Day day4 = Day.THURSDAY;
		Day day5 = Day.FRIDAY;
		Day day6 = Day.SATURDAY;
		Day day7 = Day.SUNDAY;
		System.out.println(day1.getFeeling());
		System.out.println(day2.getFeeling());
		System.out.println(day3.getFeeling());
		System.out.println(day4.getFeeling());
		System.out.println(day5.getFeeling());
		System.out.println(day6.getFeeling());
		System.out.println(day7.getFeeling());

	}

}
