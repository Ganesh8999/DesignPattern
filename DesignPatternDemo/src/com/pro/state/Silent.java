package com.pro.state;

public class Silent implements MobileAlertState {

	@Override
	public void alert(AlertStateContext context) {

		System.out.println("Silent.......mode");
	}

}
