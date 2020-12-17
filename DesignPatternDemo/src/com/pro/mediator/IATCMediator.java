package com.pro.mediator;

import com.pro.mediator.Flight;
import com.pro.mediator.Runway;;

public interface IATCMediator {
	
	public void registerRunway(Runway runway);
	public void registerFlight(Flight flight);
	public boolean isLandingOk();
	public void setLandingStatus(boolean status);

}
