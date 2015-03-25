package net.andreashiller.minecraft.conversionball.items;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemConversionBall extends Item {
	public ItemConversionBall() {
		setCreativeTab(ConversionBall.tabConversionBall);
		setUnlocalizedName("ItemConversionBall");
		setTextureName(ConversionBall.MODID+":itemconversionball");
		setMaxStackSize(1);
		setMaxDamage(1999);
		setNoRepair();
	}
}
