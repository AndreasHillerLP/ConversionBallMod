package net.andreashiller.minecraft.conversionball.blocks;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBloodDiamondSolid extends Block {

	public BlockBloodDiamondSolid(Material material) {
		super(material);
		setCreativeTab(ConversionBall.tabConversionBall);
		setBlockName("BlockBloodDiamondSolid");
		setStepSound(Block.soundTypeStone);
		setBlockTextureName(ConversionBall.MODID+":blockblooddiamondsolid");
		setHarvestLevel("pickaxe", 2);
		setHardness(3.0F);
		setResistance(5.0F);
	}

}
