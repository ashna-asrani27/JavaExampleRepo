package com.java.Abstraction;

import com.java.person.NonVegan;
import com.java.person.Person;
import com.java.person.Vegan;

public class hello {

	public static void main(String[] args) {
		Person john = new Vegan();
		john.breathe();
		john.eat();
		john.speak();
		john.message();
		/*
		 * 
		 * System.out.println("**********"); Person mia = new NonVegan(); mia.speak();
		 * mia.eat();
		 */

	}

}
