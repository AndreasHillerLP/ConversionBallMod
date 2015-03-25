package net.andreashiller.minecraft.conversionball.items;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.andreashiller.minecraft.conversionball.handlers.ItemHandler;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemBloodDiamondSpade extends ItemSpade {

	public ItemBloodDiamondSpade(ToolMaterial material) {
		super(material);
		setCreativeTab(ConversionBall.tabConversionBall);
		setUnlocalizedName("ItemBloodDiamondSpade");
		setTextureName(ConversionBall.MODID+":itemblooddiamondspade");
		canRepair = true;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1, ItemStack par2)
    {
        return ItemHandler.itemBloodDiamond == par2.getItem() ? true : super.getIsRepairable(par1, par2);
    }
	
}
