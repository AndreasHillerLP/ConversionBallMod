package net.andreashiller.minecraft.conversionball;

import java.util.Random;

import net.andreashiller.minecraft.conversionball.handlers.BlockHandler;
import net.andreashiller.minecraft.conversionball.handlers.CraftingHandler;
import net.andreashiller.minecraft.conversionball.handlers.DropHandler;
import net.andreashiller.minecraft.conversionball.handlers.FuelHandler;
import net.andreashiller.minecraft.conversionball.handlers.ItemHandler;
import net.andreashiller.minecraft.conversionball.handlers.MainWorldGen;
import net.andreashiller.minecraft.conversionball.handlers.RecipeHandler;
import net.andreashiller.minecraft.conversionball.misc.CBEventListener;
import net.andreashiller.minecraft.conversionball.misc.TabConversionBall;
import net.andreashiller.minecraft.conversionball.misc.Version;
import net.andreashiller.minecraft.conversionball.proxies.ServerProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=ConversionBall.MODID, name=ConversionBall.NAME, version=ConversionBall.VERSION)
public class ConversionBall {
	public static final String MODID = "conversionball";
	public static final String NAME = "ConversionBall Mod";
	public static final String VERSION = "1.0.0";
	public static final int Version = 100;
	
	public static Random cookAmout;
	
	@Instance(value=ConversionBall.MODID)
	public static ConversionBall instance;
	
	@SidedProxy(clientSide="net.andreashiller.minecraft.conversionball.proxies.ClientProxy", serverSide="net.andreashiller.minecraft.conversionball.proxies.ServerProxy")
	public static ServerProxy proxy;
	
	// DECLARE CREATIVETAB
	public static CreativeTabs tabConversionBall = new TabConversionBall(CreativeTabs.getNextID(),"TabConversionBall");
	
	// WORLDGENERATOR
	public static MainWorldGen WorldGen = new MainWorldGen();	
	
	// -- DECLARATION TOOL MATERIALS ----------------------------------------------------------------------------------------
	
	public static ToolMaterial BloodDiamondToolMaterial = EnumHelper.addToolMaterial("BloodDiamondToolMaterial", 3, 3000, 10F, 8F, 30);
			
	// -- DECLARATION ARMOR MATERIAL ----------------------------------------------------------------------------------------
		
	public static ArmorMaterial BloodDiamondArmorMaterial = EnumHelper.addArmorMaterial("BloodDiamondArmorMaterial", 70, new int[]{3, 10, 9, 6}, 30);
		
	// -- DECLARATION ARMOR ID's --------------------------------------------------------------------------------------------
	
	public static int helmetID;
	public static int chestplateID;
	public static int leggingsID;
	public static int bootsID;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ItemHandler.createNewItems();
		BlockHandler.createNewBlocks();
	}
	
	@EventHandler 
	public void Init(FMLInitializationEvent event) {
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		MinecraftForge.EVENT_BUS.register(new DropHandler());
		GameRegistry.registerFuelHandler(new FuelHandler());
		GameRegistry.registerWorldGenerator(WorldGen, 1);
		CBEventListener eventListener = new CBEventListener();
		FMLCommonHandler.instance().bus().register(eventListener);
		ItemHandler.registerNewItems();
		BlockHandler.registerNewBlocks();
		RecipeHandler.registerShaplessRecipes();
		RecipeHandler.registerShapedRecipes();
		RecipeHandler.registerSpecialRecipes();
		RecipeHandler.registerSmeltingRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		new Version();
	}

}