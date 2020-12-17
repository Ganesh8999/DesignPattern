package com.pro.strategy;

public class InstagramStrategy implements InetSocialMediaStrategy {

	@Override
	public void connectTo(String friendName) {

		System.out.println("Connecting .. to "+friendName + "  by Instagram");
	}

}


