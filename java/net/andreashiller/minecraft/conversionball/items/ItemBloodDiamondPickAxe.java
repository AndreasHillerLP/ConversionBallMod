package net.andreashiller.minecraft.conversionball.items;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.andreashiller.minecraft.conversionball.handlers.ItemHandler;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemBloodDiamondPickAxe extends ItemPickaxe {

	public ItemBloodDiamondPickAxe(ToolMaterial material) {
		super(material);
		setCreativeTab(ConversionBall.tabConversionBall);
		setUnlocalizedName("ItemBloodDiamondPickAxe");
		setTextureName(ConversionBall.MODID+":itemblooddiamondpickaxe");
		canRepair = true;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1, ItemStack par2)
    {
        return ItemHandler.itemBloodDiamond == par2.getItem() ? true : super.getIsRepairable(par1, par2);
    }

}
