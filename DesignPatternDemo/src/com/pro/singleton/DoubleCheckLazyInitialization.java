package com.pro.singleton;

public class DoubleCheckLazyInitialization {

	private static volatile DoubleCheckLazyInitialization instance = null;
	 
    // private constructor
    private DoubleCheckLazyInitialization() {
    }
 
    public static DoubleCheckLazyInitialization getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLazyInitialization.class) {
                // Double check
                if (instance == null) {
                    instance = new DoubleCheckLazyInitialization();
                }
            }
        }
        return instance;
    }
}
