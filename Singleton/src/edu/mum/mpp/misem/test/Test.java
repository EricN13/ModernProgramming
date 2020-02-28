package edu.mum.mpp.misem.test;

public class Test {

	public static void main(String[] args) {
		SingletonClass s1=SingletonClass.getInstance();
		System.out.println("Count :"+s1.getCount());
//		SingletonClass s2=SingletonClass.getInstance();
//		System.out.println("Count :"+s2.getCount());
	}

}
