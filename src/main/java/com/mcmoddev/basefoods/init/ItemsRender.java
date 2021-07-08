package com.mcmoddev.basefoods.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ItemsRender {

	


		public static void registerItemRenderer() {
	
	
			reg(Items.exampleSeeds);



}
		
		
		
		
		public static void reg(Item item) {
			ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");

			ModelLoader.setCustomModelResourceLocation(item, 0, res);
		}
		
		
		
}





