package com.mcmoddev.basefoods;

import com.mcmoddev.basefoods.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * This is the entry point for this Mod.
 *
 * @author Jasmine Iwanek
 *
 */
@Mod(modid = BaseFoods.MODID, name = BaseFoods.NAME, version = BaseFoods.VERSION, dependencies = "required-after:Forge@[12.17.0.1976,)", acceptedMinecraftVersions = "[1.10.2,)", updateJSON = BaseFoods.UPDATEJSON)
public class BaseFoods {

	@Instance
	public static BaseFoods INSTANCE;

	/** ID of this Mod */
	public static final String MODID = "basefoods";

	/** Display name of this Mod */
	public static final String NAME = "Base Foods";

	/**
	 * Version number, in Major.Minor.Build format. The minor number is
	 * increased whenever a change is made that has the potential to break
	 * compatibility with other mods that depend on this one.
	 */
	public static final String VERSION = "0.12.0-beta1";

	public static final String UPDATEJSON = "https://raw.githubusercontent.com/MinecraftModDevelopment/BaseFoods/master/update.json";

	@SidedProxy(clientSide = "com.mcmoddev.basefoods.proxy.ClientProxy", serverSide = "com.mcmoddev.basefoods.proxy.CommonProxy")
	public static CommonProxy PROXY;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		PROXY.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		PROXY.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		PROXY.postInit(event);
	}

	@EventHandler
	public void onRemap(FMLMissingMappingsEvent event) {
		PROXY.onRemap(event);
	}
}
