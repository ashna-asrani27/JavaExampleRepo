package com.java.person;

public abstract class Person implements IsAlive,LiveLife {
	public void speak()
	{
		System.out.println("shares his/her thoughts");
	}
	
	@Override
	public void breathe()
	{
		System.out.println("be alive");
	}
	
	@Override
	public void message()
	{
		System.out.println("life is a journey,keep moving");
	}
	public abstract void eat();
}
