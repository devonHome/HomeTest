package com.lynda.olivepress;

import java.util.ArrayList;

import com.lynda.olivepress.main.Main;
import com.lynda.olivepress.olive.Kalamata;
import com.lynda.olivepress.olive.Ligurian;
import com.lynda.olivepress.olive.Olive;
import com.lynda.olivepress.press.OlivePress;

public class OliveMain extends Main {

	/*
	 * Class will create a number of random olives that will be crushed into a 
	 * olive press machine and it will display how many where crushed with 
	 * the total amount of oil from each oil.
	 */
	
	// set variables needed for class
	private OlivePress press = null;
	private int amountOfOlives = 0;
	private ArrayList<Olive> myOlives;

	/**
	 * Main method, runs the class when called
	 * @param args
	 */
	public static void main(String[] args) {
		OliveMain myMain = new OliveMain(10);

		// set up class
		myMain.setUp();

		// run the program
		myMain.runProgram();
	}

	/**
	 * Class constructor
	 * 
	 * @param numOlives Number of olives to be created for class
	 */
	public OliveMain(int numOlives) {
		this.amountOfOlives = numOlives;
	}

	/**
	 * Sets up all info needed to press the olives
	 */
	public void setUp() {
		// should create all the olives based on # in constructor

		this.myOlives = addOlive(this.amountOfOlives);

		this.press = new OlivePress();
	}

	/**
	 * Will start the running of the class, smashing all olives
	 */
	public void runProgram() {

		System.out.println("\n Time to start the machine... \n");

		press.pressOlive(myOlives);

		System.out.println("Total amount of oil " + press.getTotalOil());
	}

	/**
	 * Creates different olives based on number passed in
	 * 
	 * @param numOlive how many olives to create
	 */
	public ArrayList<Olive> addOlive(int numOlive) {
		Olive olive;
		ArrayList<Olive> olives = new ArrayList<Olive>();

		for (int j = 0; j < numOlive; j++) {
			olive = new Ligurian();
			
			if (j > 2 && j < 5) {
				olive = new Kalamata();

			} else if (j > 5) {
				olive = new Olive(j);
			}
			olives.add(olive);
		}
		return olives;
		
	}
}
