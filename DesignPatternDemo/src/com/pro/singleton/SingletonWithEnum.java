package com.pro.singleton;

public enum SingletonWithEnum {

	INSTANCE;
	public void someMethod() {
		// some class member
	}

}


/*
 * This type of implementation employs the use of enum. 
 * Enum, as written in the java docs, provided implicit support for thread safety 
 * and only one instance is guaranteed. 
 * Java enum singleton is also a good way to have singleton with minimal effort.
*
*/
