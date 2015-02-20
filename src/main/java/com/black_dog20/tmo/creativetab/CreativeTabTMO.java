package com.black_dog20.tmo.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.black_dog20.tmo.init.ModItems;
import com.black_dog20.tmo.reference.Reference;

public class CreativeTabTMO {
	
	public static final  CreativeTabs TMO_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
	
	 @Override
     public Item getTabIconItem()
     {
        return ModItems.tool;
     }

     @Override
     public String getTranslatedTabLabel()
     {
         return Reference.MOD_NAME;
     }
 };
 

}
