package com.pro.mediator;

public class MediatorDesginPatternTest {

	public static void main(String[] args) {
		IATCMediator atcMediator = new ATCmediator();
		Flight indogo1010 = new Flight(atcMediator);
		Runway mainRunway = new Runway(atcMediator);

		atcMediator.registerFlight(indogo1010);
		atcMediator.registerRunway(mainRunway);

		indogo1010.getReady();
		mainRunway.land();
		indogo1010.land();

	}
}