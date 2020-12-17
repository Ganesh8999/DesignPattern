package com.pro.observer;


public class SecondSubscriber implements Observer {

	@Override
	public void update(Message m) {

		System.out.println("Second Subscriber :- I got "+ m.getMessageContent());
	}

}
