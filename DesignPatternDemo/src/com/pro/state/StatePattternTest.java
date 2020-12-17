package com.pro.state;

public class StatePattternTest {
	
	
	public static void main(String[] args) {
		AlertStateContext stateContext = new AlertStateContext();
		
		stateContext.alert();
		stateContext.alert();
		
		stateContext.setState(new Silent());
		
		stateContext.alert();
		stateContext.alert();
	}

}
