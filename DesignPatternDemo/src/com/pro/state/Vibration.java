package com.pro.state;

public class Vibration implements MobileAlertState {

	@Override
	public void alert(AlertStateContext context) {
	System.out.println("Vibration.....mode");
	}

}
