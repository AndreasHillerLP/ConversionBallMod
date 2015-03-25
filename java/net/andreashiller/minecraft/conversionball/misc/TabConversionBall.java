package net.andreashiller.minecraft.conversionball.misc;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.andreashiller.minecraft.conversionball.handlers.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TabConversionBall extends CreativeTabs {
	public TabConversionBall(int id, String name) {
		super(id, name);
	}
	
	@Override
	public Item getTabIconItem() {
		return ItemHandler.itemConversionBall;
	}
}