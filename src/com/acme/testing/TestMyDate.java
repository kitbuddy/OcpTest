package com.acme.testing;

import com.acme.domain.Order;
import com.acme.utils.MyDate;

public class TestMyDate{

	public static void main(String[] args){
		Order.MyDate date1 = new Order.MyDate(11,11,1918);

		Order.MyDate date2 = new Order.MyDate();
		date2.day = 11;
		date2.month = 11;
		date2.year = 1918;

		Order.MyDate date3 = new Order.MyDate();
		date3.setDate(4,21,1968);

		String str1 = date1.toString();
		String str2 = date2.toString();
		String str3 = date3.toString();

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
