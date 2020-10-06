package com.designpatterns.creational.singleton;

public class App {

	public static void main(String[] args) {
		var obj1 = OnDemanSingleton.getInstance();
		var obj2 = OnDemanSingleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);

		BestSingleton obj3 = BestSingleton.INSTANCE;
		BestSingleton obj4 = BestSingleton.INSTANCE;
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
