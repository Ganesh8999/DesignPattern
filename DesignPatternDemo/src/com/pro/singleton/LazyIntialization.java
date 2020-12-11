package com.pro.singleton;

public class LazyIntialization {

	
	private static volatile LazyIntialization lazyInstance = null;
	
	
	private LazyIntialization() {
		
	}
	
/* 	On the first invocation, the above method will check if the instance is already created using the instance variable.
 *  If there is no instance i.e. the instance is null, it will create an instance and will return its reference.
 *  If the instance is already created, it will simply return the reference of the instance.
 * 
 *    But, this method also has its own drawbacks. Let’s see how. 
 *    Suppose there are two threads T1 and T2.
 *    Both come to create the instance and check if “instance==null”.
 *     Now both threads have identified instance variable as null thus they both assume they must create an instance. They sequentially go into a synchronized block and create the instances. 
 *     In the end, we have two instances in our application.
 */

			
	
	public static LazyIntialization getInstance() {
		
		if(lazyInstance == null) {
			
			synchronized (LazyIntialization.class) {
				
				lazyInstance = new LazyIntialization();
			}
		}
		
		return lazyInstance;
	}
	
}
