package com.pro.singleton;

public class BillPughSolutionForSingleton {
	
	private BillPughSolutionForSingleton() {
		
	}
	
	private static class LazyHolder {
		private static final BillPughSolutionForSingleton INSTANCE = new BillPughSolutionForSingleton();
		
	}
	
	public static BillPughSolutionForSingleton getInstance() {
		return LazyHolder.INSTANCE;
	}

	/*until we need an instance, the LazyHolder class will not be initialized until required 
	 * and you can still use other static members of BillPughSolutionForSingleton class.
	 */
}
