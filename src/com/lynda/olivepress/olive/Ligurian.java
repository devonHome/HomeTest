package com.lynda.olivepress.olive;

public class Ligurian extends Olive {

	private int oil = 10;
	/**
	 * Class Constructor
	 */
	public Ligurian() {
		
		//Use's the olives second constructor 
		super("Ligurian", 100);
		this.flavor = "yummy";
		this.color = Olive.GREEN;

	}	
	
	/**
	 * Override method to print own message
	 */
	@Override
	public int crush() {
		
		System.out.println("Ouch! From the subclass");
		
		return oil;
	}
}
