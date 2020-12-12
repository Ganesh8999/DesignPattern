package com.pro.mediator;

public class ATCmediator implements IATCMediator {

	
	private Flight flight;
	private Runway runway;
	public boolean land;
	
	
	@Override
	public void registerFlight(Flight flight) {
		this.flight = flight;
	}
	
	public void registerRunway(Runway runway)  
    { 
        this.runway = runway; 
    } 
	
	public boolean isLandingOk()  
    { 
        return land; 
    }
	
	
	@Override
    public void setLandingStatus(boolean status)  
    { 
        land = status; 
    }

	
	
}
