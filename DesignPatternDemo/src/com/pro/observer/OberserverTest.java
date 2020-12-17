package com.pro.observer;

public class OberserverTest {
	
	public static void main(String[] args) {
		
		
		FirstSubsriber f1 = new FirstSubsriber();
		SecondSubscriber f2 =  new SecondSubscriber();
		ThirdSubscriber f3 = new ThirdSubscriber();
		
		
		MessagePublisher messagePublisher = new MessagePublisher();
		
		messagePublisher.attach(f1);
		messagePublisher.attach(f2);
		
		messagePublisher.notifyUpdate(new Message(" Hi this is Ross !!!"));
		
		messagePublisher.detach(f1);
		messagePublisher.attach(f3);
		
		messagePublisher.notifyUpdate(new Message("Hi this is Rachel"));
		
	}

}
