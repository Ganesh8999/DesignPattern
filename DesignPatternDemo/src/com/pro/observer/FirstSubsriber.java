package com.pro.observer;

public class FirstSubsriber implements Observer {

	@Override
	public void update(Message m) {

		System.out.println("First Subscriber :- I got "+ m.getMessageContent());
	}

}
