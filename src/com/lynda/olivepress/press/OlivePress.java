package com.lynda.olivepress.press;

import java.util.ArrayList;

import com.lynda.olivepress.olive.Olive;

public class OlivePress {
	
	//Class variable
	private int totalOil = 0;

	/**
	 * Class Constructor
	 */
	public OlivePress() {
	// use this as a good practice for other programmers who look at your code
	}
	
	/**
	 * gets total oil
	 * @return
	 */
	public int getTotalOil() {
		return totalOil;
	}
	/**
	 * sets total oil
	 * @param totalOil
	 */
	private void setTotalOil(int totalOil) {
		this.totalOil += totalOil;
	}

	/**
	 * Takes an array of olives, crushes them and returns oil
	 * 
	 * @param olives
	 */
	public void pressOlive(ArrayList<Olive> olives) {

		int oil = 0;
		
		for (Olive olive : olives) {
			// calls olive class which prints ouch.
			oil += olive.crush();
				
			System.out.println("Just crushed " + olive.getName() + " into oil.");
		}
		setTotalOil(oil);
	}
}
