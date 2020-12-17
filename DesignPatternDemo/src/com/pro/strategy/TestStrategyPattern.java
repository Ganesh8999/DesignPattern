package com.pro.strategy;

public class TestStrategyPattern {
	
	public static void main(String[] args) {
		
		
		SocialMediaContext context = new SocialMediaContext();
		
		context.setSocialmediaStrategy(new FacebookStrategy());
		context.connect("Ganesh");
		
		System.out.println(".........................................");
		
		context.setSocialmediaStrategy(new  InstagramStrategy());
		context.connect("Divya");
		
		
		System.out.println(".........................................");
		
		
		context.setSocialmediaStrategy(new RedditStrategy());
		context.connect("RedditMan");
	}
	

}
