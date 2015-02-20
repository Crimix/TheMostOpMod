package com.black_dog20.tmo.proxies;

import net.minecraft.entity.player.EntityPlayer;

import com.black_dog20.tmo.client.handler.KeyInputEventHandler;
import com.black_dog20.tmo.client.settings.Keybindings;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;


public class ClientProxy extends CommonProxy {

	@Override
	public void registerKeyBindings() {
		
	}

	@Override
	public void keyinput() {
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		
	}

}
