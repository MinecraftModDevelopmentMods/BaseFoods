package com.mcmoddev.basefoods.init.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockCorn extends BlockCrops {

	public static final PropertyInteger CORN_AGE = PropertyInteger.create("age", 0, 6);

	 private static final AxisAlignedBB[] CORN_AABB = new AxisAlignedBB[]
	{
			//7 "Ages" so 7 BoundingBoxes
			//Only 5th Value Changes
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D),
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D),
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D),
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D),
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.25D, 1.0D),
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.5D, 1.0D),
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.75D, 1.0D)
	 };
	
	protected PropertyInteger getAgeProperty() {
		return CORN_AGE;
	}
	
	 public int getMaxAge() {
		 return 6;
	 }
	 
	 protected Item getSeed() {
		 return Items.BEETROOT_SEEDS;
	 }

	 protected Item getCrop() {
		 return Items.BEETROOT;
	}
	 
	 public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
	        return CORN_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
	}
}


