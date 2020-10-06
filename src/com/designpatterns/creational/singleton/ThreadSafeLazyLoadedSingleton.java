package com.designpatterns.creational.singleton;

public final class ThreadSafeLazyLoadedSingleton {

	private volatile static ThreadSafeLazyLoadedSingleton instance = null;

	private ThreadSafeLazyLoadedSingleton() {
		if (instance == null) {
			instance = new ThreadSafeLazyLoadedSingleton();
		} else {
			throw new IllegalStateException("Instance already created...");
		}
	}

	public static ThreadSafeLazyLoadedSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeLazyLoadedSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeLazyLoadedSingleton();
				}
			}
		}
		return instance;
	}
}
