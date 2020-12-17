package com.pro.strategy;

public class SocialMediaContext {
	
	InetSocialMediaStrategy ismStrategy;

	public void setSocialmediaStrategy(InetSocialMediaStrategy ismStrategy) 
    {
        this.ismStrategy = ismStrategy;
    }
	
	public void connect(String name) {
		
		ismStrategy.connectTo(name);
	}
	

}
