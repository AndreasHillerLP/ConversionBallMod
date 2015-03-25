package net.andreashiller.minecraft.conversionball.items;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.andreashiller.minecraft.conversionball.handlers.ItemHandler;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;



public class ItemBloodDiamondArmor extends ItemArmor {

	public ItemBloodDiamondArmor(ArmorMaterial material, int id,int placement) {
		super(material, id, placement);
		this.setCreativeTab(ConversionBall.tabConversionBall);
		
		if(placement == 0) {
			this.setTextureName(ConversionBall.MODID+":itemblooddiamondhelmet");
		}
		else if(placement == 1) {
			this.setTextureName(ConversionBall.MODID+":itemblooddiamondchestplate");
		}
		else if(placement == 2) {
			this.setTextureName(ConversionBall.MODID+":itemblooddiamondleggings");
		}
		else if(placement == 3) {
			this.setTextureName(ConversionBall.MODID+":itemblooddiamondboots");
		}
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == ItemHandler.itemBloodDiamondHelmet || stack.getItem() == ItemHandler.itemBloodDiamondChestplate || stack.getItem() == ItemHandler.itemBloodDiamondBoots) {
			return ConversionBall.MODID + ":" + "textures/models/armor/blooddiamond_layer_1.png";
		}
		if(stack.getItem() == ItemHandler.itemBloodDiamondLeggings) {
			return ConversionBall.MODID + ":" + "textures/models/armor/blooddiamond_layer_2.png";
		}
		else {
			return null;
		}
	}

}
