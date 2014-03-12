package com.lynda.olivepress.olive;

public class Kalamata extends Olive {

	private int oil = 50;
	
	public Kalamata() {
		//the is a way of calling the super classes methods
		super(2);
		this.name = "Kalamata";
		this.flavor = "Grassy";
		this.color = Olive.BLACK;

	}
	//how to overriding methods
	@Override
	public int crush() {
		//this means calls the superclass's method and return whatever
		//it returns
		//return super.crush();
		System.out.println("Ouch! From the subclass");
		return oil;
	}
	
}
