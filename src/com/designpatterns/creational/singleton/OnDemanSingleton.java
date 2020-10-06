package com.designpatterns.creational.singleton;

public final class OnDemanSingleton {

	private OnDemanSingleton() {
		System.out.println("created");
	};

	public static OnDemanSingleton getInstance() {
		return HelperHolder.INSTANCE;
	}

	private static class HelperHolder {
		private static final OnDemanSingleton INSTANCE = new OnDemanSingleton();
	}

}
