package com.mcmoddev.basefoods.init;


import java.util.HashMap;

import com.mcmoddev.basefoods.lib.BlockCrop;
import com.mcmoddev.basefoods.lib.ItemModSeeds;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class initializes all items in Base Foods.
 *
 * @author Jasmine Iwanek
 *
 */
public class Items {
	
	
	
	public static HashMap<BlockCrop, Item> seedsMap = new HashMap<BlockCrop, Item>();
	private static boolean initDone = false;
	public static Item exampleSeeds;
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
		
		//Registers a new seeds items (String name, Block crop)
		exampleSeeds = registerSeeds("example_seeds", Blocks.exampleCrop);

		initDone = true;
		
		
		
		
		
		
		

	
	}
	
	
	
	public static Item registerSeeds(String name, Block crop) {

		ItemModSeeds item = new ItemModSeeds (crop, name);
		seedsMap.put((BlockCrop) crop, item);
		item.setRegistryName(name);
		item.setUnlocalizedName(name);

		return GameRegistry.register(item);
	}
	
	
	
	
	
}



