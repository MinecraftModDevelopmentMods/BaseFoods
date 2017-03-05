package com.mcmoddev.basefoods.init;

import com.mcmoddev.basefoods.lib.BlockCrop;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * This class initializes all blocks in Base Foods.
 *
 * @author Jasmine Iwanek
 *
 */
public class Blocks {

	private static boolean initDone = false;
	public static BlockCrop exampleCrop;

	public static Block CORN;
	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}
		//Registers a new block crop (String regname, String dropname, String seedname)
		exampleCrop = new BlockCrop("example_crop", "example_crop", "example_seed");

		initDone = true;
	}
	
	
	
	@SideOnly(Side.CLIENT)
	public static void initModels(){
		if (Loader.isModLoaded("basemetals"))
		{
			
			//Loads crop blocks models
			exampleCrop.initModel();

		
		
		
	

		}
		
	}
	
}
	
	
	
	
	
	
	

