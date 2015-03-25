package net.andreashiller.minecraft.conversionball.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.andreashiller.minecraft.conversionball.blocks.BlockBloodDiamondHalfSlab;
import net.andreashiller.minecraft.conversionball.blocks.BlockBloodDiamondOre;
import net.andreashiller.minecraft.conversionball.blocks.BlockBloodDiamondSolid;
import net.andreashiller.minecraft.conversionball.blocks.BlockBloodDiamondStairs;
import net.andreashiller.minecraft.conversionball.blocks.BlockRedCoal;
import net.andreashiller.minecraft.conversionball.blocks.BlockXPStone;
import net.andreashiller.minecraft.conversionball.items.ItemBloodDiamondSlab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHandler {
	
	// -- DECLARATION BLOCKS ------------------------------------------------------------------------------------------------
	public static Block blockBloodDiamondOre;
	public static Block blockBloodDiamondSolid;
	public static Block blockBloodDiamondStairs;
	public static Block blockBloodDiamondHalfSlab;
	public static Block blockBloodDiamondDoubleSlab;
	public static Block blockRedCoal;
	public static Block blockXPStone;
	
	// Create new Blocks
	public static void createNewBlocks() {
		blockBloodDiamondOre = new BlockBloodDiamondOre(Material.rock);
		blockBloodDiamondSolid = new BlockBloodDiamondSolid(Material.rock);
		blockBloodDiamondStairs = new BlockBloodDiamondStairs(blockBloodDiamondSolid);
		blockBloodDiamondHalfSlab = new BlockBloodDiamondHalfSlab(false, Material.rock);
		blockBloodDiamondDoubleSlab = new BlockBloodDiamondHalfSlab(true, Material.rock);
		blockRedCoal = new BlockRedCoal(Material.rock);
		blockXPStone = new BlockXPStone(Material.rock);
	}
	
	// Register Blocks
	public static void registerNewBlocks() {
		GameRegistry.registerBlock(blockBloodDiamondOre, "BlockBloodDiamondOre");
		GameRegistry.registerBlock(blockBloodDiamondSolid, "BlockBloodDiamondSolid");
		GameRegistry.registerBlock(blockBloodDiamondStairs, "BlockBloodDiamondStairs");
		GameRegistry.registerBlock(blockBloodDiamondHalfSlab, ItemBloodDiamondSlab.class, "BlockBloodDiamondHalfSlab");
		GameRegistry.registerBlock(blockBloodDiamondDoubleSlab, ItemBloodDiamondSlab.class, "BlockBloodDiamondDoubleSlab");
		GameRegistry.registerBlock(blockRedCoal, "BlockRedCoal");
		GameRegistry.registerBlock(blockXPStone, "BlockXPStone");
	}
}