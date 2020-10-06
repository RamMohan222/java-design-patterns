package com.designpatterns.creational.singleton;

public final class EagerLoadedBasicSingleton {

	private final static EagerLoadedBasicSingleton INSTANCE = new EagerLoadedBasicSingleton();

	private EagerLoadedBasicSingleton() {
		super();
	}

	public EagerLoadedBasicSingleton getInstance() {
		return INSTANCE;
	}
}
