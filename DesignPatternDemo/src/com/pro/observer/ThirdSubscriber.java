package com.pro.observer;

public class ThirdSubscriber implements Observer {

	@Override
	public void update(Message m) {

		System.out.println("Third Subscriber :- I got "+ m.getMessageContent());
	}

}