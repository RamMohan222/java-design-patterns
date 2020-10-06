package com.designpatterns.creational.singleton;

public final class BasicSingleton {

	private BasicSingleton() {
	}

	private static BasicSingleton instance = null;

	public BasicSingleton getInstance() {
		if (instance == null) {
			instance = new BasicSingleton();
		}

		return instance;
	}

}
