package com.black_dog20.tmo.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import com.black_dog20.tmo.reference.Reference;

public class ConfigurationHandler {

	public static Configuration configuration;

	public static void init(File configFile){

		//Create configuration object from the given configurations file 
		if(configuration == null){
			configuration = new Configuration(configFile); 
			loadConfiguration();
		}

	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){

		if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
			loadConfiguration();
		}
	}

	private static void loadConfiguration(){


		if(configuration.hasChanged()){
			configuration.save();
		}
	}
}
