package com.black_dog20.tmo.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBook;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

import com.black_dog20.tmo.item.tool.ItemTool;
import com.black_dog20.tmo.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	
	public static ItemTool tool = new ItemTool();
	
	public static void init(){
		GameRegistry.registerItem(tool, "tool");

	}

}
