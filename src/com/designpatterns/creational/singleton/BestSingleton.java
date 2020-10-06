package com.designpatterns.creational.singleton;

public enum BestSingleton {
	INSTANCE_2("Something"), INSTANCE;

	BestSingleton() {
	};

	BestSingleton(String value) {

	}

	public int add(int a, int b) {
		return a + b;
	}
}
