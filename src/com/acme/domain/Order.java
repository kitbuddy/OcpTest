package com.acme.domain;

/**
 * this is java doc comment for Order class
 * @author ankitJain
 */
public class Order {

	/**
	 * Used to generate order Amount
	 */
	double orderAmount;
	String customer;
	String product;
	int quantity;

	public static double taxRate = 0.05;
	MyDate orderDate;

	public static void setTaxRate(double taxRate) {
		Order.taxRate = taxRate;
	}

	public static void computeTaxOn(double anAmount) {
		System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
	}

	public double computeTax() {
		System.out.println("The tax for this order is " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}

	/**
	 * This is constructor with 3 variables
	 * @param d
	 * @param amt
	 * @param c
	 */
	public Order(MyDate d, double amt, String c  ) {

		orderDate = d;
		orderAmount = amt;
		customer = c;
		product = "Anvil";
		quantity = 1;
	}

	/**
	 * This is comment for multiple variables constructor
	 * @param d
	 * @param amt
	 * @param c
	 * @param p
	 * @param q
	 */
	public Order(MyDate d, double amt, String c, String p, int q){
		this(d,amt,c);
		product=p;
		quantity=q;
	}

	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}

	public static class MyDate {

		public int day;
		public int year;
		public int month;

		public MyDate(int day, int year, int month) {
			setDate(day, year, month);
		}

		public MyDate() {
		}

		@Override
		public String toString() {
			return  month + "/" + day + "/" + year;
		}

		public void setDate(int m, int d, int y) {
			day = d;
			month = m;
			year = y;
		}
	}
}
