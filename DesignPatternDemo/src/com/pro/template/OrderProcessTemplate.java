package com.pro.template;

public abstract class OrderProcessTemplate {

	public boolean isGift;

	public abstract void doSelect();

	public abstract void doPayment();

	public abstract void doDelivery();

	public final void giftWrap() {

		try {

			System.out.println("Gift wrap successfull ...");
		} catch (Exception e) {

			System.out.println("Gift wrap unsuccessfull");
		}
	}

	public final void processOrder(boolean isGift) {

		doSelect();
		doPayment();

		if (isGift) {
			giftWrap();
		}

		doDelivery();
	}

}
