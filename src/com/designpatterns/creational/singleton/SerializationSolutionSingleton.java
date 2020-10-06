package com.designpatterns.creational.singleton;

import java.io.Serializable;

public final class SerializationSolutionSingleton implements Serializable {

	private static final long serialVersionUID = -8727583163522653332L;
	public final static SerializationSolutionSingleton INSTANCE = new SerializationSolutionSingleton();

	private SerializationSolutionSingleton() {
	};

	// To serialize the Object internally JVM call this method this method.
	protected Object readResolve() {
		return INSTANCE;
	}
}
