package com.pro.prototype;

import com.pro.prototype.PrototypeFactory.ModelType;

public class PrototypePattern {

	
	
public static void main(String[] args) {
	
	try {
		
		String moviePrototype = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
		System.out.println(moviePrototype);
		String showPrototype = PrototypeFactory.getInstance(ModelType.SHOW).toString();
		System.out.println(showPrototype);
		String albumPrototype = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
		System.out.println(albumPrototype);
		
	} catch (CloneNotSupportedException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
