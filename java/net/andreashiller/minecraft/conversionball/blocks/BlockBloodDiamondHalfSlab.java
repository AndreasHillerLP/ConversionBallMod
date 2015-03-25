package net.andreashiller.minecraft.conversionball.blocks;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBloodDiamondHalfSlab extends BlockSlab {
	
	@SideOnly(Side.CLIENT)
	private IIcon SlabTop;
	
	@SideOnly(Side.CLIENT)
	private IIcon SlabSide;

	public BlockBloodDiamondHalfSlab(boolean fullblock, Material material) {
		super(fullblock, material);
		this.setBlockName("BlockBloodDiamondHalfSlab");
		if (!fullblock)
		{
			this.setCreativeTab(ConversionBall.tabConversionBall);
			setHarvestLevel("pickaxe", 2);
			setHardness(3.0F);
			setResistance(5.0F);
			setStepSound(Block.soundTypeStone);
		}
		
		this.setLightOpacity(0);
	}
	
	public IIcon getIcon(int side, int metadata) {
		return side == 1 ? this.SlabTop : side == 0 ? this.SlabTop : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(ConversionBall.MODID+":blockblooddiamondsolid");
		this.SlabTop = iconRegister.registerIcon(ConversionBall.MODID+":blockblooddiamondsolid");
		this.SlabSide = iconRegister.registerIcon(ConversionBall.MODID+":blockblooddiamondsolid");
	}

	@Override
	public String func_150002_b(int var1) {
		return super.getUnlocalizedName();
	}

}
