package net.andreashiller.minecraft.conversionball.blocks;

import java.util.Random;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.andreashiller.minecraft.conversionball.handlers.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockRedCoal extends Block {

	public BlockRedCoal(Material material) {
		super(material);
		setCreativeTab(ConversionBall.tabConversionBall);
		setBlockName("BlockRedCoal");
		setBlockTextureName(ConversionBall.MODID+":"+"blockredcoal");
		setHarvestLevel("pickaxe", 1);
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(soundTypeStone);
	}

	public int quantityDropped(Random random)
    {
        return random.nextInt(4);
    }

	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return ItemHandler.itemRedCoal;
	}
	
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 1);
	}
}
