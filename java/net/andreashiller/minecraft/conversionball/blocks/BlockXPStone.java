package net.andreashiller.minecraft.conversionball.blocks;

import java.util.Random;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockXPStone extends Block {

	public BlockXPStone(Material material) {
		super(material);
		setCreativeTab(ConversionBall.tabConversionBall);
		setBlockName("BlockXPStone");
		setBlockTextureName("minecraft:stone");
		setHarvestLevel("pickaxe", 0);
		setHardness(2.0F);
		setResistance(2.0F);
		setStepSound(soundTypeStone);
	}

	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 1);
	}
	
	public Item getItemDropped(int i, Random par2Random, int j) {
		return Item.getItemFromBlock(Blocks.cobblestone);
	}
}