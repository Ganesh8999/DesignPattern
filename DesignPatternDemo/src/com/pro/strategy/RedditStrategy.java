package com.pro.strategy;

public class RedditStrategy implements InetSocialMediaStrategy {

	@Override
	public void connectTo(String friendName) {
		System.out.println("Connecting .. to "+friendName + "  by Reddit");
	}

}
