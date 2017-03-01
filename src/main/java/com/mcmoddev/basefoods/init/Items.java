package com.mcmoddev.basefoods.init;

import net.minecraft.item.Item;

/**
 * This class initializes all items in Base Foods.
 *
 * @author Jasmine Iwanek
 *
 */
public class Items {

	private static boolean initDone = false;

	public static Item CAKE_CHOCOLATE;
	
	public static Item CORN_SEEDS;	
	public static Item CORN;
	
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
