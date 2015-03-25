package net.andreashiller.minecraft.conversionball.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.andreashiller.minecraft.conversionball.items.ItemBloodDiamond;
import net.andreashiller.minecraft.conversionball.items.ItemBloodDiamondArmor;
import net.andreashiller.minecraft.conversionball.items.ItemBloodDiamondAxe;
import net.andreashiller.minecraft.conversionball.items.ItemBloodDiamondHoe;
import net.andreashiller.minecraft.conversionball.items.ItemBloodDiamondPickAxe;
import net.andreashiller.minecraft.conversionball.items.ItemBloodDiamondSpade;
import net.andreashiller.minecraft.conversionball.items.ItemBloodDiamondSword;
import net.andreashiller.minecraft.conversionball.items.ItemConversionBall;
import net.andreashiller.minecraft.conversionball.items.ItemConversionWand;
import net.andreashiller.minecraft.conversionball.items.ItemRedCoal;
import net.minecraft.item.Item;

public class ItemHandler {

	// -- DECLARATION ITEMS -------------------------------------------------------------------------------------------------	
	
	public static Item itemBloodDiamond;
	public static Item itemConversionBall;
	public static Item itemConversionWand;
	public static Item itemBloodDiamondAxe;
	public static Item itemBloodDiamondPickAxe;
	public static Item itemBloodDiamondSpade;
	public static Item itemBloodDiamondHoe;
	public static Item itemBloodDiamondSword;
	public static Item itemBloodDiamondHelmet;
	public static Item itemBloodDiamondChestplate;
	public static Item itemBloodDiamondLeggings;
	public static Item itemBloodDiamondBoots;
	public static Item itemRedCoal;
		
	// Create new Items
	public static void createNewItems() {
		itemBloodDiamond = new ItemBloodDiamond();
		itemConversionBall = new ItemConversionBall();
		itemConversionWand = new ItemConversionWand();
		itemBloodDiamondAxe = new ItemBloodDiamondAxe(ConversionBall.BloodDiamondToolMaterial);
		itemBloodDiamondPickAxe = new ItemBloodDiamondPickAxe(ConversionBall.BloodDiamondToolMaterial);
		itemBloodDiamondSpade = new ItemBloodDiamondSpade(ConversionBall.BloodDiamondToolMaterial);
		itemBloodDiamondHoe = new ItemBloodDiamondHoe(ConversionBall.BloodDiamondToolMaterial);
		itemBloodDiamondSword = new ItemBloodDiamondSword(ConversionBall.BloodDiamondToolMaterial);
		itemBloodDiamondHelmet = new ItemBloodDiamondArmor(ConversionBall.BloodDiamondArmorMaterial, ConversionBall.helmetID, 0).setUnlocalizedName("ItemBloodDiamondHelmet");
		itemBloodDiamondChestplate = new ItemBloodDiamondArmor(ConversionBall.BloodDiamondArmorMaterial, ConversionBall.chestplateID, 1).setUnlocalizedName("ItemBloodDiamondChestplate");
		itemBloodDiamondLeggings = new ItemBloodDiamondArmor(ConversionBall.BloodDiamondArmorMaterial, ConversionBall.leggingsID, 2).setUnlocalizedName("ItemBloodDiamondLeggings");
		itemBloodDiamondBoots = new ItemBloodDiamondArmor(ConversionBall.BloodDiamondArmorMaterial, ConversionBall.bootsID, 3).setUnlocalizedName("ItemBloodDiamondBoots");
		itemRedCoal = new ItemRedCoal();
	}	
	
	// Register Items
	public static void registerNewItems() {
		GameRegistry.registerItem(itemBloodDiamond, "ItemBloodDiamond");
		GameRegistry.registerItem(itemConversionBall, "ItemConversionBall");
		GameRegistry.registerItem(itemConversionWand, "ItemConversionWand");
		GameRegistry.registerItem(itemBloodDiamondAxe, "ItemBloodDiamondAxe");
		GameRegistry.registerItem(itemBloodDiamondPickAxe, "ItemBloodDiamondPickAxe");
		GameRegistry.registerItem(itemBloodDiamondSpade, "ItemBloodDiamondSpade");
		GameRegistry.registerItem(itemBloodDiamondHoe,"ItemBloodDiamondHoe");
		GameRegistry.registerItem(itemBloodDiamondSword, "ItemBloodDiamondSword");
		GameRegistry.registerItem(itemBloodDiamondHelmet, "ItemBloodDiamondHelment");
		GameRegistry.registerItem(itemBloodDiamondChestplate, "ItemBloodDiamondChestplate");
		GameRegistry.registerItem(itemBloodDiamondLeggings, "ItemBloodDiamondLeggings");
		GameRegistry.registerItem(itemBloodDiamondBoots, "ItemBloodDiamondBoots");
		GameRegistry.registerItem(itemRedCoal, "ItemRedCoal");
	}
	
}