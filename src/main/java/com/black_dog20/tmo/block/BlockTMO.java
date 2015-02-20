package com.black_dog20.tmo.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.black_dog20.tmo.creativetab.CreativeTabTMO;
import com.black_dog20.tmo.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTMO extends Block {

	 public BlockTMO(Material material)
	    {
	        super(material);
	        this.setCreativeTab(CreativeTabTMO.TMO_TAB);
	    }

	    public BlockTMO()
	    {
	        this(Material.rock);
	    }

	    @Override
	    public String getUnlocalizedName()
	    {
	        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconRegister)
	    {
	        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	    }

	    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	    {
	        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	    }
}
