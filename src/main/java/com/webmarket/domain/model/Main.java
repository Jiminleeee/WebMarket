package com.webmarket.domain.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//현재 달력
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		
		//10일 후
		calendar.add(Calendar.DAY_OF_MONTH, 10);
		
		Date date = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println(date);
		
		
		//내년 내 생일
		//month : January - 0
		calendar.set(2023,8, 07);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));	// 1~7 : 일 ~ 토

	}

}
