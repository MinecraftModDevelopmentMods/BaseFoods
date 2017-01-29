package com.mcmoddev.basefoods.init;

/**
 * This class initializes all items in Base Foods.
 *
 * @author Jasmine Iwanek
 *
 */
public class Items {

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Blocks.init();

		initDone = true;
	}
}
