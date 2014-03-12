package com.lynda.olivepress.main;

/****************************************************************************
 * <b>Title</b>: Main.javaIncomingDataWebService.java
 * <p/>
 * <b>Project</b>: OliveProjectRAMDataFeed
 * <p/>
 * <b>Description: </b> <b>Copyright:</b> Copyright (c) 2014
 * <p/>
 * <b>Company:</b> Silicon Mountain Technologies
 * <p/>
 * 
 * @author Devon
 * @version 1.0
 * @since 2:29:12 PM
 *        <p/>
 *        <b>Changes: </b>
 ****************************************************************************/

public abstract class Main {

	/*
	 * This class will be the abstract class for all classes that handles the
	 * business logic(Main class) of a program.
	 */

	/**
	 * Method that handles initial set up of a program
	 */
	public abstract void setUp();

	/**
	 * Method that handles the actual running of program(business logic and
	 * actions that must be taken for program to actually work)
	 */
	public abstract void runProgram();
}
