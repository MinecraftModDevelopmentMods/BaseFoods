package com.mcmoddev.basefoods.lib;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import com.mcmoddev.basefoods.BaseFoods;

public class BlockCrop extends BlockCrops{
	public String drop;
	public String seed;

	
	public BlockCrop(String regname, String dropname, String seedname) {
		setUnlocalizedName(BaseFoods.MODID + "." + regname);
		setRegistryName(regname);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		drop = dropname;
		seed = seedname;
	}
	
	
	@Override
	protected Item getSeed() {
		return Item.getByNameOrId("basefoods:" + seed);
	}
	@Override
	protected Item getCrop() {
		return Item.getByNameOrId("basefoods:" + drop);
	}

	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

    
}