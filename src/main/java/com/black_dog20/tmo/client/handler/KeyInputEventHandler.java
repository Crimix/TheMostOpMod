package com.black_dog20.tmo.client.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentTranslation;

import com.black_dog20.tmo.client.settings.Keybindings;
import com.black_dog20.tmo.init.ModItems;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class KeyInputEventHandler {


	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
	
	}
}
