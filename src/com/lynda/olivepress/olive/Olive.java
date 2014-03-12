package com.lynda.olivepress.olive;

public class Olive {
	
	public static final long BLACK = 0x000000;
	public static final long GREEN = 0x00FF00;
	
	protected String name = "Bad-ass Olive!";
	protected String flavor = "grassy";
	protected long color = Olive.BLACK;
	private int oil = 3;

	/**
	 * Class Constructor
	 * @param oil
	 */
	public Olive(int oil){
		setOil(oil);
	}
	
	/**
	 * Class Constructor OVERLOAD
	 * @param name
	 * @param oil
	 */
	public Olive(String name, int oil) {
		setName(name);
		setOil(oil);
	}

	//setters and getters
	/**
	 * 
	 * @return
	 */
	public int getOil() {
		return oil;
	}
	/**
	 * 
	 * @param oil the oil to set
	 */
	public void setOil(int oil) {
		this.oil = oil;
	}
	/**
	 * 
	 * @return oil that is crushed
	 */
	public int crush(){
		System.out.println("It didn't even hurt!");
		return oil;
	}
	/**
	 * 
	 * @return the name of the olive
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * 
	 * @return set the name of the olive
	 */
	public void setName(String name){
		 this.name = name;
	}

	/**
	 * @return the color
	 */
	public long getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(long color) {
		this.color = color;
	}
}
