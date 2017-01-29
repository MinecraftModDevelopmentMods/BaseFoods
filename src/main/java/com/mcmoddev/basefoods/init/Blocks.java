package com.mcmoddev.basefoods.init;

/**
 * This class initializes all blocks in Base Foods.
 *
 * @author Jasmine Iwanek
 *
 */
public class Blocks {

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		initDone = true;
	}
}
