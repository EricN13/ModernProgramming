package edu.mum.mpp.misem.test;

public class SingletonClass {
	private static int count = 0;
	private static SingletonClass instance = new SingletonClass();

	private SingletonClass() {
		count++;
	}

	public static SingletonClass getInstance() {
		return instance;
	}

	public static int getCount() {
		return count;
	}
	

}
