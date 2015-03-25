package net.andreashiller.minecraft.conversionball.items;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.minecraft.item.Item;

public class ItemBloodDiamond extends Item {
	public ItemBloodDiamond() {
		setCreativeTab(ConversionBall.tabConversionBall);
		setUnlocalizedName("ItemBloodDiamond");
		setTextureName(ConversionBall.MODID+":itemblooddiamond");
		setMaxStackSize(64);
	}
}
