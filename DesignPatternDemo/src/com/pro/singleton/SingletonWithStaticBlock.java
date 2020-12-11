package com.pro.singleton;

public class SingletonWithStaticBlock {

	private static final SingletonWithStaticBlock INSTANCE;

	private SingletonWithStaticBlock() {

	}

	static {
		try {

			INSTANCE = new SingletonWithStaticBlock();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(" unexpected error while creating the singleton object using static block",e);
		}
	}
	
	
	public static SingletonWithStaticBlock getInstance() {
		
		return INSTANCE;
	}

}

/*The above code has one drawback. 
 * Suppose there are 5 static fields in a class and the application code needs to access only 2 or 3,
 *  for which instance creation is not required at all.
 *  So, if we use this static initialization, we will have one instance created though it is required or not.
 * 
 * 
 */
