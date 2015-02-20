	package com.black_dog20.tmo;


import net.minecraftforge.common.MinecraftForge;

import com.black_dog20.tmo.handler.ConfigurationHandler;
import com.black_dog20.tmo.init.ModBlocks;
import com.black_dog20.tmo.init.ModItems;
import com.black_dog20.tmo.init.Recipes;
import com.black_dog20.tmo.proxies.IProxy;
import com.black_dog20.tmo.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class tmo {

	@Mod.Instance(Reference.MOD_ID)
	public static tmo instance = new tmo();
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy Proxy;
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){

		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		Proxy.registerKeyBindings();
		ModItems.init();
		ModBlocks.init();
		
		
	}

	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
		Proxy.keyinput();
		Recipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
