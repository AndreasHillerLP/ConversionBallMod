package net.andreashiller.minecraft.conversionball.items;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.andreashiller.minecraft.conversionball.handlers.ItemHandler;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;


public class ItemBloodDiamondHoe extends ItemHoe {

	public ItemBloodDiamondHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(ConversionBall.tabConversionBall);
		setUnlocalizedName("ItemBloodDiamondHoe");
		setTextureName(ConversionBall.MODID+":itemblooddiamondhoe");
		canRepair = true;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1, ItemStack par2)
    {
        return ItemHandler.itemBloodDiamond == par2.getItem() ? true : super.getIsRepairable(par1, par2);
    }

}
