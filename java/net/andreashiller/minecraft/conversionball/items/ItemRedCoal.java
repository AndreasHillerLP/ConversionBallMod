package net.andreashiller.minecraft.conversionball.items;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.minecraft.item.Item;

public class ItemRedCoal extends Item {
	public ItemRedCoal() {
		setCreativeTab(ConversionBall.tabConversionBall);
		this.setUnlocalizedName("ItemRedCoal");
		this.setMaxDamage(64);
		this.setTextureName(ConversionBall.MODID+":"+"itemredcoal");
	}
}
